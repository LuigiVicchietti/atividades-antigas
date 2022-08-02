use bdEscolaIdiomas2

/* Exerc�cio 1: Criar uma stored procedure "Busca_Aluno" que receba o c�digo do aluno e retorne seu nome e data de nascimento. */

create Procedure spBusca_Aluno
	@idAluno INT

AS
	BEGIN
		SELECT nomeAluno AS 'Nome do Aluno', dtNascimentoAluno AS 'data de Nascimento do Aluno' FROM tbAluno
			Where @idAluno = idAluno
	END

	EXEC spBusca_Aluno 2

/* Exerc�cio 2: Criar uma stored procedure "Insere_Aluno" que insira um registro na tabela de alunos. */

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

/* Exerc�cio 3: Criar uma stored procedure "Aumenta_Preco" que, dados do nome do curso e um percentual, aumente o valor do curso com a porcentagem informada. */

create Procedure spAumenta_Preco
	@nomeCurso VARCHAR(30)
	, @porcentagem INT

	AS
		UPDATE tbCurso
			SET valorCurso = valorCurso + (valorCurso * @porcentagem / 100)

			SELECT nomeCurso AS 'Nome do Curso', valorCurso AS 'Valor do Curso com aumento' FROM tbCurso
				Where @nomeCurso = nomeCurso

	EXEC spAumenta_Preco 'Alem�o', 5

/* Exerc�cio 4: Criar uma stored procedure "Exibe_Turma" que, dado o nome da turma exiba todas as informa��es dela. */

create Procedure spExibe_Turma
	@nomeTurma VARCHAR(50)

AS
	BEGIN
		SELECT nomeTurma AS 'Nome da Turma', descricaoTurma AS 'Descri��o da turma'
		, diaDaSemanaTurma AS 'Dia da Semana da Turma',horarioTurma AS 'Hor�rio da Turma' FROM tbTurma
			Where @nomeTurma = nomeTurma
	END

	EXEC spExibe_Turma 'Turma C'

/* Exerc�cio 5: Criar uma stored procedure "Exibe_AlunosdaTurma" que, dado o nome da turma exiba os seus alunos. */

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

/* Exerc�cio 6: Criar uma stored procedure para inserir alunos, verificando pelo cpf se o aluno existe ou n�o, e informar essa condi��o via mensagem. */

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
			PRINT ('N�o � posssivel cadastrar. O CPF '+@cpfAluno+ 'j� existe!')
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

/* Exerc�cio 7: Criar uma stored procedure que receba o nome do curso e o nome do aluno e matricule o mesmo no curso pretendido. */
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
			, dataMatricula AS 'Data da Matr�cula' FROM tbAluno
		inner join tbMatricula
			on tbAluno.idAluno = tbMatricula.idAluno
		inner join tbTurma
			on tbMatricula.idTurma = tbTurma.idTurma
		inner join tbCurso
			on tbTurma.idCurso = tbCurso.idCurso

EXEC spMatricular 'Rog�rio Paulo Silva', 'Espanhol', '17/08/2021' */