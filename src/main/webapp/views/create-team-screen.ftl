<!DOCTYPE html> 
<html>
	<head>
		<meta charset="UTF-8" />
	    <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,700" media="screen" rel="stylesheet" />
	    <link href="/css/bootstrap.min.css" rel="stylesheet" />
	    <link href="/css/font-awesome.min.css" rel="stylesheet" />
	    <link href="/css/jquery-ui.css" rel="stylesheet" />
	    <link href="/css/jquery-ui.structure.css" rel="stylesheet" />
	    <link href="/css/jquery-ui.theme.css" rel="stylesheet" />
	    <!-- Custom styles for our template -->
	    <link href="/css/bootstrap-theme.css" media="screen" rel="stylesheet" />
	    <link href="/css/main.css" rel="stylesheet" />
	</head>
	<body class="home">
		<div class="navbar navbar-inverse navbar-fixed-top headroom">
	        <div class="container">
	            <div class="navbar-header">
	                <button type="button" class="navbar-toggle" data-toggle="collapse"
	                    data-target=".navbar-collapse">
	                    <span class="icon-bar"></span> <span class="icon-bar"></span> <span
	                        class="icon-bar"></span>
	                </button>
	                <a class="navbar-brand" href="/"><img
	                    src="http://i.imgur.com/ze7FE4z.png"></a>
	            </div>
	            <div class="navbar-collapse collapse">
	                <ul class="nav navbar-nav pull-right">
	                    <li><a href="#map-section">Ganadores</a></li>
	                    <li><a href="#team-section">Torneo II</a></li>
	                    <li><a href="#premios-section">Seguinos</a></li>
	                </ul>
	            </div>
	        </div>
    	</div>
    	<header id="head">
	            <div class="row">
	                <img class="header-logo" src="http://i.imgur.com/ze7FE4z.png" />
	                <h1 class="lead">
	                    <img src="https://i.imgur.com/wQabEMq.png" />
	            </div>
    	</header>
    	<div class="row title-row">
    		<div class="col-sm-3 text-left">
    		</div>
			<div class="col-sm-6 text-center">
				<h1 class="super-title">Formulario de Inscripción</h1>
				<h3 class="epigraph">Agregá a tu equipo para participar de nuestros torneos</h1>
			</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
		<div class="team-form">
    	<div class="row">
    		<div class="col-sm-3 text-left">
    		</div>
			<div class="col-sm-6 text-left">
				<h1 class="sub-titles">Información del equipo</h1>
			</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
    	<div class="row">
    		<div class="col-sm-3 text-left">
    		</div>
    		<div class="col-sm-3 text-left">
					<label class='team-labels' for="teamName">Team Name*</label><br>
					<input class="mustComplete form-control" type="text" id="teamName" name="teamName" value="" placeholder="Evil Geniuses"><br>
					<label class='team-labels' for="teamName">Mail*</label><br>
					<input class="mustComplete form-control" type="text" id="mail" name="mail" value="" placeholder="contact@evilgeniuses.com"><br>
			</div>
			<div class="col-sm-3 text-left">
					<label class='team-labels' for="teamName">TAG*</label><br>
					<input class="mustComplete form-control" type="text" id="tag" name="tag" value="" placeholder="EG"><br>
					<label class='team-labels' for="teamName">Logo URL*</label><br> 
					<input class="mustComplete form-control" type="text" id="logoUrl" name="logoUrl" value="" placeholder="imgur.com/8flyD2F.jpg"><br>
			</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
		<div class="row">
    		<div class="col-sm-3 text-left">
    		</div>
			<div class="col-sm-6 text-left">
				<h1 class="sub-titles">Paginas del equipo</h1>
			</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
		<div class="row">
    		<div class="col-sm-3 text-left">
    		</div>
    		<div class="col-sm-3 text-left">
					<label class='team-labels' for="teamName">Team Web</label><br>
					<input class='form-control' type="text" id="web" name="web" value="" placeholder="www.evilgeniuses.com"><br>
					<label class='team-labels' for="teamName">Twitter</label><br>
					<input class='form-control' type="text" id="twitter" name="twitter" value="" placeholder="@evilgeniuses"><br>
			</div>
			<div class="col-sm-3 text-left">
					<label class='team-labels' for="teamName">Fanpage</label><br>
					<input class='form-control' type="text" id="facebook" name="facebook" value="" placeholder="facebook.com/evilgeniuses"><br>
			</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
		<div class="row">
    		<div class="col-sm-3 text-left">
    		</div>
			<div class="col-sm-6 text-left">
				<h1 class="sub-titles">Información de los jugadores</h1>
			</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
		<div class="row">
		   	<div class="col-sm-3 text-left">
    		</div>
    		<div class="col-sm-6 text-left">
					<ul class="ul-align" id="playersList">
						<div id="accordion">
							<h3 id="1">Capitán</h3> 
								<div> 
									<input type='hidden' id='initialText1' value='Capitán'/>
									<li class='player' id="player1">
									</li>
								</div> 
							<h3 id="2">Titular 1</h3> 
								<div>
									<input type='hidden' id='initialText2' value='Titular 1'/> 
									<li class='player' id="player2">
									</li>
								</div>
							<h3 id="3">Titular 2</h3> 
								<div> 
									<input type='hidden' id='initialText3' value='Titular 2'/>
									<li class='player' id="player3">
									</li>
								</div> 
							<h3 id="4">Titular 3</h3> 
								<div> 
									<input type='hidden' id='initialText4' value='Titular 3'/>
									<li class='player' id="player4">
									</li>
								</div> 
							<h3 id="5">Titular 4</h3> 
								<div> 
									<input type='hidden' id='initialText5' value='Titular 4'/>
									<li class='player' id="player5">
									</li>
								</div> 
							<h3 id="6">Suplente 1</h3> 
								<div> 
									<input type='hidden' id='initialText6' value='Suplente 1'/>
									<li class='player' id="player6">
									</li>
								</div> 
							<h3 id="7">Suplente 2</h3> 
								<div> 
									<input type='hidden' id='initialText7' value='Suplente 2'/>
									<li class='player' id="player7">
									</li>
								</div> 																																								 
						</div>
					</ul>
					
			</div>
			<div class="col-sm-3 text-left">
    		</div>
    		</div>	
    		<div class="row">
		   	<div class="col-sm-3 text-left">
    		</div>
    		<div class="col-sm-6 text-center last-section">
    		<input id="create-team" class="btn create-button" value="Create">
    		</div>
    		<div class="col-sm-3 text-left">
    		</div>
		</div>
		</div>
		</div>
	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="/css/hero.css" />
	<!-- <link rel="stylesheet" href="//code.jquery.com/ui/1.11.0/themes/smoothness/jquery-ui.css"> -->
  	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
	<script>
		$(document).ready(function() {
			var playerNumber = 0;
				while(playerNumber < 7){
					playerNumber++;
					var htmlComplete = "<div class='col-sm-6 text-left first-player-column'>";
					htmlComplete += "<input type='hidden' id='playerNumber' value='"+playerNumber+"'/>";
					htmlComplete += "<label class='team-labels' for='name'>Nombre*</label><br> <input placeholder='Clinton' class='tagEditor mustComplete form-control' type='text' id ='name' name='name' value=''><br>";
					htmlComplete += "<label class='team-labels' for='idNumber'>Documento*</label><br> <input type='text' placeholder='34383757' class='mustComplete form-control' id='idNumber' name='idNumber' value=''><br>";
					htmlComplete += "<label class='team-labels' for='nick'>Nick*</label><br> <input class='mustComplete form-control' placeholder='Fear' type='text' id='nick' name='nick' value=''><br>";
					htmlComplete += "<label class='team-labels' for='dotabuff'>Dotabuff Url</label><br> <input class='form-control' placeholder='http://dotabuff.com/players/86890833' type='text' id='dotabuff' name='dotabuff' value=''><br>";
					htmlComplete += "<label class='team-labels' for='country'>País*</label><br> <select class='country form-control' id='country' name='country'> <#list countries as country> <option value='${country}'>${country.description}</option> </#list> </select> <br>";
					htmlComplete += "<label class='team-labels relativeLocation' for='city'>Ciudad*</label><br class='relativeLocation'> <input placeholder='Ciudad Autonoma de Buenos Aires' class='form-control relativeLocation' type='text' id='city' name='city' value=''><br class='relativeLocation'> "
					htmlComplete += "<label class='team-labels' for='roles'>Rol*</label><br> <select class='mustComplete form-control' id='role' name='role'> <option  value='DEFAULT'>Elije un rol</option> <#list roles as enum> <option value='${enum}'>${enum.description}</option> </#list> </select> <br>";
					htmlComplete += "</div>";
					htmlComplete += "<div class='col-sm-6 text-left'>";
					htmlComplete += "<label class='team-labels' for='lastName'>Apellido*</label><br> <input placeholder='Loomis' class='tagEditor mustComplete form-control' type='text' id='lastName' name='lastName' value=''><br>";
					htmlComplete += "<label class='team-labels' for='birthday'>Fecha de nac.*</label><br> <input placeholder='18/12/1991' class='birthday mustComplete form-control' type='text' id='birthday"+playerNumber+"'><br>";
					htmlComplete += "<label class='team-labels' for='pictureUrl'>Foto de perfil*</label><br> <input placeholder='imgur.com/8flyD2F.jpg' class='mustComplete form-control' type='text' id='pictureUrl' name='pictureUrl' value=''><br>";
					htmlComplete += "<label class='team-labels' for='steam'>Steam Url</label><br> <input class='mustComplete form-control' placeholder='http://steamcommunity.com/profiles/76561198047156561' type='text' id='steam' name='steam' value=''><br>";
					htmlComplete += "<label  class='team-labels relativeLocation' for='state'>Provincia*</label><br class='relativeLocation'> <select class='relativeLocation form-control' id='state' name='state'> <#list states as state> <option value='${state}'>${state.description}</option> </#list> </select> <br class='relativeLocation'>"
					htmlComplete += "<label class='team-labels relativeLocation' for='neighbourhood'>Barrio*</label><br class='relativeLocation' > <input placeholder='Caballito' class='relativeLocation form-control' type='text' id='neighbourhood' name='neighbourhood' value=''>";
					htmlComplete += "</div>";
					
					$("#player"+playerNumber).append(htmlComplete);
				}
			
			var icons = {
		      header: "ui-icon-plusthick",
		      activeHeader: "ui-icon-minusthick"
		    };
		    $( "#accordion" ).accordion({
			  collapsible: true,
		      icons: icons,
		      active: false
		    });
		    $(".country").change(function() {
		    	if($(this).val() == "OTHER"){
		    		hideLocation($(this).parent());
		    	}else{
		    		showLocation($(this).parent());
		    	}
			  
			});
		    $(".tagEditor").on('input',function(e){
		      var playerNumber =$(this).parent().parent().find("#playerNumber").val();
		      var initialText = $("#initialText"+playerNumber).val();
		      var name = $(this).parent().parent().find("#name").val();
		      var lastName = $(this).parent().parent().find("#lastName").val();
		      if(name != "" || lastName != ""){
				$("#"+playerNumber).html(initialText + " - " + name + " " + lastName)
			  }else{
			  	$("#"+playerNumber).html(initialText)
			  }
			    $("#"+playerNumber).append("<span class='ui-accordion-header-icon ui-icon ui-icon-minusthick'></span>");
			});
			
			function hideLocation(e){
				e.parent().find(".relativeLocation").hide()
				e.parent().parent().css('height','100%');
			}
			function showLocation(e){
				e.parent().find(".relativeLocation").show()
				e.parent().parent().css('height','100%');
			}
			
			$(function() {
				$(".birthday").each(function() {
					$(this).datepicker({
					    changeMonth: true,
					    changeYear: true,
					    buttonImage: "/images/calendar.gif",
					    showOn: "button",
	      				buttonImageOnly: true,
	      				yearRange: "-100:+0",
	      				dateFormat: "dd/mm/yy"
				  	});
				});
			});
			$("#create-team").click(function(e){
				e.preventDefault(); 
				
				//validations
				var validator = false;
				$(".mustComplete").each(function(){
					if($(this).val() == undefined || $(this).val() == "" || $(this).val() == "DEFAULT"){
						$(this).addClass("error");
						validator = true;
					}else{
						$(this).removeClass("error");
					}
				});
				
				if(validator){
					return false;
				}
				
				var team = new Object();
				team.name = $("#teamName").val();
				team.tag = $("#tag").val();
				team.mail = $("#mail").val();
				team.facebook = $("#facebook").val();
				team.twitter = $("#twitter").val();
				team.web = $("#web").val();
				team.imageUrl = $("#logoUrl").val();
				var players = [];
				$(".player").each(function() {
					  var player = new Object();
					  player.name = $(this).find("#name").val();
					  player.lastName = $(this).find("#lastName").val();
					  player.nick = $(this).find("#nick").val();
					  player.role = $(this).find("#role").val();
					  player.captain = false;
					  if($(this).find("playerNumber").val() == 1){
					  	player.captain = true;
					  }
					  player.steam = $(this).find("#steam").val();
					  player.dotabuff = $(this).find("#dotabuff").val();
					  player.idNumber = $(this).find("#idNumber").val();
					  player.birthday = $(this).find(".birthday").val();
					  player.country = $(this).find("#country").val();
					  if(player.country != "OTHER"){
						  player.state = $(this).find("#state").val();
						  player.city = $(this).find("#city").val();
						  player.neighbourhood = $(this).find("#neighbourhood").val();
					  }
					  player.pictureUrl = $(this).find("#pictureUrl").val();
					  players.push(player);
				});
				team.players = players;
				
				$.ajax({
			        url: "/team",
			        type: 'POST',
		            headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },
			        dataType: 'json',
			        data: JSON.stringify(team),
			        contentType: 'application/json',
			        mimeType: 'application/json',
			        success: function (data) {
			        		alert("ganamos")
			        	 // location.href="/team/success";
			        },
			        error:function(data,status,er) {
			            alert(data.responseJSON.message);
			        }
			    });
			});
		});
	</script> 
	</body>
</html>