/* CRIAÇÃO DE TABELA 
create table Cliente
(
codCli int not null,
nomeCli varchar(20) not null,
EndCli varchar(40) not null,
baiCli varchar(20) not null,
cidCli varchar(15) not null,
ufCli varchar(2) not null,
telCli varchar(15) null,
constraint PK_Cliente primary key (codCli)
) 

create table NotaFiscal
(
numNota int not null,
codCli int not null,
serieNota varchar(10) not null,
emissaoNota smalldatetime null,
vTotalNota smallmoney not null,
constraint pk_NotaFiscal primary key(numNota),
constraint fk_Cliente foreign key(codCli) references Cliente(codCli)
)

create table Cidade
(codCidade varchar(2)not null,
nomeCidade varchar(40),)

create table Empregado
(numMatricula int,
nome varchar(50),
dataDemissao datetime,
salario float)

create table Estado
(cdEstado varchar(2) not null,
nomeEstado varchar(30),)

ALTERAR TABELAS
alter table Cidade
add primary key (codCidade);

alter table Cidade
add cdEstado char(2) not null,
teste varchar(1) null;

alter table Cidade
drop column teste;

alter table Cidade
alter column cdEstado varchar(2);

alter table cidade
drop constraint PK__Cidade__0FC85A0BB548FB5C;

alter table cidade
add constraint pk_codCidade primary key (codCidade);

alter table Estado
add primary key (cdEstado);

alter table Cidade
add foreign key (cdEstado) references Estado (cdEstado); 
*/

drop table Empregado;