<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="br.com.novaroma.entidades.Atendimento"%>
<%@ page import="br.com.novaroma.controlador.AtendimentoControlador"%>
<%@ page import="java.util.*"%>
<!DOCTYPE>
<html lang="pt-br">
<head>
<title>Buscar Atendimento</title>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<link rel="icon" href="./img/favicon.png">
</head>
<body>
	<%
		Atendimento atendimento = new Atendimento();
		atendimento.setId(Integer.parseInt(request.getParameter("id")));
		atendimento.setStatus(false);
		String fechar = request.getParameter("fecharAtend");
		if (fechar.equalsIgnoreCase("true")) {

			AtendimentoControlador controler = new AtendimentoControlador();
			boolean toReturn = controler.fecharAtend(atendimento);
			if (toReturn) {
				System.out.println("Sucesso!");

			} else {
				System.out.println("Sucesso!");
			}
		} else {
			out.write("PARAMETRO INVÁLIDO PARA FECHAMENTO DE OS");
		}
	%>
</body>
</html>