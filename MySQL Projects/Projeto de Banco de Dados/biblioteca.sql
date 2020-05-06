/* DROPING */ 

DROP TABLE "Item-Pedido";
DROP TABLE "Pedido";
DROP TABLE "Livro";
DROP TABLE "Categoria";
DROP TABLE "Autor";
DROP TABLE "Atendente";
DROP TABLE "Cliente";

/* CREATING TABLES */

CREATE TABLE "Cliente"
(	
	"Nome-cli" character varying(80) NOT NULL,
	"Cpf-cliente" bigint NOT NULL,
	"End-cli" character varying NOT NULL,
	"Tel-cli" bigint NOT NULL,
	
	CONSTRAINT "Pk-Cpf-cli" PRIMARY KEY ("Cpf-cliente") 
);

CREATE TABLE "Atendente" 
(
	"Nome-ate" character varying(80) NOT NULL,
	"Cpf-atendente" bigint NOT NULL,
	"End-ate" character varying NOT NULL,
	"Tel-ate" bigint NOT NULL,
	"Sal-ate" numeric (4,2) NOT NULL,
	
	CONSTRAINT "Pk-Cpf-ate" PRIMARY KEY ("Cpf-atendente")
);

CREATE TABLE "Autor"
(
	"Nome-aut" character varying(80) NOT NULL,
	"Nacionalidade-aut" character varying NOT NULL,
	"Cod-autor" bigint NOT NULL,
	
	CONSTRAINT "Pk-cod-aut" PRIMARY KEY ("Cod-autor")
);

CREATE TABLE "Categoria" 
(
	"Descrição" character varying(80) NOT NULL,
	"Cod-aut" bigint NOT NULL,
	"Cod-categoria" bigint NOT NULL,
	
	CONSTRAINT "Pk-cod-cat" PRIMARY KEY ("Cod-categoria"),
	CONSTRAINT "Fk-cod-aut" FOREIGN KEY ("Cod-aut") REFERENCES "Autor"("Cod-autor")
);

CREATE TABLE "Livro"
(
	"Nome-livro" character varying(180) NOT NULL,
	"Numero-paginas"  bigint NOT NULL,
	"Cod-livro"  bigint NOT NULL,
	"Cod-cat" bigint NOT NULL,
	"Cod-aut" bigint NOT NULL,
	
	CONSTRAINT "Pk-cod-livro" PRIMARY KEY ("Cod-livro"),
	CONSTRAINT "Fk-cod-cat" FOREIGN KEY ("Cod-cat") REFERENCES "Categoria"("Cod-categoria"),
	CONSTRAINT "Fk-cod-aut" FOREIGN KEY ("Cod-aut") REFERENCES "Autor"("Cod-autor")
);

CREATE TABLE "Pedido"
(
	"Cpf-cli" bigint NOT NULL,
	"Cpf-ate" bigint NOT NULL,
	"Num-pedido" bigint NOT NULL,
	"Data-pedido" date NOT NULL,
	
	CONSTRAINT "Pk-num-pedido" PRIMARY KEY ("Num-pedido"),
	CONSTRAINT "Fk-cpf-cli" FOREIGN KEY ("Cpf-cli") REFERENCES "Cliente"("Cpf-cliente"),
	CONSTRAINT "Fk-cpf-ate" FOREIGN KEY ("Cpf-ate") REFERENCES "Atendente"("Cpf-atendente")
	
);

CREATE TABLE "Item-Pedido" 
(
	"Num-ped" bigint NOT NULL,
	"Cod-liv"  bigint NOT NULL,
	
	CONSTRAINT "Pk-num-ped" PRIMARY KEY ("Num-ped"),
	CONSTRAINT "Fk-num-ped" FOREIGN KEY ("Num-ped") REFERENCES "Pedido"("Num-pedido"),
	CONSTRAINT "Fk-cod-liv" FOREIGN KEY ("Cod-liv") REFERENCES "Livro"("Cod-livro")
	
);

/* POPULATING TABLE CLIENTE */

INSERT INTO "Cliente" 
VALUES ('Dimitri', 12345, 'Novochevorychensky, 111', 99123456),
	   ('Ruslan', 23456, 'Tolstoi, 130', 99234567),
	   ('Svetlana', 34567, 'Prypriat, 666', 99345678),
	   ('Iuri', 45678, 'Sochi, 2002', 99456789),
	   ('Micha', 56789, 'Ecaterimburgo, 1800', 99567890);

/* DELETING PPL */
DELETE FROM "Cliente" WHERE "Cpf-cliente" = 12345;

/* ALTERING TABLE */
ALTER TABLE "Cliente" ADD COLUMN "Sobrenome-cliente" character varying (80);
ALTER TABLE "Cliente" ADD COLUMN "Sexo-cliente" character varying (1);

/* UPDATING TABLE */
UPDATE "Cliente" SET "Sobrenome-cliente" = 'Kusnetsov' WHERE "Nome-cli" = 'Dimitri';
UPDATE "Cliente" SET "Sexo-cliente" = 'M' WHERE "Nome-cli" = 'Dimitri';

UPDATE "Cliente" SET "Sobrenome-cliente" = 'Dostoievsky' WHERE "Nome-cli" = 'Micha';
UPDATE "Cliente" SET "Sexo-cliente" = 'M' WHERE "Nome-cli" = 'Micha';

