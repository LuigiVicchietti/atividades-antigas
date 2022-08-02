create database bdLivrariaBrasileira
use bdLivrariaBrasileira

create table tbAutor(
idAutor int PRIMARY KEY identity(1,1) 
,nomeAutor varchar(30) not null
)

create table tbGenero(
idGenero int PRIMARY KEY identity(1,1)
,nomeGenero varchar(30) not null
)

create table tbEditora(
idEditora int PRIMARY KEY identity(1,1)
,nomeEditora varchar(30) not null
)

create table tbLivro(
idLivro int PRIMARY KEY identity(1,1)
,nomeLivro varchar(60) not null
,numPaginas int 
,idAutor int FOREIGN KEY REFERENCES tbAutor(idAutor)
,idGenero int FOREIGN KEY REFERENCES tbGenero(idGenero)
,idEditora int FOREIGN KEY REFERENCES tbEditora(idEditora)
)

/* --------------------------------------------------------------------*/

select * from tbAutor
select * from tbGenero
select * from tbEditora
select * from tbLivro

insert into tbAutor(nomeAutor)
values
('Machado de Assis')
,('Cora Coralina')
,('Graciliano Ramos')
,('Clarice Lispector')
,('Erico Verissimo')

insert into tbGenero(nomeGenero)
values
('Romance')
,('Poesia')
,('Literatura Brasileira')

insert into tbEditora(nomeEditora)
values
('Cia das Letras')
,('Atica')
,('Saraiva')

insert into tbLivro(nomeLivro, numPaginas, idAutor, idGenero, idEditora)
values
('Livros e flores', '1', 1, 2, 1)
,('crisalidas', '1', 1, 2, 1)
,('Contos Fluminenses', '224', 1, 3, 1)
,('Estorias da casa velha da ponte', '112', 2, 1, 1)
,('vitem de cobre', '1', 2, 2, 1)
,('A moeda de ouro que um pato engoliu', '15', 2, 3, 2)
,('Vidas secas', '155', 3, 1, 2)
,('Sao Bernardo', '272', 3, 1, 2)
,('A terra dos meninos pelados', '88', 3, 3, 2)
,('Algumas palavras', '1', 4, 2, 2)
,('Nao te amo mais', '1', 4, 2, 3)
,('A mulher que matou os peixes', '32', 4, 3, 3)
,('Clarissa', '197', 5, 1, 3)
,('Caminhos cruzados', '368', 5, 1, 3)
,('Os tres porquinhos pobres', '48', 5, 3, 3)

/*----------------------------------------------------------------------*/

SELECT nomeLivro, numPaginas, idAutor, idGenero, idEditora FROM tbLivro
WHERE nomeLivro like 'P%'

SELECT MAX (numPaginas) as 'Livro com mais páginas' FROM tbLivro

SELECT MIN (numPaginas) as 'Livro com menos páginas' FROM tbLivro

SELECT AVG (numPaginas) as 'Média de páginas nos livros' FROM tbLivro

SELECT SUM(numPaginas) as 'Soma das paginas dos livros da editora Cia das Letras' from tbLivro
WHERE idEditora =1

SELECT SUM(numPaginas) as 'Soma das paginas dos livros que começam com a letra A' from tbLivro
WHERE nomeLivro like 'A%'

SELECT AVG (numPaginas) as 'Média de páginas nos livros de Graciliano Ramos' FROM tbLivro
where idAutor =3

SELECT COUNT (nomeLivro) as 'Quantidade de livros da Clarice Lispector' FROM tbLivro
WHERE idAutor =4

SELECT AVG (numPaginas) as 'Média de páginas nos livros que tenham estrela no nome' FROM tbLivro
where nomeLivro like '%estrela%'

SELECT COUNT (nomeLivro) as 'Quantidade de livros que tenham a palavra poema no nome' FROM tbLivro
WHERE nomeLivro like '%poema%'