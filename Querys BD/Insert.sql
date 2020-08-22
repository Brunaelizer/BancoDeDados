USE Condominio;

INSERT INTO estado(nome, sigla) VALUES 
('Acre','AC'),
('Alagoas','AL'),
('Amapá','AP'),
('Amazonas','AM'),
('Bahia','BA'),
('Ceará','CE'),
('Distrito Federal','DF'),
('Espírito Santo','ES'),
('Goiás','GO'),
('Maranhão','MA'),
('Mato Grosso','MT'),
('Mato Grosso do Sul','MS'),
('Minas Gerais','MG'),
('Pará','PA'),
('Paraíba','PB'),
('Paraná','PR'),
('Pernambuco','PE'),
('Piauí','PI'),
('Rio de Janeiro','RJ'),
('Rio Grande do Norte','RN'),
('Rio Grande do Sul','RS'),
('Rondônia','RO'),
('Roraima','RR'),
('Santa Catarina','SC'),
('São Paulo','SP'),
('Sergipe','SE'),
('Tocantins','TO');

INSERT INTO condominio VALUES ('Condominio 1', 100.00, 25, 'Itajaí', 'Sim','Sim', 1),
('Condominio 2', 100.00, 25, 'Itajaí', 'Sim','Sim', 1),
('Condominio 3', 100.00, 25, 'Itajaí', 'Sim','Sim', 1),
('Condominio 4', 100.00, 25, 'Itajaí', 'Sim','Sim', 1),
('Condominio 5', 100.00, 25, 'Itajaí', 'Sim','Sim', 1);


INSERT INTO apartamento(numero, andar, ocupado, valor_mensalidade, id_condominio) VALUES (1,1,1,500, 1),
(2,1,1,500, 1),
(3,1,1,500, 1),
(4,1,1,500, 2),
(5,1,1,500, 2);

INSERT INTO entidade(nome,cpf,ativo,id_apartamento) VALUES ('João', '775.418.990-97', 1, 1),
('Maria', '101.947.220-07', 1, 1),
('Pedro', '502.957.550-24', 1, 2),
('Vitoria', '699.590.010-32', 1, 3),
('Clodoaldo', '245.918.740-87', 1, 4),
('Cristina', '456.978.987-12',1, 4);

INSERT INTO contato(id_entidade, tipo, informacao) VALUES (1, 1, '473365-4546'),
(1, 2, 'joao@gmail.com'),
(3, 1, '4794564-5645'),
(4,1,'479418-5313'),
(5,2,'clodotop@gmail.com');


INSERT INTO sindico (id_entidade, id_condominio, indicador_sindico,indicador_subsindico, ativo) VALUES (1,1,1,0,0),
(2,1,1,0,0),
(3,1,0,1,0),
(4,2,0,1,1),
(5,2,1,0,1);


