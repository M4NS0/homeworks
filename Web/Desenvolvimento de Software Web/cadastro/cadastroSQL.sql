drop table "funcionario";
drop table "departamento";
drop table "cargo";


CREATE TABLE departamento (
	departamentoId 		int 					NOT NULL,
	nomeDepartamento 	varchar(45) 			NOT NULL,
	CONSTRAINT departamento_pk PRIMARY KEY (departamentoID)
);
CREATE TABLE cargo (
	cargoId 			int 					NOT NULL,
	nomeCargo 			varchar(45) 			NOT NULL,
	CONSTRAINT cargo_pk 		PRIMARY KEY (cargoId)
);
create table funcionario (
	idFuncionario				serial,
	cpf							Varchar(45)		not null,
	IDcargo						int				not null,
	IDdepartamento				int				not null,
	nomeFuncionario				varchar(45) 	not null,
	nascimento					varchar(45) 	not null,
	salario						numeric(10,2) 	not null,
	constraint funcionario_pk 	primary key (idfuncionario),
	constraint idcargo_fk 		foreign key (IDcargo) 			references cargo(cargoId),
	constraint iddepartamento	foreign key (IDdepartamento) 	references departamento(departamentoID)
);

select * from cargo;
select * from departamento;
select * from funcionario;
insert into cargo (cargoId,nomeCargo) values (0,'diretor');
insert into cargo (cargoId,nomeCargo) values (1,'estagiario');
insert into cargo (cargoId,nomeCargo) values (2,'auxiliar');
insert into cargo (cargoId,nomeCargo) values (3,'assistente');
insert into departamento (departamentoID,nomeDepartamento) values (0,'ti');
insert into departamento (departamentoID,nomeDepartamento) values (1,'diretoria');
insert into departamento (departamentoID,nomeDepartamento) values (2,'administrativo');
insert into departamento (departamentoID,nomeDepartamento) values (3,'financeiro');
insert into funcionario (cpf,IDcargo,IDdepartamento,nomeFuncionario,nascimento,salario) 
values('70399247149',0,0,'Bruno C. Manso','30/10/1980',5000.00);

insert into funcionario (cpf,IDcargo,IDdepartamento,nomeFuncionario,nascimento,salario) 
values('22222',0,0,'Teste de Tal','30/10/1980',5000.00);

select * from cargo, departamento, funcionario where idcargo = cargoId and iddepartamento = departamentoid;
select (idFuncionario, cpf,departamentoID,cargoId,nomeFuncionario,nascimento,salario,nomeDepartamento,nomeCargo) from cadastros.cargo, cadastros.departamento, cadastros.funcionario where idcargo = cargoId and iddepartamento = departamentoid;

select * from cadastros.departamento where lower(nomedepartamento)='diretoria' order by nomedepartamento;
select * from departamento where (nomedepartamento) = 'diretoria';
select * from cadastros.cargo where cargoId=2;
select * from cadastros.cargo where lower (nomecargo)= 'diretor';

select * from cadastros.funcionario where idFuncionario=11;

delete from cadastros.funcionario where idFuncionario = 11;
delete from cargo;
delete from departamento;
delete from funcionario;

select funcionario.idFuncionario, funcionario.cpf, cargo.cargoId, cargo.nomeCargo, funcionario.nomeFuncionario, funcionario.nascimento, funcionario.salario,
 departamento.departamentoid, departamento.nomedepartamento from funcionario
 inner join departamento on departamento.departamentoid = funcionario.iddepartamento
 inner join cargo on cargo.cargoId = funcionario.idcargo;

select * from cargo where cargoID=0;


select * from cadastros.cargo where lower(nomecargo)='diretor' order by nomecargo;

select cadastros.funcionario.idFuncionario, cadastros.funcionario.cpf, cadastros.cargo.cargoId, cadastros.cargo.nomeCargo, cadastros.funcionario.nomeFuncionario, cadastros.funcionario.nascimento, cadastros.funcionario.salario,
 cadastros.departamento.departamentoid, cadastros.departamento.nomedepartamento from cadastros.funcionario
 inner join cadastros.departamento on cadastros.departamento.departamentoid = cadastros.funcionario.iddepartamento
 inner join cadastros.cargo on cadastros.cargo.cargoId = cadastros.funcionario.idcargo;

