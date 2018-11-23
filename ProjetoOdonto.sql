//Cria��o do banco de dados
create database projetoodonto;

//Cria��o da tabela Paciente
create table paciente(
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


//Cria��o da tabela Atendimento
create table atendimento(
id int not null auto_increment,
descricao varchar(255),
status tinyint(1),
cpf_paciente varchar(11) not null,
FOREIGN KEY (cpf_paciente) REFERENCES paciente(cpf),
primary key(id))ENGINE=InnoDB DEFAULT CHARSET=utf8;



select paciente.nome, atendimento.* from atendimento join paciente on atendimento.cpf_paciente = paciente.cpf;


select * from atendimento where cpf_paciente=

select paciente.nome, atendimento.* from atendimento join paciente on atendimento.cpf_paciente = paciente.cpf where cpf_paciente= '11951606400';


//Script para preencher alguns pacientes.
insert into paciente (nome, cpf, endereco, numero, bairro,  cep, uf, cidade) values 
('Vitor Tom�s Marcelo Pires', '14064615476', 'Pra�a General Dantas Barreto', '611', 'Centro', '54110-060', 'PE', 'Jaboat�o dos Guararapes'),
('Andr� Ian Corte Real', '02927641463', 'Rua Ant�nio F Moreno', '242','Boa Vista', '56519-470', 'PE', 'Arcoverde'),
('Lu�s Vicente Freitas', '90211064424', 'Rua Maciel Monteiro', '185','Timb�', '54768-652', 'PE', 'Camaragibe'),
('Sebasti�o Martin Arag�o', '43131246405', 'Rua C', '130','Cidade Jardim', '56507-025', 'PE', 'Arcoverde'),
('Edson Anthony Ramos', '42530802432', 'Rua Adalgisa Guimar�es de Souza', '143','Centro', '53401-245', 'PE', 'Paulista');
