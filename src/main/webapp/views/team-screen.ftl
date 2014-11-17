<!DOCTYPE html>
<html lang="en">
<head >
<meta charset="UTF-8" />
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<meta content="width=device-width, initial-scale=1.0" name="viewport" />
<meta content="" name="description" />
<title>Giant Rocket</title>
<link href="http://puu.sh/8JT1a.png" rel="shortcut icon" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,600,700,800,300' rel='stylesheet' type='text/css'>
<link href="/css/bootstrap.min.css" rel="stylesheet" />
<link href="/css/font-awesome.min.css" rel="stylesheet" />
<!-- Custom styles for our template -->
<link href="css/bootstrap-theme.css" media="screen"
	rel="stylesheet" />
<link href="/css/main.css" rel="stylesheet" />
<link href="/css/custom-main.css" rel="stylesheet"/>
<link href="/css/parallax.css" rel="stylesheet" />
<link href="/css/jsplumb.css" rel="stylesheet" />
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
	<script src="assets//js/html5shiv.js"></script>
	<script src="assets//js/respond.min.js"></script>
	<![endif]-->
</head>
<body id="body">
		<!-- Google Analytics -->
	<!-- <?php include_once("analyticstracking.php") ?> -->
	<!-- /Google Analytics -->

	<div class="navbar navbar-inverse navbar-fixed-top headroom not-map">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="/"><img
					src="http://i.imgur.com/dYfCy3V.png"></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li><a href="/">Fechas</a></li>
					<li><a href="/">Lugar</a></li>
					<li><a href="/">Equipos</a></li>
					<li><a href="/">Premios</a></li>
					<li><a href="/team">Inscripción al torneo</a></li>
					<!--<li><a href="">Torneos Anteriores</a></li>
					<li><a href="">Quienes Somos</a></li>
					<li><a href="">Preguntas Frecuentes</a></li>-->
				</ul>
			</div>
		</div>
	</div>
	<header id="head">
		<div class="container not-map">
			<div class="row">
				<img class="header-logo" src="http://i.imgur.com/ze7FE4z.png" />
				<h1 class="lead">
					<img src="https://i.imgur.com/wQabEMq.png" />
				</h1>
				<h2>Gaming events by gamers</h2>	
			</div>
		</div>
	</header>
	
	<div class="container-fluid">
	    	<div class="row">
	    		<div class="col-sm-3 text-left">
	    		</div>
				<div class="col-sm-6 text-center title-and-epigraph">
					<h1 class="team-title">EQUIPOS PARTICIPANTES</h1>
					<h3 class="team-epigraph">Noviembre 2014</h3>
				</div>
	    		<div class="col-sm-3 text-left">
	    		</div>
			</div>
		</div>
		<div class="teams-section">
			<#list teams as team>
			<div class="container-fluid">
				<div class="row">
					<div class="col-sm-3 text-left">
	    			</div>
	    			<div class="col-sm-6 text-center">
						<div class="team-card">
							<div class="row">
							<h3>${team.name}</h3>
							</div>
							<div class="row card-content">
									<div class='col-sm-4'>
										<img src="${team.smallPicture}" alt="" class="teamImage">
									</div>
									<div class="column playerColumn col-sm-4 text-left">
										<ul>
											<li>EQUIPO</li>
											<li><span>Game tag: </span><b>${team.tag}</b></li>
											<#if team.shortFacebook != "">
											<li><span>Facebook: </span><a class="teamSocial" target="_blank" href="${team.facebook}">${team.shortFacebook}</a></li>
											</#if>
											<#if team.shortTwitter != "">
											<li><span>Twitter: </span><a class="teamSocial" target="_blank" href="${team.twitter}">${team.shortTwitter}</a></li>
											</#if>
										</ul>
									</div>
									<div class="column playerColumn col-sm-4 text-left">
										<ul>
											<li>JUGADORES</li>
											<li><span>${team.tag}.</span><b>${team.players[0].nick}</b></li>
											<li><span>${team.tag}.</span><b>${team.players[1].nick}</b></li>
											<li><span>${team.tag}.</span><b>${team.players[2].nick}</b></li>
											<li><span>${team.tag}.</span><b>${team.players[3].nick}</b></li>
											<li><span>${team.tag}.</span><b>${team.players[4].nick}</b></li>
										</ul>
									</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			</#list>
		</div>			
	<footer>
		<div class="main-footer">
			<div class="social">
				<p>CONTACTANOS</p>
				<ul>
					<li> <a href="https://twitter.com/GiantRocket" target="_blank"><img src="http://i.imgur.com/BvYcIdN.png"/> </a></li>
					<li> <a href="https://www.facebook.com/giantrocket" target="_blank"><img src="http://i.imgur.com/gaemO2U.png"/></a></li>
					<li> <a href="mailto:staff@giantrocket.com.ar" target="_blank"><img src="http://i.imgur.com/Idxn638.png"/></a></li>
				</ul>
			</div>
			<div class="giant-rocket">
				<ul>
					<li><img style="width:50px;" src="http://i.imgur.com/Ultx2gD.png"/></li>
					<li><img style="width:150px;" src="http://i.imgur.com/wQabEMq.png"/></li>
				<ul></ul>
				<p>Gaming Events by Gamers</p>
			</div>
		</div>
		<div class="credits">
			<p>Copyright © 2014, Giant Rocket. Designed and coded with love by @marcosreves, @iumaycallmev, @emecibelli and @sergiofruto.</p>
		</div>
	</footer>
	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
	<!-- Google Maps -->
    <script src="http://maps.googleapis.com/maps/api/js?v=3.14&(KEY=AIzaSyAFsgkhp6VN6jEFwNomU_tIOUorPEhNTRY)&sensor=false"></script>
</body>	
</html>