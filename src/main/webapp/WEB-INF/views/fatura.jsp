<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="resources/css/style.css">
	<script src="resources/js/jquery.js" type="text/javascript"></script>   
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
		<input type="search" name="googlesearch"><input type="button" value="pesquisar">
		</br></br>
		</div>


<div id="fatura" align="center">

<p><font color="red">
Você não possui nenhuma fatura para ser visualizada ainda!<br/> Faça uma compra agora...
</font></p>

<hr align="center" color="red" size="5">
</hr>
<br/>
<hr align="center" color="red" size="5">
</hr>
<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<hr align="center" color="red" size="5">
</hr>
<br/>
<hr align="center" color="red" size="5">
</hr>


</div>
<div>

<script>
$('h1').animate( {"margin-left" : "+=750"},10000 );
</script>

</div>
<div>
</div>
</body>



</html>
