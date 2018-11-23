<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="br.com.novaroma.controlador.AtendimentoControlador"%>
<%@ page import="br.com.novaroma.entidades.Atendimento"%>
<%@ page import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Lista de Atendimentos</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="icon" href="./img/favicon.png">
</head>
<body>
	<%
		AtendimentoControlador controlador = new AtendimentoControlador();
		List<Atendimento> lista = controlador.listarTodosAtend();
	%>
	<h1>Listagem de Atendimento</h1>
	<table class="tabela">
		<tr>
			<th>CPF:</th>
			<th>Nome:</th>
			<th>Descrição::</th>
			<th>Status:</th>

		</tr>
		<c:forEach items="<%=lista%>" var="user">
			<tr>
				<td>${user.cpfPaciente}</td>
				<td>${user.nome}</td>
				<td>${user.descricao}</td>
				
				<c:if test="${user.status}">
					<td>Atendimento em Andamento</td>
				</c:if>
				
				<c:if test="${not user.status}">
					<td>Atendimento Finalizado</td>
				</c:if>

			</tr>
		</c:forEach>
	</table>

</body>
</html>