<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" href="./img/favicon.png">
        <title>Cadastro Aluno</title>
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
            <input id="cep" type="text" placeholder="CEP" name="cep" size="5" maxlength="5" > - <input id="cep2" placeholder="CEP" type="text" name="cep2" size="3" maxlength="3"><br>
            <input id="uf" type="text" placeholder="UF" name="uf" maxlength="2"><br>
            <input id="cidade" type="text" placeholder="Cidade" name="cidade"><br>
            <input id="municipio" type="text" placeholder="Distrito" name="municipio"><br>
            <button id="btn_cadastrar" class="btn" type="submit" style="cursor:hand" name="cadastrar">Cadastrar</button>
        </form>

        <table class="tabela tabelaCadastroCliente">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>CPF</th>
                    <th>Endereço</th>
                    <th>Número</th>
                    <th>Bairro</th>
                    <th>CEP</th>
                    <th>UF</th>
                    <th>Cidade</th>
                    <th>Distrito</th>
                    <th id="acao">Ação</th>
                </tr>
            </thead>
            <td>Wesley Vicente</td>
            <td>11851606900</td>
            <td>Joaquim Nabuco</td>
            <td>19</td>
            <td>Centro</td>
            <td>55851-000</td>
            <td>PE</td>
            <td>teste</td>
            <td>teste</td>
            <td class="remover">Remover</td>
            <tfoot>
                <td colspan="10">Isso é tudo</td>
            </tfoot>
        </table>
    </main>

</body>
</html>