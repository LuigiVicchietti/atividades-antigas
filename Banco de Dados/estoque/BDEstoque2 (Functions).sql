CREATE DATABASE bdEstoque2
USE bdEstoque2

CREATE TABLE tbCliente(
	idCliente INT PRIMARY KEY IDENTITY (1,1)
	, nomeCliente VARCHAR (50) NOT NULL
	, cpfCliente VARCHAR (14) NOT NULL
	, emailCliente VARCHAR (70) NOT NULL
	, sexoCliente VARCHAR (1) NOT NULL
	, dtNascimentoCliente SMALLDATETIME NOT NULL
)

CREATE TABLE tbFabricante(
	idFabricante INT PRIMARY KEY IDENTITY (1,1)
	, nomeFabricante VARCHAR (50) NOT NULL
)

CREATE TABLE tbFornecedor(
	idFornecedor INT PRIMARY KEY IDENTITY (1,1)
	, nomeFornecedor VARCHAR (50) NOT NULL
	, contatoFornecedor VARCHAR (50)	NOT NULL
)

CREATE TABLE tbVendedor(
	idVendedor INT PRIMARY KEY IDENTITY (1,1)
	, nomeVendedor VARCHAR (60)
)

CREATE TABLE tbVenda(
	idVenda INT PRIMARY KEY IDENTITY (1,1)
	, dtVenda SMALLDATETIME NOT NULL
	, valorTtVenda SMALLMONEY NOT NULL
	, idCliente INT FOREIGN KEY REFERENCES tbCliente (idCliente)
	, idVendedor INT FOREIGN KEY REFERENCES tbVendedor (idVendedor)
)

CREATE TABLE tbProduto(
	idProduto INT PRIMARY KEY IDENTITY (1,1)
	, descricaoProduto VARCHAR (50) NOT NULL
	, valorProduto SMALLMONEY NOT NULL
	, quantidadeProduto INT NOT NULL
	, idFabricante INT FOREIGN KEY REFERENCES tbFabricante (idFabricante)
	, idFornecedor INT FOREIGN KEY REFERENCES tbFornecedor (idFornecedor)
)

CREATE TABLE tbItensVenda(
	idItensVenda INT PRIMARY KEY IDENTITY (1,1)
	, idVenda INT FOREIGN KEY REFERENCES tbVenda (idVenda)
	, idProduto INT FOREIGN KEY REFERENCES tbProduto (idProduto)
	, quantidadeItensVenda INT NOT NULL
	, subTtItensVenda SMALLMONEY NOT NULL
)

CREATE TABLE tbSaidaProduto(
	idSaidaProduto INT PRIMARY KEY IDENTITY (1,1)
	, dataSaidaProduto SMALLDATETIME not null
	, quantidadeSaidaProduto INT not null
	, idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
)

CREATE TABLE tbEntradaProduto(
	idEntradaProduto INT PRIMARY KEY IDENTITY (1,1)
	, dataEntradaProduto SMALLDATETIME not null
	, quantidadeEntradaProduto INT not null
	, idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
)

/* ------------------------------------------------------------------------- */
Select * FROM tbCliente
Select * FROM tbFabricante
Select * FROM tbFornecedor
Select * FROM tbVenda
SELECT * FROM tbVendedor
Select * FROM tbProduto
Select * FROM tbItensVenda
SELECT * FROM tbEntradaProduto
SELECT * FROM tbSaidaProduto

INSERT INTO tbCliente(nomeCliente, cpfCliente, emailCliente, sexoCliente, dtNascimentoCliente)
VALUES ('Armando José Santana','12345678900','armandojrsantana@outlook.com','m','21/02/1961')
	, ('ASheila Carvalho Leal','45678909823','scarvalho@ig.com.br','f','13/09/1978')
	, ('Carlos Henrique Souza','76598278299','chenrique@ig.com.br','m','08/09/1981')
	, ('Maria Aparecida Souza','87365309899','mapdasouza@outlook.com','f','07/07/1962')
	, ('Adriana Nogueira Silva','76354309388','drica1977@ig.com.br','f','09/04/1977')
	,('Paulo Henrique Silva','87390123111','phsilva80@hotmail.com','m','02/02/1987')

