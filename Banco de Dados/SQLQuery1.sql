/*create table Alunos (
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
values ('Jessica Sabia','1800-02-04', 9);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Naime Naime','2000-07-06', 3);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Dora Tonscheis','2000-05-19', 4);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Malu Orfali','2001-12-18', 5);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('João Pedro','2000-03-27', 6);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Gabi Bibi','2002-08-22', 7);

insert into Alunos
(nomeAluno, dataNasc, idTurma)
values ('Leonardo Flores','1999-09-18', 8), ('Nicoleta', '1999-09-23', 9),
('Luigi','2018-11-26',10),('Vicente','2018-11-27',11);

select * from Alunos

delete from Alunos
where idALuno=2

create table Notas (
idNota int identity(1,1),
idAluno int not null,
disciplina varchar(15),
nota decimal (5,2),

Constraint PK_idNota Primary Key(idNota),
Constraint FK_idAluno Foreign Key(idAluno) References Alunos(idAluno)
);

insert into Notas
(idAluno, disciplina, nota)
values (1,'Matemática',9.0)

select * from Turmas

insert into Notas
(idAluno, disciplina, nota)
values (3,'Português',6.0), (4,'Arte',10.0), (5,'Mecânica',4.0),
(6,'Música Indie',7.0), (7,'Pokémons',10.0), (8,'Emo',5.0), (9,'Beyoncé',10.0), (10,'Dark Soulas',4.0),
(11,'Excel',6.0), (1,'JavaScript',8.0)

select * from Alunos

delete from Notas
where idAluno=1 and disciplina = 'Matemática'

create table Matricula (
idMatricula int identity(1,1),
idAluno int not null,
idTurmas int not null,
dataMatricula date,

Constraint PK_idMatricula Primary Key(idMatricula),
Constraint FK_idAlunoMatricula Foreign Key(idAluno) References Alunos(idAluno),
Constraint FK_idTurmasMatricula Foreign Key(idTurmas) References Turmas(idTurmas)
);

insert into Matricula
(idAluno, idTurmas, dataMatricula)
values (1,1,'2022-02-15')

select * from Matricula

insert into Matricula
(idAluno, idTurmas, dataMatricula)
values (3,3,'2023-07-07'), (4,4,'2021-11-19'), (5,5,'2022-02-27'), (5,5,'2022-05-30'),
(6,6,'2021-08-20'), (7,7,'2022-07-02'), (8,8,'2022-05-09'), (9,9 ,'2023-05-05'), (10,10,'2022-05-21')
,(11,11,'2022-06-30')