create database bdTransito
use bdTransito

create table tbMotorista (
idMotorista int PRIMARY KEY IDENTITY (1,1)
, nomeMotorista varchar (40)
, dtNascimentoMotorista smalldatetime
, cpfMotorista varchar (14)
, cnhMotorista varchar (11)
, ptAcumuladaMotorista int not null
)

create table tbVeiculo (
idVeiculo int PRIMARY KEY IDENTITY (1,1)
, modeloVeiculo varchar (30)
, placaVeiculo varchar (8)
, renavamVeiculo varchar (11)
, anoVeiculo smalldatetime
, idMotorista int FOREIGN KEY REFERENCES tbMotorista(idMotorista)
)

create table tbMulta (
idMulta int PRIMARY KEY IDENTITY (1,1)
, dtMulta smalldatetime
, horaMulta smalldatetime
, pontosMulta int
, idVeiculo int FOREIGN KEY REFERENCES tbVeiculo(idVeiculo)
)

/* ---------------------------------------------------------------------- */

select * FROM tbMotorista
select * FROM tbVeiculo
select * FROM tbMulta

insert into tbMotorista (nomeMotorista, dtNascimentoMotorista, cpfMotorista, cnhMotorista, ptAcumuladaMotorista)
Values
('Cléber Machado', '16/05/1980', '054.399.780-46', '73531732328', 20)
, ('Cecília Amaral', '07/10/1995', '183.968.510-77', '09216928378', 10)
, ('Maicon de Souza', '09/02/2000', '844.097.880-43', '91092538007', 30)
, ('Amanda ferreira', '13/08/2001', '713.427.010-62', '86164958205', 10)

insert into tbVeiculo (modeloVeiculo, placaVeiculo, renavamVeiculo, anoVeiculo, idMotorista)
Values
('Corolla', 'HZR-1084', '46620729048', '2020', 1)
, ('Palio', 'LWS-2521', '02161445019', '2012', 3)
, ('Palio Weekend', 'NEZ-3128', '98329697162', '2010', 1)
, ('Fielder', 'MRT-2108', '34978143161', '2005', 1)
, ('Camaro', 'LVK-6051', '47774063129', '2015', 2)
, ('Civic', 'NFB-9131', '02726171715', '2018', 3)
, ('Celta', 'MCL-6769', '90067779323', '2005', 3)
, ('Hilux', 'JPC-5308', '36451621701', '2019', 2)
, ('Cronos', 'JYA-0671', '94705694389', '2018', 2)

insert into tbMulta (dtMulta, horaMulta, pontosMulta, idVeiculo)
Values
('10/03/2020', '15:12', 3, 1)
, ('20/04/2020', '20:30', 4, 6)
, ('19/05/2021', '10:33', 3, 3)
, ('31/08/2020', '01:30', 3, 4)
, ('21/01/2021', '09:50', 4, 2)
, ('10/03/2019', '22:11', 3, 5)
, ('07/09/2019', '10:28', 3, 3)
, ('01/01/2021', '23:11', 7, 8)
, ('02/04/2020', '17:08', 4, 5)
, ('08/06/2019', '18:01', 4, 4)
, ('17/01/2018', '16:05', 4, 1)
, ('19/02/2021', '11:11', 3, 9)
, ('09/03/2020', '17:57', 4, 7)
, ('09/03/2020', '14:38', 7, 8)
, ('15/02/2018', '14:22', 3, 7)
, ('14/09/2019', '05:23', 4, 6)
, ('20/10/2010', '03:00', 7, 9)
, ('15/11/2020', '13:30', 3, 2)

/* ---------------------------------------------------------------------- */

/* 1) Quantos motoristas existem no banco de dados */

Select count (idMotorista) as 'Quantidade de motoristas' FROM tbMotorista

/* 2) Quantos motoristas possuem Silva no sobrenome */

Select count (idMotorista) as 'Quantidade de motoristas com "Silva" no nome' FROM tbMotorista
where nomeMotorista like '%Silva&'

/* 3) Quantos motoristas nasceram no ano 2000 */

Select count (idMotorista) as 'Quantidade de motoristas que nasceram em 2000' FROM tbMotorista
where datepart (year, dtNascimentoMotorista) = 2000

