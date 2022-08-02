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