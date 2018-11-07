<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html lang="pt-br">

<head>
    <title>Cadastro Aluno</title>
    <meta charset="ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" href="./img/favicon.png">
</head>

<body>
    <main class="centro">
        <form class="form" method="post" action="cadastropaciente">
            <input id="nome" type="text" placeholder="Nome" name="nome" autofocus required>
            <input id="sobrenome" type="text" placeholder="Sobrenome" name="sobrenome" required><br>
            <input id="cpf" type="text" placeholder="CPF" name="cpf" size="11" maxlength="11" required><br>
            <input id="endereco" type="text" placeholder="Endereço" name="endereco">
            <input id="numero" type="text" placeholder="Número" name="numero"><br>
            <input id="bairro" type="text" placeholder="Bairro" name="bairro"><br>
            <input id="cep" type="text" placeholder="CEP" name="cep" size="9" maxlength="9" onkeypress="mascara(this, '#####-###')"><br>            
			<select id="uf" name="uf">
				<option value="AC">Acre</option>
				<option value="AL">Alagoas</option>
				<option value="AP">Amapá</option>
				<option value="AM">Amazonas</option>
				<option value="BA">Bahia</option>
				<option value="CE">Ceará</option>
				<option value="DF">Distrito Federal</option>
				<option value="ES">Espírito Santo</option>
				<option value="GO">Goiás</option>
				<option value="MA">Maranhão</option>
				<option value="MT">Mato Grosso</option>
				<option value="MS">Mato Grosso do Sul</option>
				<option value="MG">Minas Gerais</option>
				<option value="PA">Pará</option>
				<option value="PB">Paraíba</option>
				<option value="PR">Paraná</option>
				<option value="PE">Pernambuco</option>
				<option value="PI">Piauí</option>
				<option value="RJ">Rio de Janeiro</option>
				<option value="RN">Rio Grande do Norte</option>
				<option value="RS">Rio Grande do Sul</option>
				<option value="RO">Rondônia</option>
				<option value="RR">Roraima</option>
				<option value="SC">Santa Catarina</option>
				<option value="SP">São Paulo</option>
				<option value="SE">Sergipe</option>
				<option value="TO">Tocantins</option>
			</select><br>            
            <input id="cidade" type="text" placeholder="Cidade" name="cidade"><br>
            <input id="municipio" type="text" placeholder="Distrito" name="municipio"><br>
            <button id="btn_cadastrar" class="btn" type="submit" style="cursor:hand" name="cadastrar">Cadastrar</button>
        </form>

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
		<c:forEach items="${paciente}" var="user">
			<tr>
				<td><c:out value="${user.nome}"></c:out></td>
				<td><c:out value="${user.cpf}"></c:out></td>
				<td><c:out value="${user.endereco}"></c:out></td>
				<td><c:out value="${user.numero}"></c:out></td>
				<td><c:out value="${user.bairro}"></c:out></td>
				<td><c:out value="${user.cep}"></c:out></td>
				<td><c:out value="${user.uf}"></c:out></td>
				<td><c:out value="${user.cidade}"></c:out></td>
				<td><c:out value="${user.distrito}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	</main>
	<script src="js/script.js"></script>
</body>

</html>
