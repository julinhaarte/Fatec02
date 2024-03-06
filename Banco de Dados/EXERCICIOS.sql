create table Professores(
idProf int not null primary key,
nomeProf varchar(50),
disciplina varchar(15) );

insert into Professores
values
('01', 'Ana Oliveira', 'Português');

update Professores
set nomeProf = 'Ana Silva'
where idProf = '01'

select * from Professores

insert into Professores
values ('02','Pietro', 'Piadocas')

insert into Professores
values ('03','Julinha Soares','Arte');

insert into Professores
values ('04','Ana Laura','Mecâncica');

insert into Professores
values ('05','Victor Favretto','Música Indie');

insert into Professores
values ('06','Murilo Santos','Pokémons');

insert into Professores
values ('07','Felipe Santos','Emo');

insert into Professores
values ('08','Victor Werneck','Beyoncé');

insert into Professores
values ('09','Northon Braguin','Dark Souls');

insert into Professores
values ('10','Evelin','Excel');

insert into Professores
values ('11','Yara','JavaScript');

select * from Professores

delete from Professores
where idProf='2'

select * from Professores

create table Turmas(
idTurmas int identity(1,1),
nomeTurmas varchar(50),
idProf int not null 

Constraint PK_idTurmas Primary Key(idTurmas),
Constraint FK_idProf Foreign Key(idProf) References Professores(idProf)
);

select * from Turmas

exec sp_rename 'Turmas.idProf', 'profResponsável', 'COLUMN';

select * from Turmas

exec sp_rename 'Turmas.profResponsável', 'profResponsavel', 'COLUMN';

insert into Turmas
(nomeTurmas, profResponsavel)
values ('9a','1');

select * from Turmas

insert into Turmas
(nomeTurmas, profResponsavel)
values ('9b','2');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('9c','3');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('9d','4');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('9e','5');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('9f','6');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('8a','7');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('8b','8');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('8c','9');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('8d','10');

insert into Turmas
(nomeTurmas, profResponsavel)
values ('8e','11');

create table Alunos (
idALuno int identity(1,1),
nomeAluno varchar(50),
dataNasc date,
idTurma int not null 
 

Constraint PK_idAluno Primary Key(idAluno),
Constraint FK_idTurma Foreign Key(idTurma) References Turmas(idTurmas)
);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Maria Souza','2005-10-15', 1);

select * from Alunos

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Jéssica Sabiá','1800-02-04', 2);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Naime Naime','2000-07-06', 2);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Dora Tonscheis','2000-05-19', 2);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Malu Orfali','2001-12-18', 2);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('João Pedro','2000-03-27', 2);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Gabi Bibi','2002-08-22', 2);