UPDATE "Cliente" SET "Sobrenome-cliente" = 'Pavlov' WHERE "Nome-cli" = 'Svetlana';
UPDATE "Cliente" SET "Sexo-cliente" = 'F' WHERE "Nome-cli" = 'Svetlana';

UPDATE "Cliente" SET "Sobrenome-cliente" = 'Gagarin' WHERE "Nome-cli" = 'Iuri';
UPDATE "Cliente" SET "Sexo-cliente" = 'M' WHERE "Nome-cli" = 'Iuri';

UPDATE "Cliente" SET "Sobrenome-cliente" = 'Fedorof' WHERE "Nome-cli" = 'Ruslan';
UPDATE "Cliente" SET "Sexo-cliente" = 'M' WHERE "Nome-cli" = 'Ruslan';

/* SELECTING TABLE */
SELECT * FROM "Cliente";

/* POPULATING TABLE ATENDENTE */

INSERT INTO "Atendente" 
VALUES ('Petrov', 678910, 'Volvogrado, 1780', 99678910, 10.10),
	   ('Mikail', 7891011, 'Omsk, 1944', 997891011, 12.20);
	   
/* ALTERING TABLE */
ALTER TABLE "Atendente" ALTER COLUMN "Sal-ate" TYPE numeric (8,2);
	   
/* ALTERING LINES */
UPDATE "Atendente" SET "End-ate" = 'Volvogrado, 1943' WHERE "Nome-ate" = 'Mikail';
UPDATE "Atendente" SET "Nome-ate" = 'Mikahil' WHERE "Nome-ate" = 'Mikail';
UPDATE "Atendente" SET "Tel-ate" = 99789010 WHERE "Nome-ate" = 'Mikahil';
UPDATE "Atendente" SET "Sal-ate" = 1500.50 WHERE "Nome-ate" = 'Petrov';
UPDATE "Atendente" SET "Sal-ate" = 1250.50 WHERE "Nome-ate" = 'Mikahil';

/* SELECTING TABLE */
SELECT * FROM "Atendente";

/* POPULATING TABLE AUTOR */
INSERT INTO "Autor"
VALUES ('Fyodor', 'Russian', 1821),
	   ('Edgard', 'English', 1809),
	   ('Machado', 'Brasilian', 1839),
	   ('Paul', 'French', 1905),
	   ('Isaac', 'Russian', 1920);

/* ALTERING TABLE */
ALTER TABLE "Autor" ADD COLUMN "Sobrenome-autor" character varying (80);
ALTER TABLE "Autor" RENAME COLUMN "Nacionalidade-aut" TO "Nacionalidade-autor";
ALTER TABLE "Autor" RENAME COLUMN "Nome-aut" TO "Nome-autor";

/* ALTERING CONTENT */
UPDATE "Autor" SET "Sobrenome-autor" = 'Dostoyevsky' WHERE "Nome-autor" = 'Fyodor';
UPDATE "Autor" SET "Sobrenome-autor" = 'Alain Poe' WHERE "Nome-autor" = 'Edgard';
UPDATE "Autor" SET "Sobrenome-autor" = 'Assis' WHERE "Nome-autor" = 'Machado';
UPDATE "Autor" SET "Nome-autor" = 'Jean Paul' WHERE "Nome-autor" = 'Paul';
UPDATE "Autor" SET "Sobrenome-autor" = 'Sartre' WHERE "Nome-autor" = 'Jean Paul';
UPDATE "Autor" SET "Sobrenome-autor" = 'Asimov' WHERE "Nome-autor" = 'Isaac';


/* SELECTING TABLE */
SELECT * FROM "Autor";
SELECT "Nome-autor","Sobrenome-autor", "Nacionalidade-autor" FROM "Autor";

/* POPULATING TABLE CATEGORIA */
INSERT INTO "Categoria"
VALUES 	('Soup Opera', 1821, 1),
       	('Mistery', 1809, 2),
		('Novel', 1839, 3),
		('Philosophy', 1905, 4),
		('Fiction', 1920, 5);

/* SELECTING TABLE */
SELECT * FROM "Categoria";

/* POPULATING TABLE LIVRO */
INSERT INTO "Livro"
VALUES 	('Crime e Castigo', 680, 3030, 1, 1821 ), 
		('O gato preto', 300, 2020, 2, 1809),
		('Memórias Póstumas de Brás Cubas', 320, 1010, 3, 1839),
		('O Existencialismo', 550, 0909, 4, 1905),
		('Os Robos do Amanhecer', 250, 0808, 5, 1920);

/* SELECTING TABLE */
SELECT * FROM "Livro";


/* POPULATING TABLE PEDIDO */
INSERT INTO "Pedido" 
VALUES 	(56789, 678910, 10, '20-02-2002'),
		(45678, 678910, 11, '30-03-2003'),
		(34567, 7891011, 12, '14-04-2004');
	   
	   
/* SELECTING TABLE */
SELECT * FROM "Pedido";

/* POPULATING TABLE ITEM-PEDIDO */
INSERT INTO "Item-Pedido" 
VALUES 	(10,3030),
		(11,2020),
		(12,1010);

/* SELECTING TABLE */
SELECT * FROM "Item-Pedido";

/* DELEÇÕES */
--DELETE FROM "Item-Pedido" WHERE "Num-ped" <= 11;
--DELETE FROM "Pedido" WHERE "Num-pedido" <= 11;

