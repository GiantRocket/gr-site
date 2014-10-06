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
	    <link href="/css/parallax.css" rel="stylesheet" />
	    <link href="/css/bootstrap-dialog.min.css" rel="stylesheet" />
	    <title>Inscripción</title>
		<link href="http://puu.sh/8JT1a.png" rel="shortcut icon" />
		<link href="/css/custom-main.css" rel="stylesheet"/>
</head>
<body>
		<!-- Google Analytics -->
	<!-- <?php include_once("analyticstracking.php") ?> -->
	<!-- /Google Analytics -->
 
	<div class="navbar navbar-inverse navbar-fixed-top headroom">
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
		<div class="container">
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
					<h1 class="super-title">Formulario de Inscripción</h1>
					<h3 class="epigraph">Agregá a tu equipo para participar de nuestros torneos</h1>
				</div>
	    		<div class="col-sm-3 text-left">
	    		</div>
			</div>
		</div>
		<div class="container-fluid" id="important-message">
	    	<div class="row title-row blue-background-color">
	    		<div class="col-sm-3 text-left">
	    		</div>
				<div class="col-sm-6 text-center title-and-epigraph">
					
					<h1 class="super-title">IMPORTANTE:
					<span class="pull-right glyphicon glyphicon-remove close-message" id="close-message"></span>
					</h1>
					<h3 class="epigraph">Solo 16 equipos participarán del torneo</h1>
					<h3 class="epigraph">Los mismos deberan abonar un costo de inscripción en caso de ser seleccionados</h1>
				</div>
	    		<div class="col-sm-3 text-left">
	    		</div>
			</div>
		</div>
		<div class="team-form">
			<div class="container-fluid">
		    	<div class="row">
		    		<div class="col-sm-3 text-left">
		    		</div>
					<div class="col-sm-6 text-left">
						<h1 class="sub-titles">Información del equipo</h1>
					</div>
		    		<div class="col-sm-3 text-left">
		    		</div>
				</div>
			</div>
			<div class="container-fluid">
		    	<div class="row">
		    		<div class="col-sm-3 text-left">
		    		</div>
		    		<div class="col-sm-3 text-left">
		    			<div class='form-group has-feedback'>
							<label class='team-labels' for="teamName">Nombre*</label><br>
							<input class="mustComplete form-control" type="text" id="teamName" name="teamName" value="" placeholder="Evil Geniuses">
						</div>
						<div class='form-group has-feedback'>
							<label class='team-labels' for="mail">Mail*</label><br>
							<input class="mustComplete form-control mail" type="text" id="mail" name="email" value="" placeholder="contact@evilgeniuses.com">
							<span class="help-block helper-text">Si el equipo no tiene mail,<br> podes indicar el del capitán o representante</span>
						</div>
					</div>
					<div class="col-sm-3 text-left">
						<div class='form-group has-feedback'>
							<label class='team-labels' for="tag">TAG*</label><br>
							<input class="mustComplete form-control" type="text" id="tag" name="tag" value="" placeholder="EG">
						</div>
						<div class='form-group has-feedback'>
							<label class='team-labels' for="logoUrl">Logo URL*</label><br> 
							<input class="mustComplete form-control" type="text" id="logoUrl" name="logoUrl" value="" placeholder="imgur.com/8flyD2F.jpg">
						</div>
					</div>
		    		<div class="col-sm-3 text-left">
		    		</div>
				</div>
			</div>
		<div class="container-fluid">
			<div class="row">
	    		<div class="col-sm-3 text-left">
	    		</div>
				<div class="col-sm-6 text-left">
					<h1 class="sub-titles">Páginas del equipo</h1>
				</div>
	    		<div class="col-sm-3 text-left">
	    		</div>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
	    		<div class="col-sm-3 text-left">
	    		</div>
	    		<div class="col-sm-3 text-left">
	    			<div class='form-group has-feedback'>
						<label class='team-labels' for="web">Web</label><br>
						<input class='form-control' type="text" id="web" name="web" value="" placeholder="www.evilgeniuses.com">
					</div>
					<div class='form-group has-feedback'>
						<label class='team-labels' for="twitter">Twitter</label><br>
						<input class='form-control' type="text" id="twitter" name="twitter" value="" placeholder="@evilgeniuses">
					</div>
				</div>
				<div class="col-sm-3 text-left">
					<div class='form-group has-feedback'>
						<label class='team-labels' for="facebook">Fanpage</label><br>
						<input class='form-control' type="text" id="facebook" name="facebook" value="" placeholder="facebook.com/evilgeniuses">
					</div>
				</div>
	    		<div class="col-sm-3 text-left">
	    		</div>
			</div>
		</div>
		<div class="container-fluid">
			<div class="row">
	    		<div class="col-sm-3 text-left">
	    		</div>
				<div class="col-sm-6 text-left">
					<h1 class="sub-titles">Información de los jugadores</h1>
				</div>
	    		<div class="col-sm-3 text-left">
	    		</div>
			</div>
		</div>
		<div class="container-fluid">
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
	    	</div>
	    	<div class="container-fluid">
	    		<div class="row">
				   	<div class="col-sm-4 text-left"></div>
		    		<div class="col-sm-4 text-center">
					  <div class="checkbox form-group has-feedback">
					    <label>
					      <input type="checkbox" class="rules"> <span> Acepto los términos y condiciones del </span><br> <a target="_blank" href="/rules" class="rules-link">Reglamento de Torneos de Giant Rocket</a>
					    </label>
					  </div>
		    		</div>
		    		<div class="col-sm-4 text-left"></div>
				</div>
			</div>	    
	    	<div class="container-fluid">
	    		<div class="row">
				   	<div class="col-sm-3 text-left"></div>
		    		<div class="col-sm-6 last-section text-center">
		    			<input type="submit" id="create-team" class="btn-parallax bg-px--blue btn__border--bottom-blue soft--sides text--white text--medium no-underline font-size--14" value="Crear equipo">
		    		</div>
		    		<div class="col-sm-3 text-left"></div>
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
			<p>Copyright © 2014, Giant Rocket. Designed and coded with love by @revesm, @iumaycallmev, @emecibelli and @sergiofruto.<p>
		</div>
	</footer>
	</div>
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
  	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
  	<script src="/js/headroom.min.js"></script>
	<script src="/js/jquery.scrollTo.min.js"></script>
	<script src="/js/jQuery.headroom.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
	<script src="/js/template.js"></script>
	<script src="/js/bootstrap-dialog.min.js"></script>
	<script>
		$(document).ready(function() {
		var errorDialog = new BootstrapDialog({
            title: 'Error',
            message: 'Por favor complete todos los campos requeridos.',
            cssClass: 'small-dialog',
            type: BootstrapDialog.TYPE_DANGER,
            autodestroy: false,
            closable: true,
            buttons: [{
                label: 'Cerrar',
                cssClass: 'btn-danger',
                action: function(dialogItself){
                    dialogItself.close();
                }
            }]
        });
        
			var playerNumber = 0;
				while(playerNumber < 7){
					playerNumber++;
					var htmlComplete = "<div class='col-sm-6 text-left first-player-column'>";
					htmlComplete += "<input type='hidden' id='playerNumber' value='"+playerNumber+"'/>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='name'>Nombre*</label><br> <input placeholder='Clinton' class='tagEditor mustComplete form-control' type='text' id ='name' name='name' value=''></div>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='idNumber'>Documento*</label><br> <input type='text' placeholder='34383757' class='idNumber mustComplete form-control' id='idNumber' name='idNumber' value=''></div>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='nick'>Nick*</label><br> <input class='mustComplete form-control' placeholder='Fear' type='text' id='nick' name='nick' value=''></div>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='dotabuff'>Perfil de Dotabuff</label><br> <input class='form-control' placeholder='http://dotabuff.com/players/86890833' type='text' id='dotabuff' name='dotabuff' value=''></div>";
					htmlComplete += "<div class='form-group'> <label class='team-labels' for='country'>País de residencia*</label><br> <select class='mustComplete country form-control' id='country' name='country'> <#list countries as country> <option value='${country}'>${country.description}</option> </#list> </select> </div>";
					htmlComplete += "<div class='form-group has-feedback relativeLocation'> <label class='team-labels relativeLocation' for='city'>Ciudad*</label><br class='relativeLocation'> <input placeholder='Ciudad Autonoma de Buenos Aires' class='mustCompleteRelativeLocation form-control relativeLocation' type='text' id='city' name='city' value=''> </div>"
					htmlComplete += "<div class='form-group'> <label class='team-labels' for='roles'>Rol*</label><br> <select class='mustComplete form-control' id='role' name='role'> <option  value='DEFAULT'>Elije un rol</option> <#list roles as enum> <option value='${enum}'>${enum.description}</option> </#list> </select> </div>";
					htmlComplete += "</div>";
					htmlComplete += "<div class='col-sm-6 text-left second-player-column'>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='lastName'>Apellido*</label><br> <input placeholder='Loomis' class='tagEditor mustComplete form-control' type='text' id='lastName' name='lastName' value=''></div>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='birthday'>Fecha de nacimiento*</label><br> <input readonly='readonly' placeholder='18/12/1991' style='background:white;cursor:pointer;'class='birthday mustComplete form-control' type='text' id='birthday"+playerNumber+"'></div>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='pictureUrl'>URL de Foto de perfil*</label><br> <input placeholder='imgur.com/8flyD2F.jpg' class='mustComplete form-control' type='text' id='pictureUrl' name='pictureUrl' value=''></div>";
					htmlComplete += "<div class='form-group has-feedback'> <label class='team-labels' for='steam'>Perfil de Steam*</label><br> <input class='mustComplete form-control' placeholder='http://steamcommunity.com/profiles/76561198047156561' type='text' id='steam' name='steam' value=''></div>";
					htmlComplete += "<div class='form-group relativeLocation'> <label  class='team-labels relativeLocation' for='state'>Provincia*</label><br class='relativeLocation'> <select class='mustComplete relativeLocation form-control' id='state' name='state'> <#list states as state> <option value='${state}'>${state.description}</option> </#list> </select> </div>"
					htmlComplete += "<div class='form-group has-feedback relativeLocation'> <label class='team-labels relativeLocation' for='neighbourhood'>Barrio*</label><br class='relativeLocation' > <input placeholder='Caballito' class='mustCompleteRelativeLocation relativeLocation form-control' type='text' id='neighbourhood' name='neighbourhood' value=''> </div>";
					htmlComplete += "</div>";
					
					$("#player"+playerNumber).append(htmlComplete);
				}
			
		$(".idNumber").keydown(function(e){
	        // Allow: backspace, delete, tab, escape, enter and .
	        if ($.inArray(e.keyCode, [46, 8, 9, 27, 13, 110, 190]) !== -1 ||
	             // Allow: Ctrl+A
	            (e.keyCode == 65 && e.ctrlKey === true) || 
	             // Allow: home, end, left, right
	            (e.keyCode >= 35 && e.keyCode <= 39)) {
	                 // let it happen, don't do anything
	                 return;
	        }
	        // Ensure that it is a number and stop the keypress
	        if ((e.shiftKey || (e.keyCode < 48 || e.keyCode > 57)) && (e.keyCode < 96 || e.keyCode > 105)) {
	            e.preventDefault();
	        }
    	});
    	
    	$("#close-message").click(function(e){
				$("#important-message").hide(); 
    	});
			
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
			
			$(".mustComplete").on('focus',function(e){
				$(this).parent().removeClass("has-error");
				$(this).parent().find(".glyphicon").remove()
			});
			$(".mustCompleteRelativeLocation").on('focus',function(e){
				$(this).parent().removeClass("has-error");
				$(this).parent().find(".glyphicon").remove()
			});
			
			
			$(".rules").on('focus',function(e){
				$(".rules").parent().parent().parent().removeClass("has-error");
				$(".rules").parent().removeClass("rules-error");
			});
			
		    $(".tagEditor").on('input',function(e){
		      var playerNumber =$(this).parent().parent().parent().find("#playerNumber").val();
		      var initialText = $("#initialText"+playerNumber).val();
		      var name = $(this).parent().parent().parent().find("#name").val()
		      var lastName = $(this).parent().parent().parent().find("#lastName").val()
		      if(name != "" || lastName != ""){
				$("#"+playerNumber).html(initialText + " - " + name + " " + lastName)
			  }else{
			  	$("#"+playerNumber).html(initialText)
			  }
			    $("#"+playerNumber).append("<span class='ui-accordion-header-icon ui-icon ui-icon-minusthick'></span>");
			});
			
			function hideLocation(e){
				e.parent().parent().find(".relativeLocation").hide()
				e.parent().parent().parent().css('height','100%');
			}
			function showLocation(e){
				e.parent().parent().find(".relativeLocation").show()
				e.parent().parent().parent().css('height','100%');
			}
			
			$(function() {
				$(".birthday").each(function() {
					$(this).datepicker({
					    changeMonth: true,
					    changeYear: true,
	      				yearRange: "-70:+0",
	      				maxDate: new Date(1996, 11, 1),
	      				minDate: new Date(1946, 1, 1),
	      				dateFormat: "dd/mm/yy"
				  	});
				});
				$( ".birthday" ).datepicker( "option", "gotoCurrent", true );
			});
			function validateEmail(email) {
			  var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
			  if( !emailReg.test( email ) ) {
			    return false;
			  } else {
			    return true;
				}
			}
			
			function styleInvalidField(e){
				$(e).parent().addClass("has-error");
				$(e).parent().find(".glyphicon").remove()
				$(e).parent().removeClass("has-success");
				if($(e).parent().hasClass("has-feedback")){
					$(e).parent().append("<span class='glyphicon glyphicon-remove form-control-feedback'></span>");
				}
			}
			
			function styleValidField(e){
				$(e).parent().removeClass("has-error");
				$(e).parent().find(".glyphicon").remove()
				$(e).parent().addClass("has-success");
				if($(e).parent().hasClass("has-feedback")){
					$(e).parent().append("<span class='glyphicon glyphicon-ok form-control-feedback'></span>");
				}
			}
			
			$("#create-team").click(function(e){
				e.preventDefault(); 
				
				//validations
				var validator = false;
				$(".mustComplete").each(function(){
					if($(this).val() == undefined || $(this).val() == "" || $(this).val() == "DEFAULT"){
						styleInvalidField(this);
						validator = true;
					}else{
						if($(this).hasClass("mail") && !validateEmail($(this).val())){
							styleInvalidField(this);
							validator = true;
						}else{
							styleValidField(this)
						}
					}
				});
				
				$(".mustCompleteRelativeLocation").each(function(){
					if($(this).parent().parent().parent().find("#country").val() != "OTHER"){
						if($(this).val() == undefined || $(this).val() == "" || $(this).val() == "DEFAULT"){
							styleInvalidField(this);
							validator = true;
						}else{
							if($(this).hasClass("mail") && !validateEmail($(this).val())){
								styleInvalidField(this);
								validator = true;
							}else{
								styleValidField(this)
							}
						}
					}
				});
				
				if(!$(".rules").is(':checked')){
					$(".rules").parent().parent().parent().addClass("has-error");
					$(".rules").parent().addClass("rules-error");
					validator = true;
				}else{
					$(".rules").parent().parent().parent().removeClass("has-error");
					$(".rules").parent().removeClass("rules-error");
				}
				
				if(validator){
					errorDialog.open()
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
					  if($(this).find("#playerNumber").val() == 1){
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
				$.ajaxSetup({dataFilter: function(data, type) {
				    if (type == "json" && data == "") {
				        data = null;
				    }
				    return data;
				}});
				$.ajax({
			        url: "/team",
			        type: 'POST',
		            headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },
			        data: JSON.stringify(team),
			        dataType: 'json',
			        contentType: 'application/json',
			        mimeType: 'application/json',
			        success: function (data) {
			        	 location.href="/team/success";
			        },
			        error:function(data,status,er) {
			        BootstrapDialog.show({
			            title: 'Error',
			            message: data.responseJSON.message,
			            type: BootstrapDialog.TYPE_INFORMATION,
			            autodestroy: false,
			            closable: true,
			            buttons: [{
			                label: 'Cerrar',
			                cssClass: 'btn-primary',
			                action: function(dialogItself){
			                    dialogItself.close();
			                }
            			}]
        			});
			        }
			    });
			});
		});
	</script> 
	</body>
</html>