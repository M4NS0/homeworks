/* APAGAR TABELAS */
DROP TABLE public."ITEM-PEDIDO";
DROP TABLE public."PEDIDO";
DROP TABLE public."PRODUTO";
DROP TABLE public."CLIENTE";
DROP TABLE public."VENDEDOR";

/* CRIA AS TABELAS */
CREATE TABLE public."VENDEDOR"(
    "Nome-vend" VARCHAR(80) NOT NULL,
    "Cpf-vend" BIGINT NOT NULL,
    "Tx-comissao" NUMERIC(8,2) NOT NULL,
    "Sexo-vend" VARCHAR(1) NOT NULL,
    CONSTRAINT "VENDEDOR_pkey" PRIMARY KEY("Cpf-vend"));

CREATE TABLE public."CLIENTE"(
    "Nome-cli" VARCHAR(80) NOT NULL,
    "Endereço-cli" VARCHAR(90),
    "Data-nasc-cli" DATE NOT NULL,
    "Sexo-cli" VARCHAR(1) NOT NULL,
    "Cpf-cliente" BIGINT NOT NULL,
    CONSTRAINT "PK-Cli" PRIMARY KEY("Cpf-cliente"));

CREATE TABLE public."PRODUTO"(
    "Cod-produto" INTEGER NOT NULL,
    "Desc-produto" VARCHAR(80) NOT NULL,
    "Val-produto" NUMERIC(10,2) NOT NULL,
    "Unid-medida" TEXT NOT NULL,
    CONSTRAINT "PRODUTO_pkey" PRIMARY KEY("Cod-produto"));

CREATE TABLE public."PEDIDO"(
    "Num-pedido" INTEGER NOT NULL,
    "Data-pedido" DATE NOT NULL,
    "End-entrega-pedido" VARCHAR(90),
    "Data-entrega-pedido" DATE NOT NULL,
    "Cpf-vend" BIGINT NOT NULL,
    "Cpf-cli" BIGINT NOT NULL,
    CONSTRAINT "PEDIDO_pkey" PRIMARY KEY("Num-pedido"),
    CONSTRAINT "FK-ped-vend" FOREIGN KEY ("Cpf-vend") REFERENCES public."VENDEDOR"("Cpf-vend") ON
DELETE NO ACTION ON
UPDATE NO ACTION NOT DEFERRABLE,
       CONSTRAINT "Fk-Cliente" FOREIGN KEY ("Cpf-cli") REFERENCES public."CLIENTE"("Cpf-cliente") ON
DELETE NO ACTION ON
UPDATE NO ACTION NOT DEFERRABLE);

CREATE TABLE public."ITEM-PEDIDO"(
    "Num-ped" INTEGER NOT NULL,
    "Seq-item" INTEGER NOT NULL,
    "cod-prod" INTEGER NOT NULL,
    "Qtde-item-ped" NUMERIC(8,2) NOT NULL,
    CONSTRAINT "PK-Item-pedido" PRIMARY KEY("Num-ped", "Seq-item"),
    CONSTRAINT "FK-Pedido" FOREIGN KEY ("Num-ped") REFERENCES public."PEDIDO"("Num-pedido") ON
DELETE NO ACTION ON
UPDATE NO ACTION NOT DEFERRABLE,
       CONSTRAINT "FK-Produto" FOREIGN KEY ("cod-prod") REFERENCES public."PRODUTO"("Cod-produto") ON
DELETE NO ACTION ON
UPDATE NO ACTION NOT DEFERRABLE);

/* APAGA DADOS TABELAS */
DELETE FROM public."ITEM-PEDIDO";
DELETE FROM public."PEDIDO";
DELETE FROM public."PRODUTO";
DELETE FROM public."CLIENTE";
DELETE FROM public."VENDEDOR";

/* INSERE VALORES */
/* VENDEDOR */
INSERT INTO public."VENDEDOR"
VALUES ('Vend-1', 6789, 0.2, 'M'),
       ('Vend-2', 7890, 0.15, 'M'),
       ('Vend-3', 8901, 0.21, 'M'),
       ('Vend-4', 9012, 0.2, 'M'),
       ('Paulo', 3456, 0.16, 'M');

/* CLIENTE */
INSERT INTO public."CLIENTE"
VALUES ('Pedro', 'End1', '1922-02-22', 'M', 1234),
       ('Ana', 'Ende2', '1923-03-23', 'F', 2345),
       ('Paulo', 'end. do Paulo', '1984-04-24', 'M', 3456),
       ('Jose A', 'Endereço A', '1985-05-25', 'M', 4567),
       ('Jose B', 'XXXXXX', '1996-06-26', 'M', 5678);

/* PRODUTOS */
INSERT INTO public."PRODUTO"
VALUES (1, 'Arroz', 10.5, 'pacot'),
       (2, 'Feijao', 4.3, 'KG'),
       (3, 'TV', 2530, 'UN'),
       (4, 'SAPATO', 89.9, 'PAR'),
       (5, 'CAMISA', 120, 'UN'),
       (6, 'BATOM', 8.5, 'dz');

/* PEDIDOS */
INSERT INTO public."PEDIDO"
VALUES (25, '2019-01-12', 'END-ENTREGA-1', '2019-01-12', 6789, 1234),
       (26, '2019-01-13', 'END-ENTREGA-2', '2019-01-17', 8901, 4567),
       (27, '2019-01-14', 'END-ENTREGA-3', '2019-01-22', 6789, 3456),
       (28, '2019-01-15', 'END-ENTREGA-4', '2019-01-27', 6789, 1234),
       (29, '2019-01-16', 'END-ENTREGA-5', '2019-02-01', 9012, 3456),
       (30, '2019-01-17', 'END-ENTREGA-6', '2019-02-06', 7890, 2345);

/* ITEM PEDIDO */
INSERT INTO public."ITEM-PEDIDO"
VALUES (25, 1, 1, 2),
       (25, 2, 2, 0.6),
       (25, 3, 5, 10),
       (26, 1, 2, 1),
       (27, 1, 6, 2);

/* UPDATE */

UPDATE "VENDEDOR" SET "Tx-comissao" = "Tx-comissao" * 10 WHERE "Cpf-vend" = 7890;
UPDATE "VENDEDOR" SET "Tx-comissao" = "Tx-comissao" * 10;

-- incluir atributo chamado uf em cliente campo opcional
-- incluir pedro e jose A (Go), Ana e paulo (SP), jose B (Pi) 

/* ADICIONAR COLUNA UF */

ALTER TABLE "CLIENTE" ADD COLUMN "UF" character varying(2);

/* APAGAR */

--ALTER TABLE "CLIENTE"
--DROP COLUMN "uf";

/* UPDATE EM UF */

UPDATE "CLIENTE" SET "UF" = 'PR' WHERE "Cpf-cliente" = 1234 OR "Cpf-cliente" = 4567;
UPDATE "CLIENTE" SET "UF" = 'GO' WHERE "Cpf-cliente" IN (1234,4567);

UPDATE "CLIENTE" SET "UF" = 'MT' WHERE "Cpf-cliente" = 2345 OR "Cpf-cliente" = 3456;
UPDATE "CLIENTE" SET "UF" = 'SP' WHERE "Cpf-cliente" IN (2345,3456);

UPDATE "CLIENTE" SET "UF" = 'PI' WHERE "Cpf-cliente" = 5678;

/* SELECT TABELAS */

SELECT * FROM public."CLIENTE";
SELECT * FROM public."VENDEDOR";
SELECT * FROM public."PRODUTO";
SELECT * FROM public."PEDIDO";
SELECT * FROM public."ITEM-PEDIDO";





