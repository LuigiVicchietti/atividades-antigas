create database bdEscolaIdiomas2
 use bdEscolaIdiomas2

 create table tbCurso (
 idCurso int PRIMARY KEY IDENTITY (1,1)
 , nomeCurso varchar(30)
 , valorCurso smallmoney
 )

 create table tbAluno (
 idAluno int PRIMARY KEY IDENTITY (1,1)
 , nomeAluno varchar (50)
 , dtnascimentoAluno smalldatetime
 , rgAluno varchar (12)
 , cpfAluno varchar (14)
 , logradouroAluno varchar (50)
 , numeroAluno varchar (10)
 , complementoAluno varchar (30)
 , cepAluno varchar (8)
 , bairroAluno varchar (50)
 , cidadeAluno varchar (20)
 )

 create table tbTelefoneAluno (
 idTelAluno int PRIMARY KEY IDENTITY (1,1)
 , numTelAluno varchar (11)
 , idAluno int FOREIGN KEY REFERENCES tbAluno (idAluno)
 )

 create table tbNivel (
 idNivel int PRIMARY KEY IDENTITY (1,1)
 , descricaoNivel varchar (50)
 )

 create table tbPeriodo (
 idPeriodo int PRIMARY KEY IDENTITY (1,1)
 , descricaoPeriodo varchar (50)
 )

 create table tbTurma (
 idTurma int PRIMARY KEY IDENTITY (1,1)
 , nomeTurma varchar (30)
 , descricaoTurma varchar (50)
 , diaDaSemanaTurma varchar(30)
 , horarioTurma smalldatetime
 , idCurso int FOREIGN KEY REFERENCES tbCurso (idCurso)
 , idNivel int FOREIGN KEY REFERENCES tbNivel (idNivel)
 , idPeriodo int FOREIGN KEY REFERENCES tbPeriodo (idPeriodo)
 )

 create table tbMatricula (
 idMatricula int PRIMARY KEY IDENTITY (1,1)
 , dataMatricula smalldatetime
 , idTurma int FOREIGN KEY REFERENCES tbTurma (idTurma)
 , idAluno int FOREIGN KEY REFERENCES tbAluno (idAluno)
 )

 /*-----------------------------------------------------------------------------*/

select * from tbAluno
select * from tbCurso
select * from tbTurma
select * from tbMatricula

INSERT INTO tbAluno(nomeAluno, dtnascimentoAluno, rgAluno, cpfAluno)
VALUES ('Paulo Santos','10/03/2000','82.282.122-0', '541.733.968-29')
		, ('Maria da Gloria','03/10/1999','45.233.123-0', '745.553.999-13')
		, ('Pedro Nogueira da Silva','04/04/1998','25.533.211-9', '666.777.150-45')
		, ('Gilson Barros Silva','09/09/1995','34.221.111-9', '835.925.999-86')
		, ('Mariana Barbosa Santos','10/10/2001','54.222.122-9', '900.066.323-69')
		, ('Alessandro Pereira','11/10/2003','24.402.454-9', '366.365.367-36')
		, ('Aline Melo','08/10/2001','88.365.012-3', '999.444.777-61')

INSERT INTO tbCurso(nomeCurso, valorCurso)
VALUES ('Inglês','356')
		, ('Alemão','478')
		, ('Espanhol','500')

INSERT INTO tbTurma(nomeTurma, descricaoTurma, diaDaSemanaTurma, idCurso, horarioTurma)
VALUES ('Turma A', 'Turma do curso de inglês ao meio dia', 'Terça', 1,'01/01/1901 12:00:00')
		, ('Turma B', 'Turma do curso de espanhol as seis da tarde', 'Quarta', 3,'01/01/1901 18:00:00')
		, ('Turma C', 'Turma do curso de inglês as seis da tarde', 'Terca', 1,'01/01/1901 18:00:00')
		, ('Turma D', 'Turma do curso de alemão as sete da noite', 'Sexta', 2,'01/01/1901 19:00:00')

INSERT INTO tbMatricula(dataMatricula, idAluno, idTurma)
VALUES ('03/10/2015',1,1)
		, ('04/05/2014',2,1)
		, ('04/05/2014',2,4)
		, ('03/05/2012',3,2)
		, ('03/03/2016',1,3)
		, ('07/05/2015',4,2)
		, ('05/07/2015',4,3)

 /*-----------------------------------------------------------------------------*/

/* A) */

Select nomeCurso as 'Nome do curso', valorCurso as 'Média valor do curso' from tbCurso
	WHERE valorCurso <= (Select AVG (valorCurso) from tbCurso)

/* B) */

Select nomeAluno as 'Nome do aluno', rgAluno as 'RG do aluno', dtnascimentoAluno as 'Data de nascimento do aluno' from tbAluno
	WHERE dtnascimentoAluno IN (Select MAX (dtNascimentoAluno) from tbAluno)

/* C) */

Select nomeAluno as 'Nome do aluno', dtnascimentoAluno as 'Data de nascimento do aluno' from tbAluno
	WHERE dtnascimentoAluno IN (Select MIN (dtNascimentoAluno) from tbAluno)

/* D) */

Select nomeCurso as 'Nome do curso', valorCurso as 'Valor do curso' from tbCurso
	WHERE valorCurso = (Select MAX (valorCurso) from tbCurso)

/* E) */

Select nomeAluno as 'Nome do aluno', nomeCurso as 'Nome do curso', dataMatricula as 'Data da matrícula' from tbAluno
	inner join tbMatricula
	on tbAluno.idAluno = tbMatricula.idAluno
	inner join tbTurma
	on tbMatricula.idTurma = tbTurma.idTurma
	inner join tbCurso
	on tbTurma.idCurso = tbCurso.idCurso
		WHERE dataMatricula = (Select MAX (dataMatricula) from tbMatricula)

/* F) */

Select nomeAluno as 'Nome do aluno', dataMatricula as 'Data da matrícula' from tbAluno
	inner join tbMatricula
	on tbAluno.idAluno = tbMatricula.idAluno
		WHERE dataMatricula = (Select MIN (dataMatricula) from tbMatricula)

/* G) */

Select nomeAluno as 'Nome do aluno', rgAluno as 'RG do aluno', dtnascimentoAluno as 'Data de nascimento do aluno'
, nomeCurso as 'Nome do curso' from tbAluno
	inner join tbMatricula
	on tbAluno.idAluno = tbMatricula.idAluno
	inner join tbTurma
	on tbMatricula.idTurma = tbTurma.idTurma
	inner join tbCurso
	on tbTurma.idCurso = tbCurso.idCurso
		WHERE nomeCurso IN (Select nomeCurso from tbCurso
								where nomeCurso like 'Inglês')