INSERT INTO tbFabricante(nomeFabricante)
VALUES ('Unilever')
	, ('P&G')
	,('Bunge')

INSERT INTO tbFornecedor(nomeFornecedor, contatoFornecedor)
VALUES ('Atacadão','Carlos Santos')
	, ('Assai','Maria Stella')
	, ('Roldão','Paulo César')

INSERT INTO tbProduto(descricaoProduto, valorProduto, quantidadeProduto, idFabricante, idFornecedor)
VALUES ('Amaciante Downy','5.76','1500',2,1)
	, ('Amaciante Comfort','5.45','2300',1,1)
	, ('Sabão em pó OMO','5.99','1280',1,2)
	, ('Margarina Qually','4.76','2500',3,1)
	, ('Salsicha Hot Dog Sadia','6.78','2900',3,2)
	, ('Mortadela Perdigão','2.50','1200',3,3)
	, ('Hamburger Sadia','9.89','1600',3,1)
	, ('Fralda Pampers','36.00','340',2,3)
	, ('Xampu Seda','5.89','800',1,2)
	, ('Condicionador Seda','6.50','700',1,3)

	INSERT INTO tbVendedor(nomeVendedor)
	VALUES ('Rogério Paulo de Carvalho')
	, ('Paola Marcela da Silva')
	, ('Raul Joel Pinto')

INSERT INTO tbVenda(dtVenda, valorTtVenda, idCliente, idVendedor)
VALUES ('01/02/2014','4500.00',1, 2)
	, ('03/02/2014','3400.00',1, 2)
	, ('10/02/2014','2100.00',2, 3)
	, ('15/02/2014','2700.00',3, 1)
	, ('17/03/2014','560.00',3, 2)
	, ('09/04/2014','1200.00',4, 3)
	, ('07/05/2014','3500.00',5, 1)
	, ('07/05/2014','3400.00',1, 1)
	, ('05/05/2014','4000.00',2, 2)

INSERT INTO tbItensVenda(idVenda, idProduto, quantidadeItensVenda, subTtItensVenda)
VALUES (1,1,'200','1500.00')
	, (1,2,'300','3000.00')
	, (2,4,'120','1400.00')
	, (2,2,'200','1000.00')
	, (2,3,'130','1000.00')
	, (3,5,'200','2100.00')
	, (4,4,'120','1000.00')
	, (4,5,'450','700.00')
	, (5,5,'200','560.00')
	, (6,7,'200','600.00')
	, (6,6,'300','600.00')

	/* ----------------------------------------------------------------------*/


/* 1) Criar uma função que retorne o dia de semana da venda (no formato segunda, terça, etc) ao lado do código da venda, valor total da venda e sua data. */

CREATE FUNCTION fc_RetornarDataSemanaVenda(@Data date)
RETURNS NCHAR(40)

AS
	BEGIN

	Declare @DiaSemana varchar(40) 
	Declare @Dia int SET @Dia=DatePart(dw,@Data)
		If @Dia = 1
		SET @DiaSemana='Domingo'
		If @Dia = 2
		SET @DiaSemana='Segunda'
		If @Dia = 3
		SET @DiaSemana='Terça'
		If @Dia = 4
		SET @DiaSemana='Quarta'
		If @Dia = 5
		SET @DiaSemana='Quinta'
		If @Dia = 6
		SET @DiaSemana='Sexta'
		If @Dia = 7
		SET @DiaSemana='Sabado'

	RETURN @DiaSemana

	END

	SELECT idVenda AS 'Id Vendas', CONVERT(VARCHAR(12), dtVenda, 103) AS 'Data das Vendas', valorTtVenda AS 'Valor Total das Vendas',
	DiaSemana=dbo.fc_RetornarDataSemanaVenda(dtVenda) FROM tbVenda

	/* DROP FUNCTION fc_RetornarDataSemanaVenda */


/* 2) Criar uma função que receba o código do cliente e retorne o total de vendas que o cliente já realizou. */

CREATE FUNCTION fc_RetornarTTVendasCliente (@Cliente smallint)
RETURNS NCHAR (40)

