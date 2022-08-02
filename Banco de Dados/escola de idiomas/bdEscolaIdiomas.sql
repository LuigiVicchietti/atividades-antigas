 create database bdEscolaIdiomas
 use bdEscolaIdiomas

 create table tbCurso (
 idCurso int PRIMARY KEY IDENTITY (1,1)
 , nomeCurso varchar(30)
 , cargahorariaCurso smallmoney
 , valorCurso smallmoney
 )

 create table tbAluno (
 idAluno int PRIMARY KEY IDENTITY (1,1)
 , nomeAluno varchar (50)
 , dtnascimentoAluno smalldatetime
 , rgAluno varchar (12)
 , naturalidadeAluno varchar (2)
 )

 create table tbTurma (
 idTurma int PRIMARY KEY IDENTITY (1,1)
 , nomeTurma varchar (5)
 , horarioTurma smalldatetime
 , idCurso int FOREIGN KEY REFERENCES tbCurso (idCurso)
 )

 create table tbMatricula (
 idMatricula int PRIMARY KEY IDENTITY (1,1)
 , dataMatricula smalldatetime
 , idTurma int FOREIGN KEY REFERENCES tbTurma (idTurma)
 , idAluno int FOREIGN KEY REFERENCES tbAluno (idAluno)
 )

 */-----------------------------------------------------------------------------/*

 select * FROM tbAluno 
 select * FROM tbCurso
 select * FROM tbTurma
 select * FROM tbMatricula

 insert into tbAluno (nomeAluno, dtnascimentoAluno, rgAluno, naturalidadeAluno)
 values
 ('Paulo Santos', '03/10/2000', '82.282.122-0', 'SP')
 , ('Maria da Glória', '10/03/1999', '45.233.123-0', 'SP')
 , ('Pedro Nogueira da Silva', '04/04/1998', '23.533.211-9', 'SP')
 , ('Gilson Barros Silva', '09/09/1995', '34.221.111-x', 'PE')
 , ('Mariana Barbosa Santos', '10/10/2001', '54.222.122-9', 'RJ')
 , ('Alessandro Pereira', '10/11/2003', '24.402.454-9', 'ES')
 , ('Aline Melo', '10/08/2001', '88.365.012-3', 'RJ')

 insert into tbCurso (nomeCurso, cargahorariaCurso, valorCurso)
 values
 ('Inglês', 2000, 356)
 ,('Alemão', 3000, 478)
 ,('Espanhol', 4000, 500)

 insert into tbTurma (nomeTurma, horarioTurma, idCurso)
 values
 ('1/A', '01/01/1900 12:00:00', 1)
 ,('1/C', '01/01/1900 18:00:00', 3)
 ,('1/B', '01/01/1900 18:00:00', 1)
 ,('1AA', '01/01/1900 19:00:00', 2)

 insert into tbMatricula (dataMatricula, idTurma, idAluno)
 values
 ('10/03/2015', 1, 1)
 ,('05/04/2014', 2, 2)
 ,('05/04/2014', 2, 4)
 ,('05/03/2012', 3, 2)
 ,('03/03/2016', 1, 3)
 ,('05/07/2015', 4, 2)
 ,('07/05/2015', 4, 3)

 /*------------------------------------------------------------------------------*/

select nomeAluno as 'Nome dos alunos', nomeCurso as 'Nome cursos' FROM tbAluno
inner join tbMatricula  
on tbAluno.idAluno = tbMatricula.idMatricula
inner join tbTurma
on tbAluno.idAluno = tbTurma.idTurma
inner join tbCurso
on tbAluno.idAluno = tbCurso.idCurso

select count (idAluno) as 'Quantidade alunos', nomeCurso as 'Quantidade de alunos por nome de curso' FROM tbCurso
inner join tbTurma 
on tbCurso.idCurso = tbTurma.idCurso
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
group by nomeCurso

select count (idAluno) as 'Quantidade alunos', nomeTurma as 'Quantidade de alunos por nome de curso' FROM tbTurma
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
group by nomeTurma

select count (idAluno) as 'Quantidade alunos', dataMatricula as 'Matricula' FROM tbMatricula
where datepart (year,dataMatricula) = 2016 and datepart (month,dataMatricula) = 5
group by dataMatricula

select nomeAluno as 'Nome dos alunos em ordem alfabética', nomeTurma as 'Nome turmas', nomeCurso as 'Nome cursos' FROM tbCurso
inner join tbTurma
on tbCurso.idCurso = tbTurma.idCurso
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
inner join tbAluno
on tbMatricula.idAluno = tbAluno.idAluno
group by nomeAluno, nomeTurma, nomeCurso
order by nomeAluno

select nomeCurso as 'Nome dos cursos', nomeTurma as 'Nome turmas', convert(varchar,horarioTurma,8) as 'Horários dos cursos' FROM tbCurso
inner join tbTurma
on tbCurso.idCurso = tbTurma.idCurso
group by horarioTurma, nomeCurso, nomeTurma

select tbAluno.nomeAluno as 'Nome Alunos', naturalidadeAluno  as 'Naturalidade do aluno', nomeCurso as 'Nome curso' FROM tbCurso
inner join tbTurma
on tbCurso.idCurso = tbTurma.idCurso
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
inner join tbAluno
on tbMatricula.idAluno = tbAluno.idAluno
where nomeCurso like 'Inglês'

select nomeAluno as 'Nome dos alunos', convert(varchar,dataMatricula,103) as 'Data da matrícula no formato DD/MM/AAAA'from tbMatricula
inner join tbAluno
on tbMatricula.idAluno = tbAluno.idAluno

select tbAluno.nomeAluno as 'Nome Alunos', nomeCurso as 'Nome curso' FROM tbCurso
inner join tbTurma
on tbCurso.idCurso = tbTurma.idCurso
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
inner join tbAluno
on tbMatricula.idAluno = tbAluno.idAluno
where nomeCurso like 'Inglês' and nomeAluno like 'A%'

select count (idMatricula) as 'Quantidade de matriculas feitas no ano de 2016' FROM tbMatricula
where datepart (year,dataMatricula) = 2016

select count (idMatricula) as 'Quantidade de matriculas', nomeCurso as 'Nome curso' FROM tbMatricula
inner join tbTurma
on tbMatricula.idTurma = tbTurma.idTurma
inner join tbCurso
on tbTurma.idCurso = tbCurso.idCurso
where datepart (year,dataMatricula) = 2016
group by idMatricula, nomeCurso

select tbAluno.nomeAluno as 'Nome Alunos', nomeCurso as 'Nome curso' FROM tbCurso
inner join tbTurma
on tbCurso.idCurso = tbTurma.idCurso
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
inner join tbAluno
on tbMatricula.idAluno = tbAluno.idAluno
where valorCurso >300

select tbAluno.nomeAluno as 'Nome Alunos', nomeCurso as 'Nome curso' FROM tbCurso
inner join tbTurma
on tbCurso.idCurso = tbTurma.idCurso
inner join tbMatricula
on tbTurma.idTurma = tbMatricula.idTurma
inner join tbAluno
on tbMatricula.idAluno = tbAluno.idAluno
where nomeCurso like 'Alemão'