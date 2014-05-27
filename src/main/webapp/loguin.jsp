
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="css/index.css">
<script src="jquery.js" type="text/javascript"></script>
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

									<li><a href="index.jsp"> Home</a></li>
									<li><a href="carrinho.jsp"> Carrinho</a></li>
									<li><a href="pedidos.jsp"> Ver Pedidos</a></li>
									<li><a href="fatura.jsp"> Fatura</a></li>
									<li><a href="loguin.jsp">Login</a></li>
									<li><a href="contato.jsp"> Contato </a></li>
								</ul>
							</div>

							<div id="barradebusca">
								<strong><h1 id="carousel">Naaky Games</h1></strong> <input
									type="text" id="googlesearch"><input type="button"
									class="btn btn-small btn-primary" value="Pesquisar"> <br /></br>
							</div>
						</div>
						<div align="center">
							<h2>Ja é cadastrado, faça aqui seu Login!</h2>



							<h3>
								<input type="text" name="login" value=""
									placeholder="Username or Email" id="usuario">
							</h3><br/>
							<h3>
								<input type="password" name="password" value=""
									placeholder="Password" id="senha">
							</h3>
							<h3 class="remember_me">

								<p class="submit"><input type="submit" class="btn btn-primary" name="commit"
									value="Login">
							</h3><br/>

								<label>
									<h4>
										Deseja que o site salve sua senha.<input type="checkbox"
											name="remember_me" id="remember_me">
									</h4>
									<div id="login-help">
										<p>
											Esqueceu sua senha? <a href="loguin.jsp">Clique aqui!</a>.
										</p>
									</div>
						</div>
						</label>
						</form>
					</div> <script src="js/bootstrap.min.js"></script> <script
						src="js/jquery.js"></script> <script>
							$('#carousel').animate({
								"margin-left" : "+=800"
							}, 10000);

							$("h1,h2").mouseover(function() {
								$(this).css('color', 'black');
							});
							$("h1,h2").mouseout(function() {
								$(this).css('color', 'red');
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