/* 4) A somatória da pontuação de todos os motoristas */

Select sum (ptAcumuladaMotorista) as 'Soma dos pontos dos motoristas' FROM tbMotorista

/* 5) A média de pontuação de todos os motoristas */

Select avg (ptAcumuladaMotorista) as 'Média dos pontos dos motoristas' FROM tbMotorista

/* 6) Quantos veículos o motorista de código 1 possui */

Select count (idVeiculo) as 'Quantidade de veículos que o motorista 1 tem' FROM tbVeiculo
where idMotorista = 1

/* 7) Quantos veículos a placa começa com A */

Select count (idVeiculo) as 'Quantidade de veículos que a placa tem "A" no inicio' FROM tbVeiculo
where placaVeiculo like 'A%'

/* 8) Quantos veículos foram fabricados antes de 2021 */

Select count (idVeiculo) as 'Quantidade de veículos que foram fabricados antes de 2021' FROM tbVeiculo
where datepart (year, anoVeiculo) != 2021

/* 9) As placas dos veículos cujo ano de fabricação seja abaixo da média */

Select placaVeiculo as 'Placas dos veículos cujo o ano de fabricação é abaixo da média' FROM tbVeiculo
where year (anoVeiculo) < (Select AVG (year (anoVeiculo)) FROM tbVeiculo)

/* 10) A somatória dos pontosMulta do veículo de placa final 02 */

Select sum (pontosMulta) as 'Soma dos pontos das multas de veículos que a placa termina em "2"' FROM tbMulta
inner join tbVeiculo
on tbMulta.idVeiculo = tbVeiculo.idVeiculo
where placaVeiculo like '%2'

/* 11) A média de pontosMulta entre todas as multas aplicadas */

Select avg (pontosMulta) as 'Média dos pontos de multa' FROM tbMulta

/* 12) A quantidade de multas aplicadas no mês de abril de 2018 */

Select count (idMulta) as 'Quantidade de multas aplicadas no mês de abril de 2018' FROM tbMulta
where datepart (month, dtMulta) = 4 AND datepart (year, dtMulta) = 2018

/* 13) A quantidade de veículos cuja placa termine com o número 1 ou 2 */

Select count (idVeiculo) as 'Quantidade de veículos cujo a placa termina com "1" ou "2"' FROM tbVeiculo
where placaVeiculo like '%1' or placaVeiculo like '%2'

/* 14) A quantidade de veículos cuja placa termine com 9 ou 0 */

Select count (idVeiculo) as 'Quantidade de veículos cujo a placa termina com "0" ou "9"' FROM tbVeiculo
where placaVeiculo like '%9' or placaVeiculo like '%0'

/* 15) A quantidade de veículos por ano de fabricação */

Select count (idVeiculo) as 'Quantidade de veículos por ano de fabricação', convert(varchar(4), anoVeiculo, 111) as 'Ano de fabricação' FROM tbVeiculo
group by anoVeiculo


/* 16) A quantidade de motoristas por pontuação acumulada */

Select count (idMotorista) as 'Quantidade de motoristas por multa acumulada', ptAcumuladaMotorista as 'Pontuação Acumulada' FROM tbMotorista
group by ptAcumuladaMotorista

/* 17) A quantidade de motoristas que ultrapassaram os 20 pontos */

Select count (idMotorista) as 'Quantidade de motoristas que ultrapassaram os 20 pontos' FROM tbMotorista
where ptAcumuladaMotorista > 20
group by ptAcumuladaMotorista

/* 18) A pontuação média dos motoristas nascidos no ano de 2000 */

Select avg (ptAcumuladaMotorista) as 'Média dos pontos dos motoristas nascidos em 2000' FROM tbMotorista
where datepart (year, dtNascimentoMotorista) = 2000

/* 19) A média dos pontos  das multas aplicadas em julho de 2017 */

Select avg (pontosMulta) as 'Média dos pontos das multas aplicadas em julho de 2017' FROM tbMulta
where datepart (month, dtMulta) = 7 AND datepart (year, dtMulta) = 2017

/* 20) Quantos veículos não podem circular na segunda-feira (placa final 1 ou 2) */

