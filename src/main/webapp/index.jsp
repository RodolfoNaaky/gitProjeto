<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" media="screen">
	<script src="resources/jquery.js" type="text/javascript"></script>   
</head>

<body>
		<div id="menu" align="center">
		<ul>
		<li><a href="index.jsp">Home</a></li>
		<li><a href="carrinho">Carrrinho</a></li>
		<li><a href="pedidos">Ver Pedidos</a></li>
		<li><a href="fatura">Fatura</a></li>
		<li><a href="login">Login</a></li>
		<li><a href="contato">Contato</a></li>
		</ul>
		</div>
		<div id="barradebusca">
		<h1>Naaky Games</h1>
		<input type="text" name="googlesearch"><input type="button" value="pesquisar">
		<br/>
		</div>

		<h2><strong>Produtos</strong></h2>
		<br/>
		
		<div id="imagem">
		<font align="center" color="blue">

		<a href="comprarps4.jsp"><img src="resources/imagens/PS4.jpg"
		onMouseOver="this.src='resources/imagens/PS42.jpg'"
		onMouseOut="this.src='resources/imagens/PS4.jpg'" width="500" height="300"></img></a> 
		<p>Valor:R$1.669,00</p>
		<p>12x R$161,32</p>
			<p>sem juros</p>
			</font>
		</div>

		<div id="imagem1">
		<font align="center" color="red">
		<a href="comprarxbox.jsp"><img src="resources/imagens/xboxone.jpg"
		onMouseOver="this.src='resources/imagens/xbox2.jpg'"
		onMouseOut="this.src='resources/imagens/xboxone.jpg'" width="500" height="300"></img></a> 
		<p>Valor:R$1.999,00</p>
		<p>12x R$165,83</p>
		<p>sem juros</p>
		</font>
		</div>

		<br/>

		<div id="imagem2">
		<font align="center" color="red">
		<a href="comprarps3.jsp"><img src="resources/imagens/PS3.png"
		onMouseOver="this.src='resources/imagens/PS32.jpg'"
		onMouseOut="this.src='resources/imagens/PS3.png'" width="500" height="300"></img></a> 
		<p>Valor:R$1.249,00</p>
		<p>12x 104,80</p>
<p>			sem juros</p></font>
		</div>

		<div id="imagem3"><font align="center" color="red">
		<a href="Comprarwii.jsp"><img src="resources/imagens/Nintendo.jpg"
		onMouseOver="this.src='resources/imagens/wii2.jpg'"
		onMouseOut="this.src='resources/imagens/Nintendo.jpg'" width="500" height="300"></img></a> 
		<p>Valor:R$489,90</p>
				<p>12x R$48,83<p>
		<p>sem juros</p>	
		</font>
		</div>

<div>

<script>
$('h1').animate( {"margin-left" : "+=750"},10000 );
</script>

</div>
</body>
</html>
