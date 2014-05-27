<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap -->
	<title>Home</title>
	<link href="${pageContext.request.contextPath}resources/css/bootstrap.min.css" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}resources/css/index.css" media="screen">
	<script src="resources/js/jquery.js" type="text/javascript"></script>   
</head>

<body>

	<div>
		<table cellspacing="0" cellpadding="0">
			<tr>
				<td>
					<div id="content">
						<div id="menu" align="center" class="imagem0">
							<div class="navbar">
								<ul>

									<li><a href="index"> Home</a></li>
									<li><a href="carrinho"> Carrinho</a></li>
									<li><a href="pedidos"> Ver Pedidos</a></li>
									<li><a href="fatura"> Fatura</a></li>
									<li><a href="loguin">Login</a></li>
									<li><a href="contato"> Contato </a></li>
								</ul>
							</div>

							<div id="barradebusca">
								<strong><h1 id="carousel">Naaky Games</h1></strong> <input
									type="text" id="googlesearch"><input type="button"
									class="btn btn-small btn-primary" value="Pesquisar"> <br /></br>
							</div>
						</div>






						<div>
							<h3 align="center">
								<font color="red">

									<hr size="15">

									</hr> <br /> <br /> <br />
									<h3>Por favor faça um cadastro em nossa loja para efetuar
										sua compra caso ja tenha</h3> <br /> <br /> <br />

									<h3>Apenas faça o login e prossiga com sua compra!</h3> <br />
									<br /> <br />

								</font>
								<hr size="15" color="red">

								</hr>

							</h3>
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />
							<br /> <br /> <br /> <br /> <br /> <br /> <br /> <br /> <br />

							<h2>
								<font color="red">


									<h3>Ja Possui Cadastro em Nossa Loja?</h3> <br /> <br /> <br />
									<br />


									<p>
										<a href="loguin.jsp"><input color-button="red"
											class="button" type="submit" id="sim" value="SIM" /></a> <a
											href="cadastro.jsp"><input color-button="red"
											class="button" type="submit" id="nao" value="NÃO" /></a>
									</p> <br /> <br /> <br /> <br />
								</font>
								<hr size="5" color="red">

								</hr>
							<div>

								<script src="js/bootstrap.min.js"></script>
		<script src="js/jquery.js"></script>
		<script>
			$('#carousel').animate({
				"margin-left" : "+=800"
			}, 10000);

			$("h1,h2").mouseover(function() {
				$(this).css('color', 'black');
			});
			$("h1,h2").mouseout(function() {
				$(this).css('color', 'red');
			});

			$("p").mouseover(function() {
				$(this).css('color', 'black');
			});
			$("p").mouseout(function() {
				$(this).css('color', 'red');
			});

			$('p').animate({
				marginLeft : 150
			}, 200);

			$('p:animated').css({
				color : "#ff0000"
			});

			$('p').hover(function() {

				$(this).stop().animate({
					marginLeft : 20
				}, 500)
			},

			function() {

				$(this).stop().animate({
					marginLeft : 0
				}, 500);

			});

			$(document).ready(function() {
				$("#hide").click(function() {
					$("ul").hide();
				});
				$("#show").click(function() {
					$("ul").show();
					$('li').animate("slow");
					slideUp();
					slideDown();
				});

				$("#hide").mouseover(function() {
					$(this).css('color', 'black');
				});
				$("#hide").mouseout(function() {
					$(this).css('color', 'red');
				});
				$("#show").mouseover(function() {
					$(this).css('color', 'black');
				});
				$("#show").mouseout(function() {
					$(this).css('color', 'red');
				});

				$(document).ready(function() {

					var speedText = 300;

					var speedJump = 200;

					$("#menu").hover(

					function() {

						$(this).next("span").stop().animate({
							height : "70px",
						}, speedJump);

						$(this).stop().animate({
							lineHeight : "40px"
						}, speedText);

					}, function() {

						$(this).next("span").stop().animate({
							height : "0px"
						}, speedJump);

						$(this).stop().animate({
							lineHeight : "30px"
						}, speedText);

					});

				});
			});
		</script>

	</div>
</body>

</html>
<html>