<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
	






	<form align="center" action="addEndereco" method="post">
<h1 align="center">Cadastro de Endereço</h1>
		Digite seu Endereço:<input type="text" name="endereco"><br>
		</br> Digite o Numero:<input type="text" name="numero"><br> </br>
		Digite seu CEP:<input type="number" name="cep"><br> </br>
		Digite sua Cidade:<input type="text" name="cidade"><br> </br>
		Digite seu Estado:<input type="text" name="estado"><br>

		<button>Cadastrar</button>

		<input type="reset" value="Limpar dados">

	</form>

	<h1 align="center">Todos os endereços!</h1>
	<table border=3 align="center">
		<tr>
			<th>id</th>
			<th>Endereço</th>
			<th>Numero</th>
			<th>CEP</th>
			<th>Cidade</th>
			<th>Estado</th>

		</tr>
	
	<c:forEach var="endereco" items="${enderecos}">
		<tr>
			<td>${endereco.idEndereco}</td>
				
		
			<td>${endereco.endereco}</td>
			<td>${endereco.numero}</td>
			<td>${endereco.cep}</td>
			<td>${endereco.cidade}</td>
			<td>${endereco.estado}</td>
				
		</tr>
		</c:forEach>
	</table>





</body>
</html>

<!-- 
  <input type="submit" value="Enviar">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
  <h1>All Persons</h1>
  <c:forEach var="p" items="${persons}">
    Id: ${p.id} Name: ${p.name}<br/>
  </c:forEach>
  
  <h1>Add New</h1>
  <form method="post" action="addPerson">
  Name: <input type="text" name="name"/>
  <button>Add</button>
  </form>
</body>
</html>

 -->