create database bdRecursosHumanos
use bdRecursosHumanos

create table tbDepartamento (
idDepartamento int PRIMARY KEY IDENTITY (1,1)
,nomeDepartamento varchar(50)
)

create table tbFuncionario (
idFuncionario int PRIMARY KEY IDENTITY (1,1)
,nomeFuncionario varchar(50)
,sexoFuncionario varchar(1)
,dtFuncionario smalldatetime
,cpfFuncionario varchar(14)
,salarioFuncionario smallmoney
,idDepartamento int FOREIGN KEY REFERENCES tbDepartamento(idDepartamento)
)

create table tbDependente (
idDependente int PRIMARY KEY IDENTITY (1,1)
,nomeDependente varchar(50)
,sexoDependente varchar(1)
,dtDependente smalldatetime
,idFuncionario int FOREIGN KEY REFERENCES tbFuncionario(idFuncionario)
)

--_______________________________________________________________________________________________ --

select * FROM tbDepartamento
select * FROM tbFuncionario
select * FROM tbDependente

insert into tbDepartamento(nomeDepartamento)
values
('X')
,('XX')
,('XXX')
,('XXXX')
,('Y')
,('YY')
,('YYY')
,('YYYY')
,('Z')
,('ZZ')

insert into tbFuncionario(nomeFuncionario, sexoFuncionario, dtFuncionario, salarioFuncionario, idDepartamento)
values
('Robert Bruce Banner', 'M', '17/01/1985', 1150, 1)
,('Steve Rogers', 'M', '20/03/1993', 1200, 4)
,('Antony Howard Stark', 'M', '23/03/1993', 1125, 10)
,('Jennifer Walter', 'F', '16/07/1999', 1025, 9)
,('Natasha Romanoff', 'F', '19/08/1998', 1050, 3)
,('Wanda Maximoff', 'F', '26/02/1980', 985, 2)

insert into tbDependente(nomeDependente, dtDependente, sexoDependente,idFuncionario)
values
('Marianna da rocha', '27/08/2000', 'F', 6)
,('Marcelo de Paula', '12/12/1982', 'M', 3)
,('Beatriz Rocha', '16/06/1999', 'F', 2)
,('Tayna Pereira', '23/08/2000', 'F', 1)
,('Edinaldo Pereira', '02/06/1980', 'M', 2)
,('Bruna Modesto', '19/09/1994', 'F', 5)
,('Nestor Carlos Faria','30/10/1970', 'M', 4)

--______________________________________________________________________________________________--

select count (nomeDependente) as 'Total de dependentes do funcionario de codigo 1' FROM tbDependente
where idFuncionario =1

select AVG (salarioFuncionario) as 'Media dos salários agrupados pelo codDepartamento excluindo o cod 10' FROM tbFuncionario
where idDepartamento !=10

select sum (salarioFuncionario) as 'soma dos salários do departamento 9' FROM tbFuncionario
where idDepartamento =9

select count (nomeDependente) as 'Quantidade de dependentes do sexo masculino' FROM tbDependente
where sexoDependente like 'M%'

select count (nomeDependente) as 'Quantidade de dependentes que nasceram depois de 2000' FROM tbDependente
where datepart(year,dtDependente) >2000

select count (nomeFuncionario) as 'Quantidade de funcionarios do departamento 3' FROM tbFuncionario
where idDepartamento =3

select AVG (salarioFuncionario) as 'Media dos salários agrupados pelo departamento 2' FROM tbFuncionario
where idDepartamento =2

select count (idDependente) as 'Quantidade de dependentes que nasceram em junho que sejam do funcionario 1 ou 2' FROM tbDependente
where datepart(month, dtDependente) =06 and idFuncionario =1 or idFuncionario =2

select count (idDependente) as 'Quantidade de dependentes do sexo masculino que nasceram antes de 2000' FROM tbDependente
where sexoDependente like 'M%' and datepart(year, dtDependente) < 2000

select count (nomeDependente) as 'Quantidade de dependentes do sexo feminimo e que não sejam do funcionario 2' FROM tbDependente
where sexoDependente like 'F%' and idFuncionario !=2

select count (nomeDependente) as 'Quantidade de dependentes do funcionario 3' FROM tbDependente
where idFuncionario =3

select sum (salarioFuncionario) as 'Soma dos salários agrupados pelo codigo do departamento' FROM tbFuncionario

select count (idFuncionario) as 'Quantidade de funcionários do departamento 3' FROM tbFuncionario
where idDepartamento =3

select nomeFuncionario, convert(varchar,dtFuncionario,103) as 'Nome dos funcionários (em ordem alfabetica) e a data de nascimento dos
funcionários no formato DD/MM/AAAA'from tbFuncionario
Order by nomeFuncionario

select max (salarioFuncionario) as 'Maior salário' FROM tbFuncionario

select min (salarioFuncionario) as 'Menor salário' FROM tbFuncionario
