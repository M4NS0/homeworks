

USE cadastros;

/* DELETES */
DROP TABLE funcionario;
DROP TABLE departamento;
DROP TABLE cargo;

/* CRIAR TABELAS */
CREATE TABLE cargo (
	cargoID				INT				PRIMARY KEY AUTO_INCREMENT,
	nomeCargo			VARCHAR(80)		NOT NULL
);

CREATE TABLE departamento (
	departamentoID 			INT				PRIMARY KEY AUTO_INCREMENT,
    nomeDepartamento		VARCHAR(80)		NOT NULL
);

CREATE TABLE `cadastros`.`funcionario` (
	`cpf` 				VARCHAR(45) 	NOT NULL,
	`IDcargo` 			INT 			NOT NULL,
	`IDdepartamento`	INT 			NOT NULL,
	`nome` 				VARCHAR(45) 	NOT NULL,
	`nascimento` 		VARCHAR(45)		NOT NULL,
	`salario` 			DOUBLE 			NOT NULL,
  
  PRIMARY KEY (`cpf`),
  INDEX `FKcargoID_idx` (`IDcargo` ASC) VISIBLE,
  INDEX `FKdepartamentoID_idx` (`IDdepartamento` ASC) VISIBLE,
  
  CONSTRAINT `FKcargoID`
    FOREIGN KEY (`IDcargo`)
    REFERENCES `cadastros`.`cargo` (`cargoID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    
  CONSTRAINT `FKdepartamentoID`
    FOREIGN KEY (`IDdepartamento`)
    REFERENCES `cadastros`.`departamento` (`departamentoID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


SET SQL_SAFE_UPDATES = 0;

/* TESTANDO INSERÇÕES */
insert into cargo (cargoID,nome) values (0,'Estagiário');
insert into departamento (departamentoID,nomeDepartamtento) values (0,'TI');
insert into funcionario (cpf,IDcargo,IDdepartamento,nome,nascimento,salario) values (70399247149,1,1,'Bruno C. Manso', '30-10-1980', 10000.00);


/* SELECTS */ 
select * from cargo;
select * from cargo order by nome;
SELECT MAX(cargoID) FROM cargo;

select * from departamento;

select * from funcionario;
select (departamentoID) from departamento where nome="Tecnologia da Informação";
select 	cpf,IDcargo,nomeCargo,IDdepartamento,nomeDepartamento,nome,nascimento,salario from funcionario, cargo, departamento where IDcargo = cargoID AND	IDdepartamento = departamentoID order by nome;
    

/* DELETES 2 */

delete from funcionario;
delete from departamento;
delete 	from cargo;

