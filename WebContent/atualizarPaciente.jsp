<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="br.com.novaroma.controlador.PacienteControlador"%>
<%@ page import="br.com.novaroma.entidades.Paciente"%>
<%@ page import="java.util.*"%>

<!DOCTYPE>
<html lang="pt-br">
<head>
<title>Atualizar Paciente</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta charset="utf-8">
<link rel="icon" href="./img/favicon.png">
</head>
<body>

	<main class="centro">
	<form class="form" method="post">
		<span>Digite um CPF valido para atualizar um paciente.</span><br> <input type="text" placeholder="Digite o CPF"
			name="buscar" maxlength="11">
		<button class="btn" id="btn_buscar" type="submit">Buscar</button>
	</form>


	<%
		PacienteControlador controlador = new PacienteControlador();
		String buscar = request.getParameter("buscar");
		List<Paciente> lista = new ArrayList();
		if (buscar != null && !buscar.equals("")) {

			long cpf = (Long.parseLong(request.getParameter("buscar")));
			lista = controlador.listarPacientePorId(cpf);
		}
			for (Paciente paciente : lista) {
		%>
		<br>
		 <form class="form" method="post" action = "atualizarPaciente">
		 <label for="nome">Nome:</label>
            <input id="nome" type="text" placeholder="Nome" name="nome" autofocus required value =<%=paciente.getNome()%>>
            <label for="cpf">CPF:</label>
            <input id="cpf" type="text" placeholder="CPF" name="cpf" size="11" maxlength="11" required value =<%=paciente.getCpf()%>><br>
            <label for="endereco">Endereço:</label>
            <input id="endereco" type="text" placeholder="Endereço" name="endereco" value =<%=paciente.getEndereco()%>>
           <label for="numero">Nº:</label>
            <input id="numero" type="text" placeholder="Número" name="numero" value =<%=paciente.getNumero()%>><br>
            <label for="bairro">Bairro:</label>
            <input id="bairro" type="text" placeholder="Bairro" name="bairro" value =<%=paciente.getBairro()%>><br>
           <label for="cep">CEP:</label>
            <input id="cep" type="text" placeholder="CEP" name="cep" size="9" maxlength="9" value =<%=paciente.getCep()%> onkeypress="mascara(this, '#####-###')"><br>
            <label for="uf">UF(Estado):</label>
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
            <label for="cidade">Cidade:</label>
            <input id="cidade" type="text" placeholder="Cidade" name="cidade" value =<%=paciente.getCidade()%>><br>
            <label for="municipio">Municipio:</label>
            <input id="municipio" type="text" placeholder="Distrito" name="municipio" value =<%=paciente.getDistrito()%>><br>
            <button id="btn_cadastrar" class="btn" type="submit" style="cursor:hand" name="cadastrar">Atualizar</button>
        </form>
		<%
			}
		%>
	</main>
	<script src="js/script.js"></script>
</body>
</html>