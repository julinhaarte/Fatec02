/*insert into Estado
values 
('SP', 'São Paulo');

insert into Cidade
values 
('1', 'Vototantim', 'SP');

insert into Cidade (codCidade, nomeCidade,	cdEstado)
values
('2','Sorocaba', 'SP');

Select * from Estado
Select * from Cidade

insert into Cidade (codCidade, nomeCidade, cdEstado)
values ('3', 'Itu', 'NN')

insert into Cidade (codCidade, nomeCidade, cdEstado)
values ('4', 'Itapira', 'NN')


insert into Estado
values ('NN', 'Não cadastrado');

update Cidade
set cdEstado = 'SP'
where cdEstado= 'NN'

insert into Estado
values ('SC', 'Santa Catarina');
	
insert into Cidade
values ('5', 'Florianópolis', 'SC');

select * from Cidade
where cdEstado='Sp'

update Cidade
set cdEstado = 'NN'
where nomeCidade in ('Itu', 'Itapira')

update Cidade
set cdEstado = 'SP'
where cdEstado= 'NN'

delete from Cidade
where nomeCidade='itapira'

delete from Cidade	
where cdEstado='sp'

insert into Cidade (codCidade, nomeCidade, cdEstado)
values ('3', 'Itu', 'SP')

insert into Cidade (codCidade, nomeCidade, cdEstado)
values ('4', 'Itapira', 'SP')

insert into Cidade
values 
('1', 'Vototantim', 'SP');

insert into Cidade (codCidade, nomeCidade,	cdEstado)
values
('2','Sorocaba', 'SP');

Select * from Estado
Select * from Cidade

create table Tbl_Clientes(
codigo int identity (1,1) primary key,
Nome varchar(100),
UF varchar(2) );

insert into Tbl_Clientes
(Nome, UF)
values ('Mu','SP');

select * from Tbl_Clientes

insert into Tbl_Clientes
values ('Ana', 'SP'), ('Pietro', 'SP');
select * from Tbl_Clientes 

update Tbl_Clientes
set Nome='Northon'
where codigo ='2'

select ident_current('Tbl_Clientes') as Ultimo_Registro;

sp_rename 'Tbl_Clientes','TblClientes';*/

select * from TblClientes
