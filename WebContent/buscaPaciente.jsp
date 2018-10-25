<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="br.com.novaroma.controlador.PacienteControlador"%>
<%@ page import="br.com.novaroma.entidades.Paciente"%>
<%@ page import="java.util.*"%>
<!DOCTYPE>
<html lang="pt-br">
<head>
<title>Buscar Paciente</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="icon" href="./img/favicon.png">
</head>

<body>

	<main class="centro">
	<form class="form" method="post">
		<span>Deseja buscar um Paciente para visualizar ou atualizar
			Cadastro?</span><br> <input type="text" placeholder="Digite o CPF"
			name="buscar" maxlength="11">
		<button class="btn" id="btn_buscar" type="submit" style="cursor: hand"
			name="buscar">Buscar</button>
	</form>


	<%
		PacienteControlador controlador = new PacienteControlador();
		String buscar = request.getParameter("buscar");
		List<Paciente> lista = new ArrayList();
		if (buscar != null && !buscar.equals("")) {

			long cpf = (Long.parseLong(request.getParameter("buscar")));
			lista = controlador.listarPacientePorId(cpf);
		}
	%>
	<table class="tabela">
		<tr>
			<th>Nome:</th>
			<th>CPF:</th>
			<th>Endereço:</th>
			<th>Número:</th>
			<th>Bairro:</th>
			<th>CEP:</th>
			<th>UF:</th>
			<th>Cidade:</th>
			<th>Distrito:</th>
			<th id="acao">Ação</th>
		</tr>
		<%
			for (Paciente paciente : lista) {
		%>
		<tr>

			<td><%=paciente.getNome()%></td>
			<td><%=paciente.getCpf()%></td>
			<td><%=paciente.getEndereco()%></td>
			<td><%=paciente.getNumero()%></td>
			<td><%=paciente.getBairro()%></td>
			<td><%=paciente.getCep()%></td>
			<td><%=paciente.getUf()%></td>
			<td><%=paciente.getCidade()%></td>
			<td><%=paciente.getDistrito()%></td>
			<td class="remover"><a href = "RemoverPaciente.jsp?cpf=<%=paciente.getCpf()%>">Remover</a>
		</tr>
		<%
			}
		%>
	</table>
		</main>

</body>
</html>