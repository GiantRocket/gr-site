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
	<link href="/css/jsplumb.css" rel="stylesheet" />
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
	<div class="container-fluid">
		<div class="row title-row">
			<div class="col-sm-3 text-left">
			</div>
			<div class="col-sm-6 text-center title-and-epigraph">
				<h1 class="super-title">Fixture</h1>
				<h3 class="epigraph">¡Segui todo los resultados!</h1>
			</div>
			<div class="col-sm-3 text-left">
			</div>
		</div>
	</div>
	<div id="fixture-section" class="equipos-section not-map">
		<div class="container">
			<div class="row">
				<div class="section-header">
					<p class="title">UPPER BRACKET</p>
				</div>
				<div id="fixture-content" class="equipos-content">
					<div class="col-sm-2 text-center">
						<div id="match-a" class='fixture-box match' value="a">
						<span class="match-id">A</span><br>
							<#if matches["A"]??>
								<span>
									<b <#if matches["A"].winner?? && matches["A"].winner == matches["A"].teamA>class="match-winner"</#if>>${matches["A"].teamA}</b> vs <b <#if matches["A"].winner?? && matches["A"].winner == matches["A"].teamB>class="match-winner"</#if>>${matches["A"].teamB}</b>
								</span><br>
								<span>${matches["A"].date}</span>
							<#else>
								<span>Octavos 1</span><br>
								<span>Lunes 17/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-b" class='fixture-box match' value="b">
						<span class="match-id">B</span><br>
							<#if matches["B"]??>
								<span><b <#if matches["B"].winner?? && matches["B"].winner == matches["B"].teamA>class="match-winner"</#if>>${matches["B"].teamA}</b> vs <b <#if matches["B"].winner?? && matches["B"].winner == matches["B"].teamB>class="match-winner"</#if>>${matches["B"].teamB}</b></span><br>
								<span>${matches["B"].date}</span>
							<#else>
								<span>Octavos 2</span><br>
								<span>Martes 18/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-c" class='fixture-box match'>
						<span class="match-id">C</span><br>
							<#if matches["C"]??>
								<span><b <#if matches["C"].winner?? && matches["C"].winner == matches["C"].teamA>class="match-winner"</#if>>${matches["C"].teamA}</b> vs <b <#if matches["C"].winner?? && matches["C"].winner == matches["C"].teamB>class="match-winner"</#if>>${matches["C"].teamB}</b></span><br>
								<span>${matches["C"].date}</span>
							<#else>
								<span>Octavos 3</span><br>
								<span>Miercoles 19/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-d" class='fixture-box match'>
						<span class="match-id">D</span><br>
							<#if matches["D"]??>
								<span><b <#if matches["D"].winner?? && matches["D"].winner == matches["D"].teamA>class="match-winner"</#if>>${matches["D"].teamA}</b> vs <b <#if matches["D"].winner?? && matches["D"].winner == matches["D"].teamB>class="match-winner"</#if>>${matches["D"].teamB}</b></span><br>
								<span>${matches["D"].date}</span>
							<#else>
								<span>Octavos 4</span><br>
								<span>Jueves 20/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-e" class='fixture-box match'>
						<span class="match-id">E</span><br>
							<#if matches["E"]??>
								<span><b <#if matches["E"].winner?? && matches["E"].winner == matches["E"].teamA>class="match-winner"</#if>>${matches["E"].teamA}</b> vs <b <#if matches["E"].winner?? && matches["E"].winner == matches["E"].teamB>class="match-winner"</#if>>${matches["E"].teamB}</b></span><br>
								<span>${matches["E"].date}</span>
							<#else>
								<span>Octavos 5</span><br>
								<span>Viernes 21/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-f" class='fixture-box match'>
						<span class="match-id">F</span><br>
							<#if matches["F"]??>
								<span><b <#if matches["F"].winner?? && matches["F"].winner == matches["F"].teamA>class="match-winner"</#if>>${matches["F"].teamA}</b> vs <b <#if matches["F"].winner?? && matches["F"].winner == matches["F"].teamB>class="match-winner"</#if>>${matches["F"].teamB}</b></span><br>
								<span>${matches["F"].date}</span>
							<#else>
								<span>Octavos 6</span><br>
								<span>Sabado 22/11 18:00hs</span>
							</#if>
						</div>
						<div id="match-g" class='fixture-box match'>
						<span class="match-id">G</span><br>
							<#if matches["G"]??>
								<span><b <#if matches["G"].winner?? && matches["G"].winner == matches["G"].teamA>class="match-winner"</#if>>${matches["G"].teamA}</b> vs <b <#if matches["G"].winner?? && matches["G"].winner == matches["G"].teamB>class="match-winner"</#if>>${matches["G"].teamB}</b></span><br>
								<span>${matches["G"].date}</span>
							<#else>
								<span>Octavos 7</span><br>
								<span>Sabado 22/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-h" class='fixture-box match'>
						<span class="match-id">H</span><br>
							<#if matches["H"]??>
								<span><b <#if matches["H"].winner?? && matches["H"].winner == matches["H"].teamA>class="match-winner"</#if>>${matches["H"].teamA}</b> vs <b <#if matches["H"].winner?? && matches["H"].winner == matches["H"].teamB>class="match-winner"</#if>>${matches["H"].teamB}</b></span><br>
								<span>${matches["H"].date}</span>
							<#else>
								<span>Octavos 8</span><br>
								<span>Domingo 23/11 18:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-i" class='fixture-box match'>
						<span class="match-id">I</span><br>
							<#if matches["I"]??>
								<span><b <#if matches["I"].winner?? && matches["I"].winner == matches["I"].teamA>class="match-winner"</#if>>${matches["I"].teamA}</b> vs <b <#if matches["I"].winner?? && matches["I"].winner == matches["I"].teamB>class="match-winner"</#if>>${matches["I"].teamB}</b></span><br>
								<span>${matches["I"].date}</span>
							<#else>
								<span>Ganadores <b>A</b> vs <b>B</b></span><br>
								<span>Lunes 24/11 22:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div id="match-j" class='fixture-box match'>
						<span class="match-id">J</span><br>
							<#if matches["J"]??>
								<span><b <#if matches["J"].winner?? && matches["J"].winner == matches["J"].teamA>class="match-winner"</#if>>${matches["J"].teamA}</b> vs <b <#if matches["J"].winner?? && matches["J"].winner == matches["J"].teamB>class="match-winner"</#if>>${matches["J"].teamB}</b></span><br>
								<span>${matches["J"].date}</span>
							<#else>
								<span>Ganadores <b>C</b> vs <b>D</b></span><br>
								<span>Martes 25/11 22:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div id="match-k" class='fixture-box match'>
						<span class="match-id">K</span><br>
							<#if matches["K"]??>
								<span><b <#if matches["K"].winner?? && matches["K"].winner == matches["K"].teamA>class="match-winner"</#if>>${matches["K"].teamA}</b> vs <b <#if matches["K"].winner?? && matches["K"].winner == matches["K"].teamB>class="match-winner"</#if>>${matches["K"].teamB}</b></span><br>
								<span>${matches["K"].date}</span>
							<#else>
								<span>Ganadores <b>E</b> vs <b>F</b></span><br>
								<span>Miercoles 26/11 22:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div id="match-l" class='fixture-box match'>
						<span class="match-id">L</span><br>
							<#if matches["L"]??>
								<span><b <#if matches["L"].winner?? && matches["L"].winner == matches["L"].teamA>class="match-winner"</#if>>${matches["L"].teamA}</b> vs <b <#if matches["L"].winner?? && matches["L"].winner == matches["L"].teamB>class="match-winner"</#if>>${matches["L"].teamB}</b></span><br>
								<span>${matches["L"].date}</span>
							<#else>
								<span>Ganadores <b>G</b> vs <b>H</b></span><br>
								<span>Jueves 27/11 22:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div class='fixture-air-box'>
						</div>
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-m" class='fixture-box match'>
						<span class="match-id">M</span><br>
							<#if matches["M"]??>
								<span><b <#if matches["M"].winner?? && matches["M"].winner == matches["M"].teamA>class="match-winner"</#if>>${matches["M"].teamA}</b> vs <b <#if matches["M"].winner?? && matches["M"].winner == matches["M"].teamB>class="match-winner"</#if>>${matches["M"].teamB}</b></span><br>
								<span>${matches["M"].date}</span>
							<#else>
								<span>Ganadores <b>I</b> vs <b>J</b></span><br>
								<span>Viernes 28/11 22:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div id="match-n" class='fixture-box match'>
						<span class="match-id">N</span><br>
							<#if matches["N"]??>
								<span><b <#if matches["N"].winner?? && matches["N"].winner == matches["N"].teamA>class="match-winner"</#if>>${matches["N"].teamA}</b> vs <b <#if matches["N"].winner?? && matches["N"].winner == matches["N"].teamB>class="match-winner"</#if>>${matches["N"].teamB}</b></span><br>
								<span>${matches["N"].date}</span>
							<#else>
								<span>Ganadores <b>K</b> vs <b>L</b></span><br>
								<span>Jueves 27/11 24:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
					</div>
					<div class="col-sm-3 text-center">
						<div class='fixture-air-box'>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-o" class='fixture-box match'>
						<span class="match-id">O</span><br>
							<#if matches["O"]??>
								<span><b <#if matches["O"].winner?? && matches["O"].winner == matches["O"].teamA>class="match-winner"</#if>>${matches["O"].teamA}</b> vs <b <#if matches["O"].winner?? && matches["O"].winner == matches["O"].teamB>class="match-winner"</#if>>${matches["O"].teamB}</b></span><br>
								<span>${matches["O"].date}</span>
							<#else>
								<span>Ganadores <b>M</b> vs <b>N</b></span><br>
								<span>Sabado 29/11 18:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-3 text-center">
						<div class='fixture-air-box'>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-p" class='fixture-box match'>
						<span class="match-id">P</span><br>
							<#if matches["P"]??>
								<span><b <#if matches["P"].winner?? && matches["P"].winner == matches["P"].teamA>class="match-winner"</#if>>${matches["P"].teamA}</b> vs <b <#if matches["P"].winner?? && matches["P"].winner == matches["P"].teamB>class="match-winner"</#if>>${matches["P"].teamB}</b></span><br>
								<span>${matches["P"].date}</span>
							<#else>
								<span>Ganadores <b>O</b> vs <b>AE</b></span><br>
								<span>Domingo 30/11 18:00hs</span>
							</#if>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div id="fixture-section" class="equipos-section not-map">
		<div class="container">
			<div class="row">
				<div class="section-header">
					<p class="title">LOWER BRACKET</p>
				</div>
				<div id="fixture-content" class="equipos-content">
					<div class="col-sm-2 text-center">
						<div id="match-r" class='fixture-box match' value="r">
						<span class="match-id">R</span><br>
							<#if matches["R"]??>
								<span><b <#if matches["R"].winner?? && matches["R"].winner == matches["R"].teamA>class="match-winner"</#if>>${matches["R"].teamA}</b> vs <b <#if matches["R"].winner?? && matches["R"].winner == matches["R"].teamB>class="match-winner"</#if>>${matches["R"].teamB}</b></span><br>
								<span>${matches["R"].date}</span>
							<#else>
								<span>Perdedores <b>A</b> vs <b>B</b></span><br>
								<span>Miercoles 19/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-s" class='fixture-box match' value="s">
						<span class="match-id">S</span><br>
							<#if matches["S"]??>
								<span><b <#if matches["S"].winner?? && matches["S"].winner == matches["S"].teamA>class="match-winner"</#if>>${matches["S"].teamA}</b> vs <b <#if matches["S"].winner?? && matches["R"].winner == matches["R"].teamB>class="match-winner"</#if>>${matches["S"].teamB}</b></span><br>
								<span>${matches["S"].date}</span>
							<#else>
								<span>Perdedores <b>C</b> vs <b>D</b></span><br>
								<span>Viernes 21/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-t" class='fixture-box match'>
						<span class="match-id">T</span><br>
							<#if matches["L1C"]??>
								<span><b <#if matches["T"].winner?? && matches["T"].winner == matches["T"].teamA>class="match-winner"</#if>>${matches["T"].teamA}</b> vs <b <#if matches["T"].winner?? && matches["T"].winner == matches["T"].teamB>class="match-winner"</#if>>${matches["T"].teamB}</b></span><br>
								<span>${matches["T"].date}</span>
							<#else>
								<span>Perdedores <b>E</b> vs <b>F</b></span><br>
								<span>Domingo 23/11 21:00hs</span>
							</#if>
						</div>
						<div id="match-u" class='fixture-box match'>
						<span class="match-id">U</span><br>
							<#if matches["U"]??>
								<span><b <#if matches["U"].winner?? && matches["U"].winner == matches["U"].teamA>class="match-winner"</#if>>${matches["U"].teamA}</b> vs <b <#if matches["U"].winner?? && matches["U"].winner == matches["U"].teamB>class="match-winner"</#if>>${matches["U"].teamB}</b></span><br>
								<span>${matches["U"].date}</span>
							<#else>
								<span>Perdedores <b>G</b> vs <b>H</b></span><br>
								<span>Domingo 23/11 22:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div id="match-v" class='fixture-box match' value="r">
						<span class="match-id">V</span><br>
							<#if matches["V"]??>
								<span><b <#if matches["V"].winner?? && matches["V"].winner == matches["V"].teamA>class="match-winner"</#if>>${matches["V"].teamA}</b> vs <b <#if matches["V"].winner?? && matches["V"].winner == matches["V"].teamB>class="match-winner"</#if>>${matches["V"].teamB}</b></span><br>
								<span>${matches["V"].date}</span>
							<#else>
								<span>Ganador <b>R</b> vs Perdedor <b>L</b></span><br>
								<span>Viernes 28/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-w" class='fixture-box match' value="w">
						<span class="match-id">W</span><br>
							<#if matches["W"]??>
								<span><b <#if matches["W"].winner?? && matches["W"].winner == matches["W"].teamA>class="match-winner"</#if>>${matches["W"].teamA}</b> vs <b <#if matches["W"].winner?? && matches["W"].winner == matches["W"].teamB>class="match-winner"</#if>>${matches["W"].teamB}</b></span><br>
								<span>${matches["W"].date}</span>
							<#else>
								<span>Ganador <b>S</b> vs Perdedor <b>K</b></span><br>
								<span>Miercoles 26/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-x" class='fixture-box match'>
						<span class="match-id">X</span><br>
							<#if matches["X"]??>
								<span><b <#if matches["X"].winner?? && matches["X"].winner == matches["X"].teamA>class="match-winner"</#if>>${matches["X"].teamA}</b> vs <b <#if matches["X"].winner?? && matches["X"].winner == matches["X"].teamB>class="match-winner"</#if>>${matches["X"].teamB}</b></span><br>
								<span>${matches["X"].date}</span>
							<#else>
								<span>Ganador <b>T</b> vs Perdedor <b>J</b></span><br>
								<span>Martes 25/11 22:00hs</span>
							</#if>
						</div>
						<div id="match-y" class='fixture-box match'>
						<span class="match-id">Y</span><br>
							<#if matches["Y"]??>
								<span><b <#if matches["Y"].winner?? && matches["Y"].winner == matches["Y"].teamA>class="match-winner"</#if>>${matches["Y"].teamA}</b> vs <b <#if matches["Y"].winner?? && matches["Y"].winner == matches["Y"].teamB>class="match-winner"</#if>>${matches["Y"].teamB}</b></span><br>
								<span>${matches["Y"].date}</span>
							<#else>
								<span>Ganador <b>U</b> vs Perdedor <b>I</b></span><br>
								<span>Lunes 24/11 22:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-z" class='fixture-box match'>
						<span class="match-id">Z</span><br>
							<#if matches["Z"]??>
								<span><b <#if matches["Z"].winner?? && matches["Z"].winner == matches["Z"].teamA>class="match-winner"</#if>>${matches["Z"].teamA}</b> vs <b <#if matches["Z"].winner?? && matches["Z"].winner == matches["Z"].teamB>class="match-winner"</#if>>${matches["Z"].teamB}</b></span><br>
								<span>${matches["Z"].date}</span>
							<#else>
								<span>Ganadores <b>V</b> vs <b>W</b></span><br>
								<span>Sabado 29/11 13:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div id="match-aa" class='fixture-box match'>
						<span class="match-id">AA</span><br>
							<#if matches["AA"]??>
								<span><b <#if matches["AA"].winner?? && matches["AA"].winner == matches["AA"].teamA>class="match-winner"</#if>>${matches["AA"].teamA}</b> vs <b <#if matches["AA"].winner?? && matches["AA"].winner == matches["AA"].teamB>class="match-winner"</#if>>${matches["AA"].teamB}</b></span><br>
								<span>${matches["AA"].date}</span>
							<#else>
								<span>Ganadores <b>X</b> vs <b>Y</b></span><br>
								<span>Sabado 29/11 14:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-ab" class='fixture-box match'>
						<span class="match-id">AB</span><br>
							<#if matches["AB"]??>
								<span><b <#if matches["AB"].winner?? && matches["AB"].winner == matches["AB"].teamA>class="match-winner"</#if>>${matches["AB"].teamA}</b> vs <b <#if matches["AB"].winner?? && matches["AB"].winner == matches["AB"].teamB>class="match-winner"</#if>>${matches["AB"].teamB}<b></span><br>
								<span>${matches["AB"].date}</span>
							<#else>
								<span>Ganador <b>Z</b> vs Perdedor <b>M</b></span><br>
								<span>Sabado 29/11 15:00hs</span>
							</#if>
						</div>
						<div class='fixture-air-box'>
						</div>
						<div id="match-ac" class='fixture-box match'>
						<span class="match-id">AC</span><br>
							<#if matches["AC"]??>
								<span><b <#if matches["AC"].winner?? && matches["AC"].winner == matches["AC"].teamA>class="match-winner"</#if>>${matches["AC"].teamA}</b> vs <b <#if matches["AC"].winner?? && matches["AC"].winner == matches["AC"].teamB>class="match-winner"</#if>>${matches["AC"].teamB}</b></span><br>
								<span>${matches["AC"].date}</span>
							<#else>
								<span>Ganador <b>AA</b> vs Perdedor <b>N</b></span><br>
								<span>Sabado 29/11 16:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div class='fixture-air-box'>
						</div>
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-ad" class='fixture-box match'>
						<span class="match-id">AD</span><br>
							<#if matches["AD"]??>
								<span><b <#if matches["AD"].winner?? && matches["AD"].winner == matches["AD"].teamA>class="match-winner"</#if>>${matches["AD"].teamA}</b> vs <b <#if matches["AD"].winner?? && matches["AD"].winner == matches["AD"].teamB>class="match-winner"</#if>>${matches["AD"].teamB}</b></span><br>
								<span>${matches["AD"].date}</span>
							<#else>
								<span>Ganadores <b>AB</b> vs <b>AC</b></span><br>
								<span>Domingo 30/11 13:00hs</span>
							</#if>
						</div>
					</div>
					<div class="col-sm-2 text-center">
						<div class='fixture-air-box'>
						</div>
						<div class='half-fixture-air-box'>
						</div>
						<div id="match-ae" class='fixture-box match'>
						<span class="match-id">AE</span><br>
							<#if matches["AE"]??>
								<span><b <#if matches["AE"].winner?? && matches["AE"].winner == matches["AE"].teamA>class="match-winner"</#if>>${matches["AE"].teamA}</b> vs <b <#if matches["AE"].winner?? && matches["AE"].winner == matches["AE"].teamA>class="match-winner"</#if>>${matches["AE"].teamB}</b></span><br>
								<span>${matches["AE"].date}</span>
							<#else>
								<span>Ganador <b>AD</b> vs Perdedor <b>O</b></span><br>
								<span>Domingo 30/11 15:00hs</span>
							</#if>
						</div>
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
    	<script src="/js/jquery.jsPlumb-1.6.4-min.js"></script>
    	<script src="/js/connect-boxes-second-tourney.js"></script>
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
		connectFixtureBoxes()		
	});
	</script>
</body>	
</html>