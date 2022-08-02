create database bdImobiliaria

USE bdImobiliaria 

create table tbCliente (
idCliente int not null primary key identity (1,1)
, nomeCliente varchar(40) 
, cpfCliente varchar(14) not null
,rgCliente varchar(20) not null
)

create table tbVendedor (
idVendedor int not null primary key identity (1,1)
, nomeVendedor varchar (40)
, cpfVendedor varchar (14) not null
,rgCliente varchar (20) not null
)

create table tbFiador (
 idFiador int not null primary key identity (1,1)
, nomeFiador varchar (40)
, cpfFiadoror varchar (14) not null
, rgFiador varchar (20) not null
)

create table tbProprietario (
idProprietario int not null primary key identity (1,1)
, nomeProprietario varchar (40)
, cpfProprietario varchar (14) not null
, rgProprirtario varchar (20) not null
)

create table tbTipoMovel (
idTipoMovel int not null primary key identity (1,1)
, descricaotipoMovel varchar (60) 
)

create table tbMovel (
idMovel int not null primary key identity (1,1)
, lougradouroMovel varchar (50)
, numMovel varchar (13)
, compMovel varchar (30)
, bairroMovel varchar (40)
, cidadeMovel varchar (30)
, valorMovel money not null
, idTipoMovel int foreign key references tbTipoMovel(idTipoMovel)
, idProprietario int foreign key references tbProprietario(idProprietario)
)

create table tbVenda (
idVenda int not null primary key identity (1,1)
,dataVenda smalldatetime not null
,idMovel int foreign key references tbMovel(idMovel)
,idCliente int foreign key references tbCliente(idCliente)
,idVendedor int foreign key references tbVendedor(idVendedor)
)

create table tbLocacao (
idLocacao int not null primary key identity (1,1)
, datacontrato smalldatetime not null
, idCliente int foreign key references tbCliente(idCliente)
, idFiador int foreign key references tbFiador(idFiador)
, idMovel int foreign key references tbMovel(idMovel)
)