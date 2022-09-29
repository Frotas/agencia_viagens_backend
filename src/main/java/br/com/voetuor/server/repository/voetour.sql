DROP DATABASE IF EXISTS `voetour`;

CREATE DATABASE IF NOT EXISTS `voetour`
	DEFAULT COLLATE utf8mb4_general_ci
    DEFAULT CHARACTER SET utf8mb4;

USE `voetour`;

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
	pk_client VARCHAR(11) NOT NULL UNIQUE,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    avatar BLOB,
    email VARCHAR(60) NOT NULL,
    passwd VARCHAR(256) NOT NULL,
    CONSTRAINT PRIMARY KEY (`pk_client`)
);

DROP TABLE IF EXISTS `address`;
CREATE TABLE IF NOT EXISTS `address` (
	pk_cep VARCHAR(8) NOT NULL UNIQUE,
    street VARCHAR(100) NOT NULL,
    num INT NOT NULL,
    city VARCHAR(100) NOT NULL,
	estate VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL,
    fk_client VARCHAR(11) NOT NULL,
    CONSTRAINT PRIMARY KEY (`pk_cep`)
);

DROP TABLE IF EXISTS `passage`;
CREATE TABLE IF NOT EXISTS `passage` (
	pk_passage VARCHAR(200) NOT NULL UNIQUE,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    passage_type VARCHAR(30) NOT NULL,
    seat VARCHAR(4) NOT NULL,
    gate VARCHAR(10) NOT NULL,
    origin VARCHAR(8) NOT NULL,
    destiny VARCHAR(8) NOT NULL,
    board_group INT NOT NULL,
    board_time TIME NOT NULL,
    departs DATETIME NOT NULL,
    arrives DATETIME NOT NULL,
    fk_client VARCHAR(11) NOT NULL,
    CONSTRAINT PRIMARY KEY (`pk_passage`)
);

DROP TABLE IF EXISTS `payment`;
CREATE TABLE IF NOT EXISTS `payment` (
	pk_payment VARCHAR(256) NOT NULL UNIQUE,
    file_payment BLOB NOT NULL,
    fk_card VARCHAR(11) NOT NULL,
    fk_client VARCHAR(11) NOT NULL,
    CONSTRAINT PRIMARY KEY (`pk_payment`)
);

DROP TABLE IF EXISTS `card__list`;
CREATE TABLE IF NOT EXISTS `card__list` (
	pk_card VARCHAR(20) NOT NULL,
    card_number VARCHAR(100) NOT NULL,
    holder VARCHAR(60) NOT NULL,
    card_type INT NOT NULL,
    validate DATE NOT NULL,
    cvv INT NOT NULL,
    CONSTRAINT PRIMARY KEY (`pk_card`)
);

ALTER TABLE `address` ADD FOREIGN KEY (`fk_client`) REFERENCES `client`(`pk_client`);

ALTER TABLE `payment` ADD FOREIGN KEY (`fk_client`) REFERENCES `client`(`pk_client`);

ALTER TABLE `passage` ADD FOREIGN KEY (`fk_client`) REFERENCES `client`(`pk_client`);

ALTER TABLE `passage` ADD FOREIGN KEY (`origin`) REFERENCES `address` (`pk_cep`);
ALTER TABLE `passage` ADD FOREIGN KEY (`destiny`) REFERENCES `address` (`pk_cep`);

ALTER TABLE `payment` ADD FOREIGN KEY (`fk_card`) REFERENCES `card__list`(`pk_card`);
