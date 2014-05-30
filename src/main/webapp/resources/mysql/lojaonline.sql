
CREATE TABLE endereco(
idEndereco INT NOT NULL AUTO_INCREMENT,
endereco VARCHAR(100) NOT NULL,
numero VARCHAR(8) NOT NULL,
cep INT(8) NOT NULL,
cidade VARCHAR(60), 
estado CHAR(2) NOT NULL,
CONSTRAINT pk_EnderecoId PRIMARY KEY (idEndereco)
);

 CREATE TABLE usuario (
idUsuario INT NOT NULL AUTO_INCREMENT,
idEndereco INT NOT NULL,
nomeUsuario VARCHAR(60) NOT NULL,
dataNasc DATE NOT NULL,
telefone VARCHAR(12) NOT NULL,
email VARCHAR(50) NOT NULL,
usuarioLogin VARCHAR (30) NOT NULL,
senhaLogin VARCHAR(12) NOT NULL, 
CONSTRAINT pk_UsuarioId PRIMARY KEY (idUsuario),
CONSTRAINT fk_EnderecoId_Usuario FOREIGN KEY (idEndereco)
REFERENCES endereco(idEndereco)ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE fornecedor (
idFornecedor INT NOT NULL AUTO_INCREMENT,
idEndereco INT NOT NULL,
nome VARCHAR(60) NOT NULL,
CONSTRAINT pk_FornecedorId PRIMARY KEY(idFornecedor),
CONSTRAINT fk_EnderecoId_Fornecedor FOREIGN KEY(idEndereco)
REFERENCES endereco(idEndereco) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE produto (
idProduto INT NOT NULL AUTO_INCREMENT,
idFornecedor INT NOT NULL,
titulo VARCHAR(50) NOT NULL,
nome Varchar(50) NOT NULL,
valor DECIMAL(19,2) NOT NULL,
console VARCHAR(60) NOT NULL,
lancamento DATE NOT NULL,
qtdDisponivel int(5) NOT NULL,
CONSTRAINT pk_ProdutoId PRIMARY KEY (idProduto),
CONSTRAINT fk_FornecedorId_Produto FOREIGN KEY (idFornecedor)
REFERENCES fornecedor(idFornecedor) ON UPDATE CASCADE ON DELETE CASCADE
);


CREATE TABLE fatura(
idFatura INT NOT NULL AUTO_INCREMENT,
dataCriacao DATE NOT NULL,
valorTotal DECIMAL(15,2) NOT NULL,
CONSTRAINT pk_FaturaId PRIMARY KEY(idFatura)
);

CREATE TABLE itemFatura (
idItemFatura INT NOT NULL AUTO_INCREMENT,
idFatura INT NOT NULL,
idProduto INT NOT NULL,
qtdCompra INT(6) NOT NULL,
valorItem DECIMAL(15,2) NOT NULL,
CONSTRAINT pk_ItemFaturaId PRIMARY KEY (idItemFatura),
CONSTRAINT fk_FaturaId_ItemFatura FOREIGN KEY (idFatura)
REFERENCES fatura(idFatura) ON UPDATE CASCADE ON DELETE CASCADE,
CONSTRAINT fk_ProdutoId_ItemFatura FOREIGN KEY (idProduto)
REFERENCES produto(idProduto) ON UPDATE CASCADE ON DELETE CASCADE
);