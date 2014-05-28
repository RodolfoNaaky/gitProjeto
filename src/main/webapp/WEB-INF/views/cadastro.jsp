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

						<title>Cadastro</title> <strong><font color="red"><h2>Cadastro
									Rápido</h2></font></strong>

						<form id="cadastro" name="cadastro" method="post" action=""
							onsubmit="return validaCampo(); return false;">
							<table align="center">

								<tr>
									<td>Nome:</td>
									<td><input name="nome" type="text" id="nome" /> <span
										class="style1">*</span></td>
								</tr>
								<tr id="jogo">
									<td>Data de Nascimento:</td>
									<td><input name="nascimento" type="date" /> <span
										class="style1">*</span></td>
								</tr>
								<tr id="anda">
									<td>DDD:</td>
									<td><input name="ddd" type="text" id="ddd" /><br />
								</tr>
								<tr>
									<td>Telefone:</td>
									<td><input name="telefone" type="text" id="telefone" /> <span
										class="style3">(Apenas números)</span></td>
								</tr>
								<tr>
									<td>Email:</td>
									<td><input name="email" type="text" id="email" /> <span
										class="style1">*</span></td>
								</tr>
								<tr>
									<td>Endereço:</td>
									<td><input name="endereco" type="text" id="endereco" /> <span
										class="style1">*</span></td>
								</tr>
								<td>Número:</td>
								<td><input name="numero" type="number" id="date" /> <span
									class="style1">*</span></td>
								</tr>
								<tr>
									<td>CEP:</td>
									<td><input name="cep" type="number" id="nome" /> <span
										class="style1">*</span></td>
								</tr>
								<tr>
									<td>Cidade:</td>
									<td><input name="cidade" type="text" id="nome" /> <span
										class="style1">*</span></td>
								</tr>
								<tr>
									<td>Estado:</td>
									<td><select name="estado" id="estado" class= "btn btn-small btn-primary">
											<option>Selecione...</option>
											<option value="AC">AC</option>
											<option value="AL">AL</option>
											<option value="AP">AP</option>
											<option value="AM">AM</option>
											<option value="BA">BA</option>
											<option value="CE">CE</option>
											<option value="ES">ES</option>
											<option value="DF">DF</option>
											<option value="MA">MA</option>
											<option value="MT">MT</option>
											<option value="MS">MS</option>
											<option value="MG">MG</option>
											<option value="PA">PA</option>
											<option value="PB">PB</option>
											<option value="PR">PR</option>
											<option value="PE">PE</option>
											<option value="PI">PI</option>
											<option value="RJ">RJ</option>
											<option value="RN">RN</option>
											<option value="RS">RS</option>
											<option value="RO">RO</option>
											<option value="RR">RR</option>
											<option value="SC">SC</option>
											<option value="SP">SP</option>
											<option value="SE">SE</option>
											<option value="TO">TO</option>
									</select> <span class="style1"> </span></td>
								</tr>


								<td colspan="2"><input name="news" type="checkbox"
									id="news" value="ATIVO" checked="checked"> Desejo
									receber Promoções de ofertas deste Site!</td>
								</tr>

									<td colspan="2"><h4>
											<input class="btn btn-small btn-primary" type="submit" id="cadastrar"
												value="Ok" /> <input class="btn btn-small btn-primary" type="reset"
												id="limpar" value="Limpar" /> <span class="style1">
												Campos com (*)são obrigatórios! </span>
										</h4> 
										
										
										<script src="resources/js/bootstrap.min.js"></script>
		<script src="resources/js/jquery.js"></script>
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
