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
	    <title>Match</title>
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
					<li><a class="/fixture" href="">Fixture</a></li>
					<li><a class="/show/teams" href="">Equipos</a></li>
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
					<h1 class="super-title">Actualizacion de Match</h1>
					<h3 class="epigraph">Recorda que cualquier edición afectara directamente la web</h1>
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
					<h3 class="epigraph">TENGAMOS MUCHO CUIDADO CON LA EDICION DE MATCHES</h1>
					<h3 class="epigraph">SI NO ESTAS SEGURO QUE MATCH ID USAR, ¡PREGUNTA!</h1>
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
						<h1 class="sub-titles">Información del match</h1>
					</div>
		    		<div class="col-sm-3 text-left">
		    		</div>
				</div>
			</div>
			<#assign teamOptions=""/>
			<#list teams as team>
				<#assign teamOptions>
					${teamOptions}
					<option value='${team}'>${team}</option>
				</#assign> 
			</#list>
			<div class="container-fluid">
		    	<div class="row">
		    		<div class="col-sm-3 text-left">
		    		</div>
		    		<div class="col-sm-3 text-left">
		    			<div class='form-group has-feedback'>
							<label class='team-labels' for="matchId">Id*</label><br>
							<input class="mustComplete form-control" type="text" id="matchId" name="matchId" value="${(match.id)!''}" placeholder="1A">
						</div>
						<div class='form-group has-feedback'>
							<label class='team-labels' for="winner">Ganador*</label><br>
							<select class='form-control' id='winner' name='winner'> 
								<option value='DEFAULT'>Elije un team</option>
								${teamOptions}
							</select> 
						</div>
						<div class='form-group has-feedback'>
							<label class='team-labels' for="date">Dia y Hora*</label><br>
							<input class="mustComplete form-control mail" type="text" id="date" name="date" value="${(match.date)!''}" placeholder="27/11/2014 22:00">
						</div>
					</div>
					<div class="col-sm-3 text-left">
						<div class='form-group'> 
							<label class='team-labels' for='teamA'>Team A*</label><br> 
							<select class='mustComplete form-control' id='teamA' name='teamA'> 
								<option value='DEFAULT'>Elije un team</option>
								${teamOptions} 
							</select> 
						</div>
						<div class='form-group'> 
							<label class='team-labels' for='teamB'>Team B*</label><br> 
							<select class='mustComplete form-control' id='teamB' name='teamB'> 
								<option value='DEFAULT'>Elije un team</option>
								${teamOptions} 
							</select> 
						</div>
					</div>
		    		<div class="col-sm-3 text-left">
		    		</div>
				</div>
			</div>
	    	<div class="container-fluid">
	    		<div class="row">
				   	<div class="col-sm-3 text-left"></div>
		    		<div class="col-sm-6 last-section text-center">
		    			<input type="submit" id="create-match" class="btn-parallax bg-px--blue btn__border--bottom-blue soft--sides text--white text--medium no-underline font-size--14" value="Update match">
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
			$("#teamA").val("${(match.teamA)!'DEFAULT'}")
			$("#teamB").val("${(match.teamB)!'DEFAULT'}")
			$("#winner").val("${(match.winner)!'DEFAULT'}")
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
        
	    	$("#close-message").click(function(e){
				$("#important-message").hide(); 
	    	});
				
		    
			$(".mustComplete").on('focus',function(e){
				$(this).parent().removeClass("has-error");
				$(this).parent().find(".glyphicon").remove()
			});
			
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
			
			$("#create-match").click(function(e){
				e.preventDefault(); 
				
				//validations
				var validator = false;
				$(".mustComplete").each(function(){
					if($(this).val() == undefined || $(this).val() == "" || $(this).val() == "DEFAULT"){
						styleInvalidField(this);
						validator = true;
					}else{
						styleValidField(this)
					}
				});
				
				var teamA = $("#teamA").val();
				var teamB = $("#teamB").val();
				var winner = $("#winner").val();
				if(teamA == teamB){
					styleInvalidField($("#teamA"))
					styleInvalidField($("#teamB"))
					validator = true;
				}
				
				if(winner != "DEFAULT" && teamA != winner && teamB != winner){
					styleInvalidField($("#teamA"))
					styleInvalidField($("#teamB"))
					validator = true;
				}
				
				if(validator){
					errorDialog.open()
					return false;
				}
				if(winner == "DEFAULT"){
					winner = null;
				}
				

				
				var match = new Object();
				match.id = $("#matchId").val();
				match.winner = winner;
				match.teamA = teamA;
				match.teamB = teamB;
				match.date = $("#date").val();
				$.ajaxSetup({dataFilter: function(data, type) {
				    if (type == "json" && data == "") {
				        data = null;
				    }
				    return data;
				}});
				$.ajax({
			        url: "/match",
			        type: 'POST',
		            headers: { 
				        'Accept': 'application/json',
				        'Content-Type': 'application/json' 
				    },
			        data: JSON.stringify(match),
			        dataType: 'json',
			        contentType: 'application/json',
			        mimeType: 'application/json',
			        success: function (data) {
			        	 alert("Match actualizado correctamente");
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