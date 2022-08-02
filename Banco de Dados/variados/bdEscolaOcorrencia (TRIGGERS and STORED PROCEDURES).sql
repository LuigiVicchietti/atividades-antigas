create database bdEscolaOcorrencia
use bdEscolaOcorrencia

create table tbAluno (
idAluno INT PRIMARY KEY IDENTITY (1,1)
, nomeAluno VARCHAR (50)
, cpfALuno VARCHAR (12)
)

create table tbOcorrencias (
idOcorrencia INT PRIMARY KEY IDENTITY (1,1)
, dtOcorrencia SMALLDATETIME
, descricaoOcorrencia VARCHAR (1000)
, idAluno INT FOREIGN KEY REFERENCES tbAluno(idAluno)
)

SELECT * FROM tbAluno
SELECT * FROM tbOcorrencias

INSERT INTO tbAluno (nomeAluno, cpfAluno)
VALUES ('Rezende Carvalho', '947426340/04')
	, ('Marcela Pimentinha','613262870/36')
	, ('Marcelo Almeida Santos','326676460/96')
	, ('Maria Gabriella', '352654570/70')
	, ('Pedro Saraiva Azevedo','831367660/40')
	, ('Paulo Guerra','753726410/45')

	INSERT INTO tbOcorrencias (dtOcorrencia, descricaoOcorrencia, idAluno)
VALUES ('10/02/2007', 'Mijou no café do zelador, porque o zelador não devolveu sua bola de futebol.', 6)
	, ('17/03/2007','Bateu em um aluno. O motivo foi por causa que ele não gostou da opinião de outro aluno sobre a Ariana Grande.', 1)
	, ('15/09/2007','Deixou a sala com cheiro duvidoso após estourar um club social na bicuda.', 1)
	, ('22/02/2007', 'Colou durante a prova de matemática.', 4)
	, ('10/10/2007','Tacou fogo em sete dos dez carros do estacionamento.', 6)
	, ('11/07/2007','Roubou todos os alimentos da cantina.', 6)

 /* 1) Criar uma stored procedure que dado o cpf,
 retorne se o aluno possui ou não ocorrências via mensagem. 
 Caso ele tenha ocorrencias, indicar a quantidade na mensagem. */

	create procedure spRetornar_Ocorrencias
	@nomeAluno VARCHAR (50)
	, @cpfAluno VARCHAR (12)

	AS
		BEGIN
			DECLARE @quantidadeOcorrencia VARCHAR
						SET @quantidadeOcorrencia = (SELECT COUNT (idOcorrencia) FROM tbOcorrencias
							INNER JOIN tbAluno
							ON tbOcorrencias.idAluno = tbAluno.idAluno
							WHERE nomeAluno = @nomeAluno)
		END

		BEGIN
				if exists (SELECT cpfAluno FROM tbAluno
							WHERE cpfAluno = @cpfAluno)
		BEGIN
							if exists (SELECT idOcorrencia FROM tbOcorrencias
										INNER JOIN tbAluno
											ON tbAluno.idAluno = tbOcorrencias.idAluno
											WHERE nomeAluno = @nomeAluno)

								PRINT ('O ' + @nomeAluno + ' contém ' + @quantidadeOcorrencia + ' ocorrencias registradas.')
							ELSE 
								PRINT ('O ' + @nomeAluno + ' não contém ocorrencias registradas.')
		END
				ELSE
						PRINT ('O aluno não está cadastrado!')

		END
   
		EXEC spRetornar_Ocorrencias 'Maria Gabriella', '352654570/70'

 /* 2) Criar uma stored procedure que receba o cpf do Aluno e o exclua do banco de dados,
  somente se ele não tiver nenhuma ocorrência. Caso ele tenha ocorrencias, 
  informar “Aluno não pode ser removido do banco de dados pois ele tem X ocorrencias”, onde X é a quantidade de ocorrencias.*/

	create procedure spExcluir_Aluno
	@nomeAluno VARCHAR (50)
	, @cpfAluno VARCHAR (12)

	AS
		BEGIN
			DECLARE @quantidadeOcorrencia VARCHAR
						SET @quantidadeOcorrencia = (SELECT COUNT (idOcorrencia) FROM tbOcorrencias
							INNER JOIN tbAluno
							ON tbOcorrencias.idAluno = tbAluno.idAluno
							WHERE nomeAluno = @nomeAluno)
		END

		BEGIN
				if exists (SELECT cpfAluno FROM tbAluno
							WHERE cpfAluno = @cpfAluno)
		BEGIN
							if exists (SELECT idOcorrencia FROM tbOcorrencias
										INNER JOIN tbAluno
											ON tbAluno.idAluno = tbOcorrencias.idAluno
											WHERE nomeAluno = @nomeAluno)

								PRINT ('O ' + @nomeAluno + ' não pode ser removido do banco de dados pois ele tem ' + @quantidadeOcorrencia + ' ocorrencias.')
							ELSE 
								DELETE FROM tbAluno
									WHERE cpfAluno = @cpfAluno
										PRINT ('Usuário excluido com sucesso!')
		END

				ELSE
						PRINT ('O aluno não está cadastrado!')

		END

		EXEC spExcluir_Aluno 'Rezende Carvalho', '947426340/04'
		EXEC spExcluir_Aluno 'Marcela Pimentinha','613262870/36'

  /* 3) Criar um trigger que quando o aluno receber uma ocorrência seja gerada uma mensagem 
  “Comunicar responsável do aluno com cpf XXXX e nome XXXXXXXX */

CREATE TRIGGER tgComunicarResponsavel
   ON tbOcorrencias
   AFTER INSERT

   AS

		DECLARE @cpfAluno VARCHAR (12), @nomeAluno VARCHAR (50)

		SET @cpfAluno = (SELECT cpfAluno FROM tbAluno
							WHERE idAluno = (SELECT idAluno FROM tbOcorrencias
												WHERE idOcorrencia = (SELECT MAX (idOcorrencia) FROM tbOcorrencias)))
		SET @nomeAluno = (SELECT nomeAluno FROM tbAluno
							WHERE idAluno = (SELECT idAluno FROM tbOcorrencias
												WHERE idOcorrencia = (SELECT MAX (idOcorrencia) FROM tbOcorrencias)))

			PRINT ('Comunicar responsavel do aluno ' + @nomeAluno + ' com o CPF de ' + @cpfAluno + '.')

	INSERT INTO tbOcorrencias(dtOcorrencia, descricaoOcorrencia, idAluno)
	VALUES
	('11/11/2007','Aluno pego passando cola para outros três alunos.', 1)