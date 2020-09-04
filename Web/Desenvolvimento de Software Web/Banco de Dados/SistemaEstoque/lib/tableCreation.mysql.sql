CREATE TABLE `estoque` (
	`id`			INT(11) NOT NULL AUTO_INCREMENT,
    `descricao` 	VARCHAR(50) NULL DEFAULT NULL,
    `precounit` 	DOUBLE NULL DEFAULT NULL,
    `quantidade`	DOUBLE NULL DEFAULT NULL,
    
    PRIMARY KEY (`id`)
);