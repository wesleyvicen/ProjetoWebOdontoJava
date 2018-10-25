<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="br.com.novaroma.controlador.PacienteControlador"%>
<%@ page import="br.com.novaroma.entidades.Paciente"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
    <head>
    <title>Buscar Paciente</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" href="./img/favicon.png">
</head>
<body>
 <main class="centro">
        <form class="form" method="get">
            <input type="search" placeholder="Digite o CPF" name="cpf" maxlength="11">
            <button class="btn" id="btn_buscar" type="submit" style="cursor:hand" name="buscar">Buscar</button>
        </form>

    </main>
</body>
</html>