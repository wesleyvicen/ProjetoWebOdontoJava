<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="br.com.novaroma.controlador.AtendimentoControlador"%>
<%@ page import="br.com.novaroma.entidades.Atendimento"%>
<%@ page import="java.util.*"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE>
<html lang="pt-br">
<head>
<title>Buscar Atendimento</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="icon" href="./img/favicon.png">
</head>
<body>
	<main class="centro">
	<form class="form" method="post">
		<span>Deseja Buscar Atendimentos? Digite o CPF do Paciente
			abaixo:</span><br> <input type="text" placeholder="Digite o CPF"
			name="buscar" maxlength="11">
		<button class="btn" id="btn_buscar" type="submit" style="cursor: hand"
			name="buscar">Buscar</button>
	</form>
	<%
		AtendimentoControlador controlador = new AtendimentoControlador();
		String buscar = request.getParameter("buscar");
		List<Atendimento> lista = new ArrayList();
		if (buscar != null && !buscar.equals("")) {

			long cpf = (Long.parseLong(request.getParameter("buscar")));
			lista = controlador.listarAtendPeloId(cpf);
		}
	%>
	<table class="tabela">
		<tr>
			<th>Nome:</th>
			<th>Descrição:</th>
			<th>Status:</th>
			<th id="acao">Ação</th>
		</tr>
		<c:forEach items="<%=lista%>" var="user">

			<td>${user.nome}</td>
			<td>${user.descricao}</td>

			<c:choose>
				<c:when test="${user.status}">

					<td>Atendimento em Andamento</td>
					<td class="remover"><a
						href="fecharAtendimento.jsp?id=${user.id}&fecharAtend=true">Fechar
							Atendimento</a>
					</tr>
				</c:when>
				<c:otherwise>
					<td>Atendimento Finalizado</td>
					<td class="remover"><a href="iniciarAten.html">Abrir novo
							Atendimento</a>
					</tr>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</table>
	</main>
</body>
</html>