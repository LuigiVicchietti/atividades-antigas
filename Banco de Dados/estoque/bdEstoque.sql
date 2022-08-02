CREATE DATABASE bdEstoque
USE bdEstoque

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

CREATE TABLE tbVenda(
	idVenda INT PRIMARY KEY IDENTITY (1,1)
	, dtVenda SMALLDATETIME NOT NULL
	, valorTtVenda SMALLMONEY NOT NULL
	, idCliente INT FOREIGN KEY REFERENCES tbCliente (idCliente)
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

/* ------------------------------------------------------------------------- */
Select * FROM tbCliente
Select * FROM tbFabricante
Select * FROM tbFornecedor
Select * FROM tbVenda
Select * FROM tbProduto
Select * FROM tbItensVenda

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

INSERT INTO tbVenda(dtVenda, valorTtVenda, idCliente)
VALUES ('01/02/2014','4500.00',1)
	, ('03/02/2014','3400.00',1)
	, ('10/02/2014','2100.00',2)
	, ('15/02/2014','2700.00',3)
	, ('17/03/2014','560.00',3)
	, ('09/04/2014','1200.00',4)
	, ('07/05/2014','3500.00',5)
	, ('07/05/2014','3400.00',1)
	, ('05/05/2014','4000.00',2)

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

/* --------------------------------------------------------------------------*/

/* 1) */

Select idProduto as 'Codigo do Produto', descricaoProduto as 'Nome Produto', nomeFabricante as 'Nome do fabricante' from tbProduto
inner join tbFabricante
on tbProduto.idFabricante = tbFabricante.idFabricante
where valorProduto = (Select MAX (valorProduto) from tbProduto)

/* 2) */

Select idProduto as 'Codigo do Produto', descricaoProduto as 'valor Produto', nomeFabricante as 'Nome do fabricante' from tbProduto
inner join tbFabricante
on tbProduto.idFabricante = tbFabricante.idFabricante
where valorProduto > (Select AVG (valorProduto) from tbProduto)

/* 3) */

Select nomeCliente as 'Nome do cliente' from tbCliente
inner join tbVenda
on tbCliente.idCliente = tbVenda.idCliente
where valorTtVenda > (Select AVG (valorTtVenda) from tbVenda)

/* 4) */

Select descricaoProduto as 'Nome Produto', valorProduto as 'Valor produto' from tbProduto
where valorProduto = (Select MAX (valorProduto) from tbProduto)

/* 5) */

Select descricaoProduto as 'Nome Produto', valorProduto as 'Valor produto' from tbProduto
where valorProduto = (Select min (valorProduto) from tbProduto)