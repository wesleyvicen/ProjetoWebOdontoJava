<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="br.com.novaroma.controlador.PacienteControlador"%>
<%@ page import="br.com.novaroma.entidades.Paciente"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Pacientes</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" href="./img/favicon.png">
</head>
<body>
	<%
		PacienteControlador controlador = new PacienteControlador();
		List<Paciente> lista = controlador.listar();
	%>
	<h1>Listagem de Paciente</h1>
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
		</tr>
		<%
			}
		%>
	</table>

</body>

</html>