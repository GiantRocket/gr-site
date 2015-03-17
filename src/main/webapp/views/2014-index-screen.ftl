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
<link href="css/bootstrap.min.css" rel="stylesheet" />
<link href="css/font-awesome.min.css" rel="stylesheet" />
<!-- Custom styles for our template -->
<link href="css/bootstrap-theme.css" media="screen"
	rel="stylesheet" />
<link href="css/main.css" rel="stylesheet" />
<link href="css/custom-main.css" rel="stylesheet"/>
<link href="/css/parallax.css" rel="stylesheet" />

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
					<li><a href="/">Inicio</a></li>
					<li><a href="/fixture">Fixture</a></li>
					<li><a href="/show/teams">Equipos</a></li>
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
	<div class="shortcuts-section not-map">
		<div class="container">
			<div class="row">
				<h2>GIANT ROCKET LEAGUE</h2>
				<h3>TORNEO DE DOTA 2</h3>
			</div>
			<div class="shortcut-icons">
				<ul class="icons-list">
					<li><a class="dates-ref" href=""> <div class="icon-container fechas"></div> <p>FECHAS<p> </a></li>
					<li><a class="places-ref" href=""> <div class="icon-container lugar"></div><p>LUGAR<p> </a></li>
					<li><a class="teams-ref" href=""> <div class="icon-container equipos"></div><p>EQUIPOS<p> </a></li>
					<!--<li><a href=""> <div class="icon-container partidas"></div><p>PARTIDAS<p> </a></li>-->
					<li><a class="prize-ref"  href=""> <div class="icon-container premios"></div><p>PREMIOS<p> </a></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="dates-section" class="fechas-section not-map">
		<div class="container">
			<div class="row">
				<div class="section-header">
					<p class="title">FECHAS</p>
				</div>
				<div class="fechas-content">
					<div class="etapa-left">
						<div class="etapa-content">
							<img src="http://i.imgur.com/ax7ID1Y.png"/>
							<p class="etapa-title">Etapa Online</p>
							<ul class="fechas-list">
								<li>
									<p class="head">Clasificatorias</p>
									<ul>
										<li>Lunes 17/11 a Viernes 21/11 - 22hs</li>
										<li>Sábado 22/11 - 18hs</li>
										<li>Domingo 23/11 - 18hs</li>
										<li>Lunes 24/11 - 22hs</li>
									</ul>
								</li>
								<li>
									<p class="head">Octavos</p>
									<ul>
										<li>Martes 25/11 a Viernes 28/11 - 22hs</li>
									</ul>
								</li>
							</ul>
						</div>
					</div>
					<div class="etapa-right">	
						<div class="etapa-content">
							<img src="http://i.imgur.com/tSfS5zT.png"/>
							<p class="etapa-title">Etapa Presencial</p>
							<ul class="fechas-list">
								<li>
									<p class="head">Semifinales<p>
									<ul>
										<li>Sábado 29/11 - 13hs a 19hs</li>
									</ul>
								</li>
								<li>
									<p class="head">Tercer Puesto<p>
									<ul>
										<li>Domingo 30/11 - 13hs a 15hs</li>
									</ul>
								</li>
								<li>
									<p class="head">Final<p>
									<ul>
										<li>Domingo 30/11 - 15hs a 19hs</li>
									</ul>
								</li>
							</ul>
						</div>
					</div>	
				</div>
			</div>
		</div>
	</div>
	<div id="places-section" class="lugar-section">
		<div class="container">
			<div class="row">
				<div class="section-header not-map">
					<p class="title">LUGAR</p>
				</div>
				<div class="lugar-content">
					<div class="lugar-foto not-map">
						<div class="direccion">
							<a href="https://www.facebook.com/TecnoBarARG" target="_blank">TECNOBAR - Fitz Roy 2021</a>
						</div>
					</div>
					<div class="map">
						<div id="map-frame"class="map-frame">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="teams-section" class="equipos-section not-map">
		<div class="container">
			<div class="row">
				<div class="section-header">
					<p class="title">EQUIPOS</p>
				</div>
				<#list teams as team>
				<div class="col-sm-8ths text-left">
				<img style="width:100%;" src=${team.smallPicture} />
				</div>
				</#list>
				<!--
				<div class="equipos-content">
					<div class="equipos-foto">
						<div class="inscripcion">
							<div class="inscripcion-message"><p>¿Querés participar de nuestro torneo?</p></div>
							<a href="http://giantrocket.com.ar/show/teams" target="_blank" class="inscribe-button">¡Inscribite acá!</a>
						</div>
					</div>
				</div>
				-->
			</div>
			<div class="row">
				<div class="col-sm-5">
				</div>
				<div class="col-sm-2 text-center">
					<div class="show-teams-button-container">
					<a href="http://giantrocket.com.ar/show/teams" class="teams-button">Ver equipos</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="prize-section" class="premios-section not-map">
		<div class="container">
			<div class="row">
				<div class="section-header">
					<p class="title">PREMIOS</p>
				</div>
				<div class="premios-content">
					<div class="datos">
						<p class="list-title">ALGUNOS DATOS</p>
						<ul>
							<li>Premio base primer puesto:$5000</br>Premio base segundo puesto:$4000</br>Premio base tercer puesto:$1000</li>
							<li>El 40% del valor de entradas y tickets incrementa el pozo acumulado</li>
							<li>El evento presencial contará con una tienda y se sortearán items entre el público</li>
						</ul>
					</div>
					<div class="pozo">
						<p class="list-title">POZO ACTUAL</p>
						<div class="valor-pozo"><p>$10.000</p></div>
						<p class="small-text">¡La compra de tickets y entradas incrementa el pozo!</p>
						<p class="list-title">TICKET INGAME</p>
						<p class="small-text">¡Disponible en noviembre!</p>
						<img style="width:150px;" src="http://i.imgur.com/bsg1Jcj.png"/>
					</div>
					<div class="donde-comprar">
						<p class="list-title">DONDE COMPRAR</p>
						<ul>
							<li>Las entradas anticipadas pueden comprarse en Tecnobar</li>
							<li>El valor de la entrada incluye una consumisión</li>
							<li>Anticipadas: $60 un día, $90 los dos días</br>El día del evento: $70 un día, $100 los dos días</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
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
    <script src="/js/google-map.js"></script>
    <script src="/js/jquery.scrollTo.min.js"></script>
    <script src="/js/home-map.js"></script>
    <script src="/js/match.js"></script>
	<script>
		$(document).ready(function() {
		
		$('.dates-ref').click(function(e){
			e.preventDefault();
			$('body').scrollTo($('#dates-section'));
		});
		
		$('.places-ref').click(function(e){
			e.preventDefault();
			$('body').scrollTo($('#places-section'));
		});
		
		$('.prize-ref').click(function(e){
			e.preventDefault();
			$('body').scrollTo($('#prize-section'));
		});
		
		$('.games-ref').click(function(e){
			e.preventDefault();
			$('body').scrollTo($('#games-section'));
		});
		
		$('.teams-ref').click(function(e){
			e.preventDefault();
			$('body').scrollTo($('#teams-section'));
		});
		
		loadHomeMap();
	});
	</script>
</body>	
</html>