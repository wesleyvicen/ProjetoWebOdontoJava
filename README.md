<img src="https://i.imgur.com/xcVdKnW.jpg">

# Propósito
Projeto foi feito para a disciplica de Desenvolvimento web da Faculdade Nova Roma - FGV

# Linguagens
- HTML
- CSS
- JavaScript
- Java Web (Servlet, JSP, TSTL)
- Banco Mysql

# Funcionalidades já funcionando
- Cadastro
  - Paciente
  - Atendimento
- Remoção
  - Paciente ( Caso não tenha nenhum atendimento em seu CPF )
- Fechar atendimento
  - Atendimento ( Caso esteja em Atendimento, caso contrario, pede para iniciar um novo )
- Listagem
  - Paciente ( Todos )
  - Atendimentos ( Todos )
- Busca
  - Paciente ( Busca por CPF )
  - Atendimentos do paciente ( Busca todos por CPF )
- Atualização
  - Paciente ( Atualizar um paciente sem alterar seu CPF )
  
  # Acessando projeto hospedado
Ainda sem Link para hospedagem.

# Requisitos Edição
- Tomcat 9.x
- Eclipse
- Mysql

# Instalação
- Arquivos Hospdagem
  - Apenas importar os arquivos no Eclipse ou similar e colocar para rodar, caso precise, importe o Servlet, JSP, JSTL e Mysql Connector, Todos contam na biblioteca do projeto.
- Banco de dados

Criar o Banco de dados:
``` 
CREATE DATABASE projetoodonto;
``` 
Selecionar o banco de dados:
``` 
USE projetoodonto;
``` 
Criar tabelas > Paciente:
``` 
CREATE TABLE paciente(
    id int not null auto_increment,
    nome varchar(30) not null,
    cpf varchar(11) not null unique,
    endereco varchar(255),
    numero varchar(4),
    cep varchar(9),
    bairro varchar(10),
    uf varchar(2),
    cidade varchar(30),
    primary key(id)) ENGINE=InnoDB DEFAULT CHARSET=utf8; 
```

Criar tabela > Atendimento:
```
CREATE TABLE atendimento(
    id int not null auto_increment,
    descricao varchar(255),
    status tinyint(1),
    cpf_paciente varchar(11) not null,
    FOREIGN KEY (cpf_paciente) REFERENCES paciente(cpf),
    primary key(id))ENGINE=InnoDB DEFAULT CHARSET=utf8;
```
