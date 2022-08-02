create database bdCanil

USE bdCanil

create table tbDono (
idDono int not null primary key identity (1,1)
, nomeDono varchar (40)
, cpfDono varchar (14) not null
, logradouroDono varchar (50)
, bairroDono varchar (50)
, cidadeDono varchar (30)
, cepDono varchar (12)
, compDono varchar (50)
, numCliente varchar (13) not null
)

create table tbRaca (
idRaca int not null primary key identity (1,1)
,descricaoRaca varchar (60)
)

create table tbDoenca (
idDoenca int not null primary key identity (1,1)
, nomeDoenca varchar (30)
)

create table tbVacina (
idVacina int not null primary key identity (1,1)
, descricaoVacina varchar (60)
)

create table tbAdocao (
idAdocao int not null primary key identity (1,1)
, dataAdocao smalldatetime not null
, idDono int foreign key references tbDono(idDono)
)

create table tbFoneDono (
idFoneDono int not null primary key identity (1,1)
, numFoneDono varchar (20) not null
, idDono int foreign key references tbDono(idDono)
)

create table tbPet (
idPet int not null primary key identity (1,1)
, nomePet varchar (30)
, idadePet varchar (10)
, estadoPet varchar (40)
, idRaca int foreign key references tbRaca(idRaca)
)

drop table tbRaca

create table tbPetAdocao (
idPetAdocao int not null primary key identity (1,1)
, idPet int foreign key references tbPet(idPet)
, idAdocao int foreign key references tbAdocao(idAdocao)
)

create table tbVacinaPet (
idVacinaPet int not null primary key identity (1,1)
, dataAplicacao smalldatetime not null
, idVacina int foreign key references tbVacina(idVacina)
, idPet int foreign key references tbPet(idPet)
)

create table tbProntuario (
idProntuario int not null primary key identity (1,1)
, idPet int foreign key references tbPet(idPet)
, idDoenca int foreign key references tbDoenca(idDoenca)
)