UPDATE sindico SET ativo = 1 where id_sindico = 2;
update sindico SET indicador_sindico = 1 where id_sindico = 2;

UPDATE contato SET tipo = 2, informacao = 'teste@gmail.com' where id_contato = 3;
UPDATE contato SET informacao = '4733969-8831' where id_contato = 1;

UPDATE apartamento SET andar = 2 where andar = 1;
UPDATE apartamento SET valor_mensalidade = 150 where id_condominio = 2;
update apartamento SET ocupado = 1 where id_condominio = 2;

UPDATE entidade SET nome = 'Jorge' where id_entidade = 2;
UPDATE entidade SET ativo = 0 where id_entidade = 5;

update condominio SET nome = 'Condominio Mudou' where id_condominio = 2;
update condominio SET valor_condominio = 200 where valor_condominio <= 100;