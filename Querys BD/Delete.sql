DELETE FROM sindico WHERE id_sindico = 1;
DELETE FROM sindico WHERE ativo = 0;
DELETE FROM sindico;

DELETE FROM contato where id_entidade = 5;
DELETE FROM contato where tipo = 1;
DELETE FROM contato where id_contato = 3;

DELETE FROM entidade WHERE id_entidade = 5;
DELETE FROM entidade WHERE id_apartamento = 5;
DELETE FROM entidade WHERE id_entidade = 4;

DELETE FROM apartamento WHERE ocupado = 0;
DELETE FROM apartamento where id_apartamento = 2;
DELETE FROM apartamento WHERE id_condominio = 1;

DELETE FROM condominio where id_condominio = 1;
DELETE FROM condominio WHERE estado = 25;
DELETE FROM condominio where numero > 10;



