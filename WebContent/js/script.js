var botao_atendimento = document.querySelector("#btn_atendimento");
var botao_cadastrar = document.querySelector("#btn_cadastrar");

//O IF agora vai selecionar qual dos botões foi clicado, se foi o do atendimento ou do cadastro.
if (botao_atendimento) { // criei este If e o proximo para não ficar sempre puxando o preventDefault()
    botao_atendimento.addEventListener("click", function () {
        event.preventDefault(); // Pega o evento e interrompe o evento normal
        adicionar_atendimento();

    });
} else if (botao_cadastrar) {
    botao_cadastrar.addEventListener("click", function () {
        event.preventDefault();
        adicionar_cadastro();

    });

}

//Metodo usado para o atendimento

function adicionar_atendimento() {
    var nome = document.querySelector('#nome').value; // Seleciona um elemento, neste caso o ID Nome
    var data = document.querySelector('#data').value;
    var descricao = document.querySelector('#descricao').value;

    var tabela = document.querySelector(".tabelaAtendimento");

    var linha = document.createElement('tr'); // Cria um elemento, neste Caso um tr
    var td_nome = document.createElement('td');
    var td_data = document.createElement('td');
    var td_descricao = document.createElement('td');

    td_nome.textContent = nome; // Retorna um nó do createElement, neste caso do td_nome
    td_data.textContent = data;
    td_descricao.textContent = descricao;

    linha.appendChild(td_nome); // Devolve uma referência ao nó adicionado, neste caso o td_nome
    linha.appendChild(td_data);
    linha.appendChild(td_descricao);

    tabela.appendChild(linha); // aqui retorna a referência ao nó adicionado no linha
};


//Metodo usado para o Cadastro que nada mais é que o mesmo do atendimento apenas com mais variaveis.
function adicionar_cadastro() {

    var nome = document.querySelector('#nome').value;
    var sobrenome = document.querySelector('#sobrenome').value;
    var cpf = document.querySelector('#cpf').value;
    var endereco = document.querySelector('#endereco').value;
    var numero = document.querySelector('#numero').value;
    var bairro = document.querySelector('#bairro').value;
    var cep = document.querySelector('#cep').value;
    var cep2 = document.querySelector('#cep2').value;
    var uf = document.querySelector('#uf').value;
    var cidade = document.querySelector('#cidade').value;
    var municipio = document.querySelector('#municipio').value;

    var tabela = document.querySelector(".tabelaCadastroCliente");

    var linha = document.createElement('tr');
    var td_nome = document.createElement('td');
    var td_sobrenome = document.createElement('td');
    var td_cpf = document.createElement('td');
    var td_endereco = document.createElement('td');
    var td_numero = document.createElement('td');
    var td_bairro = document.createElement('td');
    var td_cep = document.createElement('td');
    var td_uf = document.createElement('td');
    var td_cidade = document.createElement('td');
    var td_municipio = document.createElement('td');
    var td_remover = document.createElement('td');

    td_nome.textContent = nome + ' ' + sobrenome;
    td_cpf.textContent = cpf;
    td_endereco.textContent = endereco;
    td_numero.textContent = numero;
    td_bairro.textContent = bairro;
    td_cep.textContent = cep + '-' + cep2;
    td_uf.textContent = uf;
    td_cidade.textContent = cidade;
    td_municipio.textContent = municipio;
    td_remover.textContent = 'Remover';
    td_remover.classList.add('remover');

    linha.appendChild(td_nome);
    linha.appendChild(td_cpf);
    linha.appendChild(td_endereco);
    linha.appendChild(td_numero);
    linha.appendChild(td_bairro);
    linha.appendChild(td_cep);
    linha.appendChild(td_uf);
    linha.appendChild(td_cidade);
    linha.appendChild(td_municipio);
    linha.appendChild(td_remover);

    tabela.appendChild(linha);

};
