use bdEscolaIdiomas2

/* Exercício 1: Criar uma stored procedure "Busca_Aluno" que receba o código do aluno e retorne seu nome e data de nascimento. */

create Procedure spBusca_Aluno
	@idAluno INT

AS
	BEGIN
		SELECT nomeAluno AS 'Nome do Aluno', dtNascimentoAluno AS 'data de Nascimento do Aluno' FROM tbAluno
			Where @idAluno = idAluno
	END

	EXEC spBusca_Aluno 2

/* Exercício 2: Criar uma stored procedure "Insere_Aluno" que insira um registro na tabela de alunos. */

create Procedure spInsere_Aluno
	@nomeAluno VARCHAR(50)
	, @dtNascimentoAluno SMALLDATETIME
	, @rgAluno VARCHAR(12)
	, @cpfAluno VARCHAR(14)
	, @numeroAluno VARCHAR(10)

AS
	BEGIN
		INSERT INTO tbAluno (nomeAluno, dtnascimentoAluno, rgAluno, cpfAluno, numeroAluno)
		Values (@nomeAluno, @dtnascimentoAluno, @rgAluno, @cpfAluno, @numeroAluno)
			PRINT ('O Aluno '+@nomeAluno+ ' foi cadastrado com sucesso!')
	END

	EXEC spInsere_Aluno 'Paula Dantas','10/07/2007','86.212.022-3', '521.233.928-79', '9552216091'

/* Exercício 3: Criar uma stored procedure "Aumenta_Preco" que, dados do nome do curso e um percentual, aumente o valor do curso com a porcentagem informada. */

create Procedure spAumenta_Preco
	@nomeCurso VARCHAR(30)
	, @porcentagem INT

	AS
		UPDATE tbCurso
			SET valorCurso = valorCurso + (valorCurso * @porcentagem / 100)

			SELECT nomeCurso AS 'Nome do Curso', valorCurso AS 'Valor do Curso com aumento' FROM tbCurso
				Where @nomeCurso = nomeCurso

	EXEC spAumenta_Preco 'Alemão', 5

/* Exercício 4: Criar uma stored procedure "Exibe_Turma" que, dado o nome da turma exiba todas as informações dela. */

create Procedure spExibe_Turma
	@nomeTurma VARCHAR(50)

AS
	BEGIN
		SELECT nomeTurma AS 'Nome da Turma', descricaoTurma AS 'Descrição da turma'
		, diaDaSemanaTurma AS 'Dia da Semana da Turma',horarioTurma AS 'Horário da Turma' FROM tbTurma
			Where @nomeTurma = nomeTurma
	END

	EXEC spExibe_Turma 'Turma C'

/* Exercício 5: Criar uma stored procedure "Exibe_AlunosdaTurma" que, dado o nome da turma exiba os seus alunos. */

create Procedure spExibe_AlunosdaTurma
	@nomeTurma varchar(50)

AS
	BEGIN
		SELECT nomeAluno AS 'Nome do Aluno', nomeTurma AS 'Nome da Turma' FROM tbAluno
			Inner join tbMatricula
				on tbAluno.idAluno = tbMatricula.idAluno
			Inner join tbTurma
				on tbMatricula.idTurma = tbTurma.idTurma
					Where @nomeTurma = nomeTurma
	END

	EXEC spExibe_AlunosdaTurma 'Turma A'

/* Exercício 6: Criar uma stored procedure para inserir alunos, verificando pelo cpf se o aluno existe ou não, e informar essa condição via mensagem. */

CREATE PROCEDURE spInserir_Validar_Aluno
	@nomeAluno VARCHAR(50)
	, @dtNasmentoAluno SMALLDATETIME
	, @rgAluno VARCHAR(12)
	, @cpfAluno VARCHAR(14)
	, @numeroAluno VARCHAR(10)

AS
	BEGIN
		declare @idAluno INT
			if exists (SELECT cpfAluno FROM tbAluno
							WHERE cpfAluno like @cpfAluno)
		BEGIN
			PRINT ('Não é posssivel cadastrar. O CPF '+@cpfAluno+ 'já existe!')
		END
			ELSE
				BEGIN
					Insert tbAluno(nomeAluno, dtNascimentoAluno, rgAluno, cpfAluno, numeroAluno)
					Values
					(@nomeAluno, @dtNasmentoAluno, @rgAluno, @cpfAluno, @numeroAluno)

					SET @idAluno = (SELECT MAX(idAluno) FROM tbAluno)
					PRINT ('O Aluno '+@nomeAluno+ ' foi cadastrado com sucesso!')
				END
	END

	EXEC spInserir_Validar_Aluno 'Luisa Silva', '20/02/2003', '72.249.143-x', '496.244.918-55', '9844276331'

/* Exercício 7: Criar uma stored procedure que receba o nome do curso e o nome do aluno e matricule o mesmo no curso pretendido. */
/*
Create Procedure spMatricular
	@nomeAluno VARCHAR(50)
	, @nomeCurso VARCHAR(30)
	, @dataMatricula SMALLDATETIME

AS
	declare @idAluno INT
	SET @idAluno = (SELECT MAX(idAluno) FROM tbAluno)

	INSERT INTO tbMatricula (dataMatricula, idAluno)
		Values (@dataMatricula, @idAluno)
			PRINT ('O Aluno '+@nomeAluno+ ' foi cadastrado com sucesso!')

	SELECT nomeAluno AS 'Nome do Aluno', nomeCurso AS 'Nome do Curso'
			, dataMatricula AS 'Data da Matrícula' FROM tbAluno
		inner join tbMatricula
			on tbAluno.idAluno = tbMatricula.idAluno
		inner join tbTurma
			on tbMatricula.idTurma = tbTurma.idTurma
		inner join tbCurso
			on tbTurma.idCurso = tbCurso.idCurso

EXEC spMatricular 'Rogério Paulo Silva', 'Espanhol', '17/08/2021' */