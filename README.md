# Giant Rocket Site

para iniciar:
- release: mvn release:prepare release:perform -Darguments='-Dmaven.test.skip=true'
- crear una carpeta, copiando el .jar y la carpeta lib generada en el release [1]
- crear carpeta "conf" con los archivos startup.conf y local.properties (con los valores para los properties en blanco de configuration.properties)
- iniciar app: java -cp site-2.X.jar:lib/*:. com.giantrocket.site.App (reemplazar X por la version releaseada)

[1]: si no se modificaron dependencias alcanza con solo copiar el jar

Giant rocket application to manage teams