AS

BEGIN

	DECLARE @TotalVenda int
	SET @TotalVenda = (SELECT COUNT (idVenda) FROM tbVenda
							WHERE idCliente = @Cliente)

	RETURN @TotalVenda

END

	SELECT dbo.fc_RetornarTTVendasCliente(4) AS 'Total de Vendas do Cliente'

	/* DROP FUNCTION fc_RetornarTTVendasCliente */

/* 3) Criar uma função que receba o código de um vendedor e o mês e informe o total de vendas do vendedor no mês informado. */

CREATE FUNCTION fc_RetornarTTVendasMes (@Data date)
RETURNS NCHAR(40)

AS

BEGIN
	
	DECLARE @Mes VARCHAR(40)
	DECLARE @QualMes int SET @QualMes = MONTH(@Data)
		If @QualMes = 1
			SET @Mes='Janeiro'
			else If @QualMes = 2
			SET @Mes='Fevereiro'
			else If @QualMes = 3
			SET @Mes='Março'
			else If @QualMes = 4
			SET @Mes='Abril'
			else If @QualMes = 5
			SET @Mes='Maio'
			else If @QualMes = 6
			SET @Mes='Junho'
			else If @QualMes = 7
			SET @Mes='Julho'
			else If @QualMes = 8
			SET @Mes='Agosto'
			else If @QualMes = 9
			SET @Mes='Setembro'
			else If @QualMes = 10
			SET @Mes='Outubro'
			else If @QualMes = 11
			SET @Mes='Novembro'
			else If @QualMes = 12
			SET @Mes='Desembro'

	RETURN @Mes

END

	SELECT COUNT (idVenda) AS 'Total de vendas de itens no Mês', dbo.fc_RetornarTTVendasMes(dtVenda) AS 'Mês' FROM tbVenda
			WHERE idVendedor = 2
			GROUP BY dtVenda

		/* DROP FUNCTION fc_RetornarTTVendasMes */

/* 4) Criar uma função que usando o bdEstoque diga se o cpf do cliente é ou não válido. */

CREATE FUNCTION fc_ValidarCpf (@Cpf varchar(11))
RETURNS CHAR(1)

AS

BEGIN
	Declare @indice INT,
			@soma INT,
			@dig1 INT,
			@dig2 INT,
			@cpf_temporario VARCHAR(11),
			@dig_igual CHAR(1),
			@resultado CHAR(1)

	SET @resultado = 'N'

	SET @cpf_temporario = SUBSTRING(@Cpf,1,1)

	SET @indice = 1
	SET @dig_igual = 'S'

		WHILE (@indice <= 11)
	begin
		IF SUBSTRING(@Cpf, @indice, 1) <> @cpf_temporario
			SET @dig_igual = 'N'
			SET @indice = @indice + 1
	end;

	IF @dig_igual = 'N'
	begin
		SET @soma = 0
		SET @indice = 1
			WHILE (@indice <=9)
		begin
			SET @soma = CONVERT(INT,SUBSTRING(@Cpf, @indice,1)) * (11 - @indice);
			SET @indice = @indice +1
	end

		SET @dig1 = 11 - (@soma % 11)

		IF @dig1 > 9
			SET @dig1 =0;

		SET @soma = 0
		SET @indice = 1
			WHILE(@indice <=10)
	begin
			SET @soma = @soma + CONVERT(INT,SUBSTRING(@Cpf,@indice,1)) * (12-@indice);
			SET @indice = @indice +1
	end

	SET @dig2 = 11-(@soma % 11)
		IF @dig2 >9
			SET @dig2 = 0;

	IF (@dig1 = SUBSTRING(@Cpf,LEN(@Cpf)-1,1)) and (@dig2 = SUBSTRING(@Cpf,LEN(@Cpf),1))
		SET @resultado = 'S'
	ELSE
		SET @resultado = 'N'
	end

	RETURN @resultado
	end

	SELECT dbo.fc_ValidarCpf(45678909823) AS CPF Valido? (S ou N)

	/* DROP FUNCTION fc_ValidarCpf */