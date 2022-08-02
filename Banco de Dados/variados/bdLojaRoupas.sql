CREATE DATABASE bdLojaRoupas

USE bdLojaRoupas

CREATE TABLE tbCliente(
	idCliente INT NOT NULL PRIMARY KEY IDENTITY(1,1)
	, nomeCliente VARCHAR(50) NOT NULL
	, cpfCliente VARCHAR(14) NOT NULL
	, emailCliente VARCHAR(35) NOT NULL
	)

CREATE TABLE tbVendedor(
	idVendedor INT NOT NULL PRIMARY KEY IDENTITY(1,1)
	, nomeVendedor VARCHAR(50) NOT NULL
)

CREATE TABLE tbFormaPagamento(
	idFormaPagamento INT NOT NULL PRIMARY KEY IDENTITY(1,1)
	, descFormaPagamento VARCHAR(30) NOT NULL
)

CREATE TABLE tbCategoria(
	idCategoria INT NOT NULL PRIMARY KEY IDENTITY(1,1)
	, descCategoria VARCHAR(30) NOT NULL
)

CREATE TABLE tbVenda(
	idVenda INT PRIMARY KEY IDENTITY(1,1)
	, dataVenda SMALLDATETIME NOT NULL
	, valorTotalVenda SMALLMONEY NOT NULL
	, idCliente INT FOREIGN KEY REFERENCES tbCliente(idCliente)
	, idVendedor INT FOREIGN KEY REFERENCES tbVendedor(idVendedor)
)

CREATE TABLE tbProduto(
	idProduto INT NOT NULL PRIMARY KEY IDENTITY(1,1)
	, descProduto VARCHAR(30) NOT NULL
	, valorProduto SMALLMONEY NOT NULL
	, idCategoria INT FOREIGN KEY REFERENCES tbCategoria(idCategoria)
)

CREATE TABLE tbVendaProduto(
	idVendaProduto INT PRIMARY KEY IDENTITY(1,1)
	, qtdeVendaProduto INT NOT NULL
	, subTotalVendaProduto SMALLMONEY NOT NULL
	, idVenda INT FOREIGN KEY REFERENCES tbVenda(idVenda)
	, idProduto INT FOREIGN KEY REFERENCES tbProduto(idProduto)
)

CREATE TABLE tbParcela(
	idParcela INT PRIMARY KEY IDENTITY(1,1)
	, valorParcela SMALLMONEY NOT NULL
	, dataVenctoParcela SMALLDATETIME NOT NULL
	, idVenda INT FOREIGN KEY REFERENCES tbVenda(idVenda)
	, idFormaPagamento INT FOREIGN KEY REFERENCES tbFormaPagamento(idFormaPagamento)
)