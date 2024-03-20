create table Setor (
codSetor int identity(1,1),
nomeSetor varchar(30) not null,
constraint PK_Setor Primary Key (codSetor));

create table Funcionario (
nrMatricula int identity(1,1),
primeiroNome varchar(20),
ultimoNome varchar(50),
email varchar(200),
telefone varchar(20),
dataAdmissao date,
salario decimal(7,2),
codSetor int,
constraint PK_Funcionario Primary Key (nrMatricula),
constraint FK_Func_Setor Foreign Key(codSetor) references Setor(codSetor));

insert into Setor values
('Tribo da Água do Sul'),
('Tribo da Água do Norte'),
('Nômades do Ar'),
('Reino da Terra'),
('Nação do Fogo'); 

insert into Funcionario values
('Aang', 'dos Nômades do Ar', 'aang@example.com', '123456789', '2022-01-15', 4000.00, 1),
('Katara', 'da Tribo da Água do Sul', 'katara@example.com', '987654321', '2022-02-28', 3500.00, 1),
('Sokka', 'da Tribo da Água do Sul', 'sokka@example.com', '456789123', '2022-03-10', 3200.00, 1),
('Toph', 'do Reino da Terra', 'toph@example.com', '321654987', '2022-04-05', 3800.00, 4),
('Zuko', 'da Nação do Fogo', 'zuko@example.com', '789123456', '2022-05-20', 4200.00, 5),
('Iroh', 'da Nação do Fogo', 'iroh@example.com', '654987321', '2022-06-15', 4500.00, 5),
('Momo', 'dos Nômades do Ar', 'momo@example.com', '123789456', '2022-07-02', 3000.00, 3),
('Appa', 'dos Nômades do Ar', 'appa@example.com', '789456123', '2022-08-10', 3200.00, 3);
 
 select * from Funcionario
update Funcionario
set codSetor = 3
where primeiroNome = 'Aang'

delete from Funcionario
where nrMatricula = '2'