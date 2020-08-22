
CREATE DATABASE Condominio;

use Condominio;

CREATE TABLE condominio(
id_condominio int IDENTITY(1,1),
nome VARCHAR(60),
valor_condominio float,
estado int,
cidade VARCHAR(60),
bairro VARCHAR(60),
rua VARCHAR(60),
numero int,
PRIMARY KEY (id_condominio)
);

CREATE TABLE apartamento(
id_apartamento int IDENTITY(1,1),
numero VARCHAR(15),
andar int,
ocupado bit,
valor_mensalidade float,
id_condominio int NOT NULL,
PRIMARY KEY (id_apartamento),
FOREIGN KEY (id_condominio) REFERENCES condominio(id_condominio)
);


CREATE TABLE entidade(
id_entidade int IDENTITY(1,1),
id_apartamento int not null,
nome VARCHAR(60),
cpf VARCHAR(15),
ativo bit,
PRIMARY KEY (id_entidade),
FOREIGN KEY (id_apartamento) REFERENCES apartamento(id_apartamento)
);

CREATE TABLE sindico(
id_sindico int IDENTITY(1,1),
id_entidade int not null,
id_condominio int not null,
indicador_sindico bit,
indicador_subsindico bit,
ativo bit,
PRIMARY KEY(id_sindico),
FOREIGN KEY (id_entidade) REFERENCES entidade(id_entidade),
FOREIGN KEY (id_condominio) REFERENCES condominio(id_condominio)
);

CREATE TABLE contato(
id_contato int IDENTITY(1,1),
id_entidade int not null,
tipo int,
informacao VARCHAR(60),
PRIMARY KEY(id_contato),
FOREIGN KEY (id_entidade) REFERENCES entidade(id_entidade)
);


CREATE TABLE estado(
id_estado int IDENTITY(1,1),
nome VARCHAR(60),
sigla VARCHAR(2),
PRIMARY KEY(id_estado)
);

CREATE TABLE cidade(
id_cidade int IDENTITY(1,1),
id_estado int NOT NULL,
nome VARCHAR(60),
PRIMARY KEY(id_cidade),
FOREIGN KEY (id_estado) REFERENCES estado(id_estado)
);




