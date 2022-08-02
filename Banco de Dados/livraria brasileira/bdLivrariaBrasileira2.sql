create database bdLivrariaBrasileira2
use bdLivrariaBrasileira2

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
 
//-------------------------------------------------------------//

select * from tbAutor
select * from tbGenero
select * from tbEditora
select * from tbLivro

insert into tbAutor(nomeAutor)
values
('Chico Buarque')
,('Jorge Amado')
,('J.K Rowling')
,('William Shakespeare')
,('Monteiro Lobato')
,('Cora Coralina')
,('Clarice Lispector')

insert into tbGenero(nomeGenero)
values
('Ficção')
,('Romance')
,('Tragédia')

insert into tbEditora(nomeEditora)
values
('Melhoramentos')
,('Globo')
,('Ática')
, ('Campanhia das letras')
, ('Abril')

insert into tbLivro(nomeLivro, numPaginas, idAutor, idGenero, idEditora)
values
('Budapeste', '176', 1, 2, 4)
,('O Bicho-de-seda', '454', 3, 2, 5)
,('Gabriela, Cravo e Canela', '214', 2, 1, 2)
,('Reinações de Narianho', '143', 5, 2, 2)
,('Romeu e Julieta', '421', 4, 1, 3)
,('O irmão Alemão', '478', 1, 1, 4)
,('Terras do Sem-Fim', '125', 2, 1, 3)
,('Animais Fantásticos e Onde Habitam', '267', 3, 2, 4)

//-------------------------------------------------------------//

/* 1) */

select count (nomeLivro) as 'Nome Livros', nomeGenero as 'Nome gêneros' from tbLivro
right join tbGenero
on tbLivro.idGenero = tbGenero.idGenero
group by nomeGenero

/* 2) */

select numPaginas as 'Numeros de páginas dos Livros', nomeAutor as 'Nome Autor' from tbLivro
right join tbAutor
on tbLivro.idAutor = tbAutor.idAutor
group by nomeAutor, numPaginas

/* 3) */

select AVG (numPaginas) as 'Média de páginas nos livros', nomeAutor as 'Nome Autor' from tbLivro
right join tbAutor
on tbLivro.idAutor = tbAutor.idAutor
group by nomeAutor
order by nomeAutor

/* 4) */

select count (idLivro) as 'Quantidade de livros', nomeEditora as 'Nome Editora' from tbLivro
right join tbEditora
on tbLivro.idEditora = tbEditora.idEditora
group by nomeEditora
order by nomeEditora DESC

/* 5) */

select SUM (numPaginas) as 'Soma das páginas', nomeAutor as 'Nome dos Autores' from tbLivro
right join tbAutor
on tbLivro.idAutor = tbAutor.idAutor
where nomeAutor like 'C%'
group by nomeAutor

/* 6) */

select count (nomeLivro) as 'Quantidade de livros', nomeAutor as 'Nome Autor' from tbLivro
right join tbAutor
on tbLivro.idAutor = tbAutor.idAutor
where nomeAutor like 'Machado de Assis' or nomeAutor like 'Cora Coralina' or nomeAutor like 'Graciliano Ramos'
or nomeAutor like 'Clarice Lispector'
group by nomeAutor

/* 7) */

select sum (numPaginas) as 'Soma das paginas', nomeEditora as 'Nome editora' from tbLivro
right join tbEditora
on tbLivro.idEditora = tbEditora.idEditora
where numPaginas >= 200 and numPaginas <= 500
group by nomeEditora

/* 8) */

select nomeAutor as 'Nomes dos Autores', nomeEditora as 'Nome das editoras',nomeLivro as 'Nome dos livros' from tbAutor
left join tbLivro
on tbAutor.idAutor = tbLivro.idAutor
right join tbEditora
on tbLivro.idEditora = tbEditora.idEditora

/* 9) */

select nomeAutor as 'Nome dos autores', nomeLivro as 'Nome dos livros' from tbAutor
left join tbLivro
on tbAutor.idAutor = tbLivro.idAutor
inner join tbEditora
on tbLivro.idEditora = tbEditora.idEditora
where nomeEditora like 'Cia das letras'
group by nomeAutor, nomeLivro

/* 10) */

select nomeLivro as 'Nome dos livros', nomeAutor as 'Nome dos autores' from tbAutor
left join tbLivro
on tbAutor.idAutor = tbLivro.idAutor
where nomeAutor not like 'Érick Verissimo'
group by nomeAutor, nomeLivro

/* 11) */

select nomeAutor as 'Nome dos autores', nomeLivro as 'Nome dos livros' from tbAutor
left join tbLivro
on tbLivro.idAutor = tbAutor.idAutor
group by nomeAutor, nomeLivro

/* 12) */

select nomeAutor as 'Nome dos autores', nomeLivro as 'Nome dos livros' from tbAutor
right join tbLivro
on tbLivro.idAutor = tbAutor.idAutor
group by nomeAutor, nomeLivro

/* 13) */

select nomeAutor as 'Nome dos autores', nomeLivro as 'Nome dos livros' from tbAutor
full join tbLivro
on tbLivro.idAutor = tbAutor.idAutor
group by nomeAutor, nomeLivro

/* 14) */

select nomeLivro, nomeEditora from tbLivro
cross join tbEditora
where tbEditora.nomeEditora like 'Ática'

/* 15) */

select nomeAutor as 'Nome dos autores que não tem livros cadastrados' from tbAutor
left join tbLivro
on tbAutor.idAutor = tbLivro.idAutor
where tbLivro.idLivro is null

/* 16) */

select nomeGenero as 'Nome dos gêneros que não há livros cadastrados' from tbGenero
left join tbLivro
on tbGenero.idGenero = tbLivro.idGenero
where tbLivro.idGenero is null