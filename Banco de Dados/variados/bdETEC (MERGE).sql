create database bdETEC
use bdETEC

create table tbSegundoMtecA (
rmAluno INT PRIMARY KEY
, nomeAluno VARCHAR (70)
, statusAluno VARCHAR (9)
)

create table tbSegundoMtecB (
rmAluno INT PRIMARY KEY
, nomeAluno VARCHAR (70)
, statusAluno VARCHAR (9)
)

create table tbTerceiroMtec (
rmAluno INT PRIMARY KEY
, nomeAluno VARCHAR (70)
, statusAluno VARCHAR (9)
)

/*                   ---                */


SELECT * FROM tbSegundoMtecA
SELECT * FROM tbSegundoMtecB

insert INTO tbSegundoMtecA(nomeAluno, rmAluno, statusAluno)
VALUES ('Junior Tavares', 30538, 'REPROVADO')
, ('Renato Augusto', 20200, 'APROVADO')
, ('Gabriel Pereira', 67544, 'REPROVADO')
, ('Leôncio Aparecido de Paula', 69029, 'APROVADO')
, ('Taldo Bigode', 45066, 'APROVADO')
, ('Marlon Melo', 20230, 'APROVADO')
, ('Joaquina Silva', 33111, 'APROVADO')
, ('Cléber Santana', 90899, 'APROVADO')
, ('Julia Ferreira', 67890, 'APROVADO')
, ('Ana Julia da Silva', 77209, 'REPROVADO')

insert INTO tbSegundoMtecB(nomeAluno, rmAluno, statusAluno)
VALUES ('Marcos Pereira', 54600, 'REPROVADO')
, ('Helena Rafaela Pinto', 32324, 'APROVADO')
, ('Thiago Convre', 12300, 'APROVADO')
, ('Santana Rodrigues', 41566, 'REPROVADO')
, ('Roger Machado', 84325, 'REPROVADO')
, ('Gilberto Peregrino Pinto', 89900, 'APROVADO')
, ('Jennifer Lopes', 76230, 'APROVADO')
, ('Giovana Vieira', 23200, 'APROVADO')
, ('Roberto Lennon', 70700, 'APROVADO')
, ('Beatriz Moraes da Silva', 24678, 'APROVADO')


/*                   ---                */

SELECT * FROM tbTerceiroMtec

MERGE tbTerceiroMtec dest
	USING tbSegundoMtecA ori
		ON ori.rmAluno = dest.rmAluno
	WHEN NOT MATCHED AND ori.statusAluno LIKE 'APROVADO' THEN
		INSERT VALUES (ori.rmAluno, ori.nomeAluno, ori.statusAluno);

MERGE tbTerceiroMtec dest
	USING tbSegundoMtecB ori
		ON ori.rmAluno = dest.rmAluno
	WHEN NOT MATCHED AND ori.statusAluno LIKE 'APROVADO' THEN
		INSERT VALUES (ori.rmAluno, ori.nomeAluno, ori.statusAluno);
