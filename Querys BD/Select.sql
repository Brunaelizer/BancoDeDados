SELECT id_estado, nome, sigla FROM estado;

SELECT t1.numero as Apartamento, t1.andar as Andar, t2.id_condominio, t2.nome FROM apartamento t1
LEFT JOIN condominio t2 ON t1.id_condominio = t2.id_condominio;

SELECT * from entidade;

SELECT t1.id_entidade, t1.cpf, t1.nome, t2.numero, t2.andar from entidade t1
LEFT JOIN apartamento t2 on t1.id_apartamento = t2.id_apartamento;


SELECT t1.id_entidade, t1.cpf, t1.nome as Nome_entidade, t2.numero, t2.andar, t3.nome as Condominio from entidade t1
LEFT JOIN apartamento t2 on t1.id_apartamento = t2.id_apartamento
LEFT JOIN condominio t3 on t2.id_condominio = t3.id_condominio;

Select * from entidade t1
RIGHT JOIN sindico t2 on t1.id_entidade = t2.id_entidade;


SELECT * FROM entidade t1 JOIN contato t2 ON t1.id_entidade = t2.id_entidade;

Select * from condominio where id_condominio = 2;

Select * from apartamento;

select id_entidade, tipo, informacao from contato; 
