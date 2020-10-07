USE cadastros;
DROP TABLE funcionario;
DROP TABLE departamento;
DROP TABLE cargo;



CREATE TABLE cargo (
	cargoID			INT				PRIMARY KEY AUTO_INCREMENT,
	nome			VARCHAR(80)		NOT NULL
);

CREATE TABLE departamento (
	departamentoID 	INT				PRIMARY KEY AUTO_INCREMENT,
    nome			VARCHAR(80)		NOT NULL,
    IDcargo			int				NOT NULL,
    
    CONSTRAINT `FKidCargo`
    FOREIGN KEY (`IDcargo`)
    REFERENCES `cadastros`.`cargo` (`cargoID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);

CREATE TABLE `cadastros`.`funcionario` (
  `funcionarioID` 	INT 			NOT NULL AUTO_INCREMENT,
  `IDcargo` 		INT 			NOT NULL,
  `IDdepartamento` 	INT 			NOT NULL,
  `nome` 			VARCHAR(45) 	NOT NULL,
  `cpf` 			VARCHAR(45) 	NOT NULL,
  `nascimento` 		DATE 			NOT NULL,
  `salario` 		DOUBLE 			NOT NULL,
  
  PRIMARY KEY (`funcionarioID`),
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
    
insert into cargo (cargoID,nome) values (0,'Teste');
select * from cargo;
insert into cargo (cargoID,nome) values (0,'Teste2');
insert into cargo (cargoID,nome) values (null,Teste3);
update cargo set nome='test' where cargoID=1;
delete from cargo where cargoID=0;