package com.giantrocket.site;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.server.ssl.SslSocketConnector;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.springframework.web.servlet.DispatcherServlet;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class App {    
	private static String CONFIG_FILE_PATH = "conf/startup.conf";
    
    public static void main(String[] args) throws Exception {

        Config root = ConfigFactory.load(CONFIG_FILE_PATH);
        Config server = root.getConfig("server");     
        ContextHandlerCollection contexts = getDispatcherServletsContext(server);

        Server s = new Server();
        s.setConnectors(getConnectorsArray(server));
        s.setHandler(contexts);

        s.start();
    }

    private static Connector getConnector(Config conn) {
    	Connector connector;
    	
    	if (conn.hasPath("ssl") && conn.getBoolean("ssl")) {    		    		
    		SslContextFactory sslContextFactory = new SslContextFactory(conn.getString("keystore_path"));
    		sslContextFactory.setKeyStorePassword(conn.getString("keystore_password"));
    		connector = new SslSocketConnector(sslContextFactory);    		
        } else {
        	connector = new SelectChannelConnector();
        }         
        connector.setPort(conn.getInt("port"));
        if (conn.hasPath("header_size")) {            
            connector.setRequestHeaderSize(conn.getInt("header_size"));
        }               

        return connector;
    }
    
    private static Connector[] getConnectorsArray(Config server){    	
    	List<Connector> connectors = new ArrayList<Connector>();
    	for (Config c : server.getConfigList("connectors")) {
    		connectors.add(getConnector(c));
    	}
    	
    	return (Connector[]) connectors.toArray(new Connector[connectors.size()]);
    }
    
    private static ContextHandlerCollection getDispatcherServletsContext(Config server) {
        ContextHandlerCollection contexts = new ContextHandlerCollection();

        for (Config c : server.getConfigList("dispatcher_servlets")) {
            DispatcherServlet dispatcherServlet = new DispatcherServlet();
            dispatcherServlet.setContextConfigLocation(c.getString("context_location"));
            dispatcherServlet.setDispatchOptionsRequest(true);

            ServletHolder servletHolder = new ServletHolder(dispatcherServlet);

            for (Object relativePath : c.getAnyRefList("paths")) {
                ServletContextHandler servletHandler = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
                servletHandler.setContextPath(relativePath.toString());

                servletHandler.addServlet(servletHolder, "/*");
                contexts.addHandler(servletHandler);
            }
        }

        return contexts;
    }
}

