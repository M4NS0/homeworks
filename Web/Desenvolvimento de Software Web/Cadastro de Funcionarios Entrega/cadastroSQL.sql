

drop table "departamento";
drop table "cargo";
drop table "funcionario";

CREATE TABLE departamento (
	departamentoID 		int 					NOT NULL,
	nomeDepartamento 	varchar(45) 			NOT NULL,
	CONSTRAINT departamento_pk PRIMARY KEY (departamentoID)
);
CREATE TABLE cargo (
	cargoID 			int 					NOT NULL,
	nomeCargo 			varchar(45) 			NOT NULL,
	CONSTRAINT cargo_pk 		PRIMARY KEY (cargoID)
);
create table funcionario (
	cpf							Varchar(45)		not null,
	IDcargo						int				not null,
	IDdepartamento				int				not null,
	nome						varchar(45) 	not null,
	nascimento					varchar(45) 	not null,
	salario						numeric(10,2) 	not null,
	constraint funcionario_pk 	primary key (cpf),
	constraint idcargo_fk 		foreign key (IDcargo) 			references cargo(cargoID),
	constraint iddepartamento	foreign key (IDdepartamento) 	references departamento(departamentoID)
);
select * from cargo;
select * from departamento;
select * from funcionario;
insert into cargo (cargoID,nomeCargo) values (0,'Diretor');
insert into cargo (cargoID,nomeCargo) values (1,'Estagiario');
insert into cargo (cargoID,nomeCargo) values (2,'Auxiliar');
insert into cargo (cargoID,nomeCargo) values (3,'Assistente');
insert into departamento (departamentoID,nomeDepartamento) values (0,'TI');
insert into departamento (departamentoID,nomeDepartamento) values (1,'Diretoria');
insert into departamento (departamentoID,nomeDepartamento) values (2,'Administrativo');
insert into departamento (departamentoID,nomeDepartamento) values (3,'Financeiro');
insert into funcionario (cpf,IDcargo,IDdepartamento,nome,nascimento,salario) 
values('70399247149',1,1,'Bruno C. Manso','30/10/1980',5000.00);

insert into funcionario (cpf,IDcargo,IDdepartamento,nome,nascimento,salario) 
values('22222',1,1,'Teste de Tal','30/10/1980',5000.00);

select * from cargo, departamento, funcionario where idcargo = cargoid and iddepartamento = departamentoid;
select (cpf,departamentoID,cargoID,nome,nascimento,salario,nomeDepartamento,nomeCargo) from cadastros.cargo, cadastros.departamento, cadastros.funcionario where idcargo = cargoid and iddepartamento = departamentoid;


delete from cargo;
delete from departamento;
delete from funcionario;



