<%@page import="br.com.novaroma.controlador.PacienteControlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remover Paciente</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="icon" href="./img/favicon.png">
</head>
<body>
	<%
		PacienteControlador controler = new PacienteControlador();
	boolean toReturn = false;
	%>
	<main class="centro">
	<form class="form" method="post">
		<span>Digite um CPF existente no Banco para remover.</span> <br>
		<input type="text" placeholder="Digite o CPF" name="cpf_paciente"
			maxlength="11" value="${sessionScope.cpf}">
		<button class="btn" id="btn_buscar" type="submit" style="cursor: hand"
			name="buscar">Remover</button>
	</form>
	<% toReturn = controler.deletarPaciente(request.getParameter("cpf_paciente"));%>

	</main>
</body>
</html>