Select count (idVeiculo) as 'Quantidade de veículos que não podem circular na segunda feira (placa termina com "1" ou "2")' FROM tbVeiculo
where placaVeiculo like '%1' or placaVeiculo like '%2'

/* 21) O nome do motorista ao lado das datas das multas que ele tomou */

Select nomeMotorista as 'Nome dos motoristas', dtMulta as 'Data das multas' FROM tbMotorista
inner join tbVeiculo
on tbMotorista.idMotorista = tbVeiculo.idMotorista
inner join tbMulta
on tbVeiculo.idVeiculo = tbMulta.idVeiculo
group by dtMulta, nomeMotorista

/* 22) O nome do motorista ao lado das placas dos veículos */

Select nomeMotorista as 'Nome dos motoristas', placaVeiculo as 'Placas dos veículos' FROM tbMotorista
inner join tbVeiculo
on tbMotorista.idMotorista = tbVeiculo.idMotorista
group by nomeMotorista, placaVeiculo

/* 23) O nome do motorista que tomou mais multas */

Select nomeMotorista as 'Nome dos motoristas', count (idMulta) as 'Quantidade de multas que os motoristas levaram' FROM tbMotorista
inner join tbVeiculo
on tbMotorista.idMotorista = tbVeiculo.idMotorista
inner join tbMulta
on tbVeiculo.idVeiculo = tbMulta.idVeiculo
group by nomeMotorista

/* 24) O nome dos motoristas que não possuem multas */

Select nomeMotorista as 'Nome dos motoristas', count (idMulta) as 'Quantidade de multas que os motoristas levaram' FROM tbMotorista
Full join tbVeiculo
on tbMotorista.idMotorista = tbVeiculo.idMotorista
Full join tbMulta
on tbVeiculo.idVeiculo = tbMulta.idVeiculo
where idMulta is null
group by nomeMotorista

/* 25) O nome dos motoristas ao lado da placa dos veículos, inclusive daqueles motoristas que não possuem veículos cadastrados ainda */

Select nomeMotorista as 'Nome dos motoristas', placaVeiculo as 'Placa do veículo' FROM tbMotorista
left join tbVeiculo
on tbMotorista.idMotorista = tbVeiculo.idMotorista
group by nomeMotorista, placaVeiculo

/* 26) O nome dos motoristas ao lado da placa dos veículos, inclusive daqueles motoristas que não possuem veículos cadastrados ainda */

Select placaVeiculo as 'Placa do veículo', nomeMotorista as 'Nome dos motoristas' FROM tbVeiculo
inner join tbMotorista
on tbVeiculo.idMotorista = tbMotorista.idMotorista
where ptAcumuladaMotorista = (Select max (ptAcumuladaMotorista) FROM tbMotorista)
group by nomeMotorista, placaVeiculo

/* 27) A quantidade de veículos por nome do motorista */

Select count (idVeiculo) as 'Quantidade de veículos por nome do motorista', nomeMotorista as 'Nome do motorista' FROM tbVeiculo
inner join tbMotorista
on tbVeiculo.idMotorista = tbMotorista.idMotorista
group by nomeMotorista

/* 28) A quantidade de veículos por placa do veículo */

Select count (idVeiculo) as 'Quantidade de veículos por placa do veículo', placaVeiculo as 'Placa do veículo' FROM tbVeiculo
group by placaVeiculo

/* 29) As datas das multas ao lado do renavam do veículo */

Select convert(varchar, dtMulta, 103) as 'Data das multas', renavamVeiculo as 'Renovam do veículo' FROM tbMulta
inner join tbVeiculo
on tbMulta.idVeiculo = tbVeiculo.idVeiculo
group by dtMulta, renavamVeiculo

/* 30) O nome do motorista e a data da multa, somente daquele que tomou a multa mais recente */

Select nomeMotorista as 'Nome doo mostorista que levou a multa mais recente', convert (varchar, dtMulta, 103) as 'Data da multa' FROM tbMotorista
Full join tbVeiculo
on tbMotorista.idMotorista = tbVeiculo.idMotorista
Full join tbMulta
on tbVeiculo.idVeiculo = tbMulta.idVeiculo
where dtMulta = (Select min (dtMulta) FROM tbMulta)
group by dtMulta, nomeMotorista