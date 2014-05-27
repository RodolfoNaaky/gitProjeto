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
									<li><a href="login">Login</a></li>
									<li><a href="contato"> Contato </a></li>
								</ul>
							</div>

							<div id="barradebusca">
								<strong><h1 id="carousel">Naaky Games</h1></strong> <input
									type="text" id="googlesearch"><input type="button"
									class="btn btn-small btn-primary" value="Pesquisar"> <br /></br>
							</div>
						</div>


						<div align="center">
							<font color="red">
								<p>
									A Naaky Games esta Situada na Cidade de Santa Albertina-SP!</p>
									<p>Hoje � referencia "Mundial" na venda de Consoles com os menores
									Pre�os do Mercado!</p>
								</p>
								<h3>
									<p>Cidade: Santa Albertina</p>
									<p>Estado: S�o Paulo</p>
									<p>AV: Francisco Schimitd n� 1610</p>
									<p>Bairro: Centro</p>
									<p>Telefone: (17)3633 -1562</p>
									<p>Celuares:<(17)99785-6565 / (17)88956-5478 /
										(17)81859-9696</p>

									<p>Facebook: Naakygames.facebook.com/naaky.facep456p33</p>
									<p>Skipe:NaakyGames.skp</p>
									<p>Twiter: Naakygamers.notwiiter.ndjjn</p>

								</h3>
							</font>
						</div>
						<body>


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
										marginLeft : 10
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

									$(document)
											.ready(
													function() {
														$("#hide")
																.click(
																		function() {
																			$(
																					"ul")
																					.hide();
																		});
														$("#show")
																.click(
																		function() {
																			$(
																					"ul")
																					.show();
																			$(
																					'li')
																					.animate(
																							"slow");
																			slideUp();
																			slideDown();
																		});

														$("#hide")
																.mouseover(
																		function() {
																			$(
																					this)
																					.css(
																							'color',
																							'black');
																		});
														$("#hide")
																.mouseout(
																		function() {
																			$(
																					this)
																					.css(
																							'color',
																							'red');
																		});
														$("#show")
																.mouseover(
																		function() {
																			$(
																					this)
																					.css(
																							'color',
																							'black');
																		});
														$("#show")
																.mouseout(
																		function() {
																			$(
																					this)
																					.css(
																							'color',
																							'red');
																		});

														$(document)
																.ready(
																		function() {

																			var speedText = 300;

																			var speedJump = 200;

																			$(
																					"#menu")
																					.hover(

																							function() {

																								$(
																										this)
																										.next(
																												"span")
																										.stop()
																										.animate(
																												{
																													height : "70px",
																												},
																												speedJump);

																								$(
																										this)
																										.stop()
																										.animate(
																												{
																													lineHeight : "40px"
																												},
																												speedText);

																							},
																							function() {

																								$(
																										this)
																										.next(
																												"span")
																										.stop()
																										.animate(
																												{
																													height : "0px"
																												},
																												speedJump);

																								$(
																										this)
																										.stop()
																										.animate(
																												{
																													lineHeight : "30px"
																												},
																												speedText);

																							});

																		});
													});
								</script>

							</div>
						</body>

						</html>