
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="br.com.novaroma.controlador.PacienteControlador"%>
<%@ page import="br.com.novaroma.entidades.Paciente"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
    <head>
    <title>Atualizar Paciente</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" href="./img/favicon.png">
</head>
<body>
 <main class="centro">

<%
	String nome = request.getParameter("nome");
	String sobrenome = request.getParameter("sobrenome");
	String cpf = request.getParameter("cpf");
	String endereco = request.getParameter("endereco");
	String numero = request.getParameter("numero");
	String bairro = request.getParameter("bairro");
	String cep = request.getParameter("cep");
	String cep2 = request.getParameter("cep2");
	String uf = request.getParameter("uf");
	String cidade = request.getParameter("cidade");
	String municipio = request.getParameter("municipio");
%>

        <form class="form" method="post">
            <input id="nome" type="text" placeholder="Nome" name="nome" autofocus required value =<%=nome%>>
            <input id="sobrenome" type="text" placeholder="Sobrenome" name="sobrenome" required value =<%=sobrenome%>><br>
            <input id="cpf" type="text" placeholder="CPF" name="cpf" size="11" maxlength="11" required value =<%=cpf%>><br>
            <input id="endereco" type="text" placeholder="Endereço" name="endereco" value =<%=endereco%>>
            <input id="numero" type="text" placeholder="Número" name="numero" value =<%=numero%>><br>
            <input id="bairro" type="text" placeholder="Bairro" name="bairro" value =<%=bairro%>><br>
            <input id="cep" type="text" placeholder="CEP" name="cep" size="5" maxlength="5" value =<%=cep%>> - <input id="cep2" placeholder="CEP" type="text" name="cep2" size="3" maxlength="3" value =<%=cep2%>><br>
            <input id="uf" type="text" placeholder="UF" name="uf" maxlength="2" value =<%=uf%>><br>
            <input id="cidade" type="text" placeholder="Cidade" name="cidade" value =<%=cidade%>><br>
            <input id="municipio" type="text" placeholder="Distrito" name="municipio" value =<%=municipio%>><br>
            <button id="btn_cadastrar" class="btn" type="submit" style="cursor:hand" name="cadastrar">Atualizar</button>
        </form>
<!-- Link: http://localhost/ProjetoOdonto/AtualizarParametros.jsp?nome=WESLEY+VICENTE&sobrenome=SILVA&cpf=11122233344&endereco=Pra%C3%A7a+Joaquim+Nabuco%2C+10&numero=10&bairro=Centro&cep=55850&cep2=558&uf=PE&cidade=Vic%C3%AAncia&municipio=Teste1&cadastrar=
-->

    </main>
</body>
</html>