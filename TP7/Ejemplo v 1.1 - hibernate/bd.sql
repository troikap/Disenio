/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : diseño

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2016-10-04 11:31:30
*/

SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `articulo`;
CREATE TABLE `articulo` (
  `OIDArticulo` varchar(36) NOT NULL,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`OIDArticulo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `articulo` VALUES ('6bbd4a6c-fcf8-11e5-870d-e8039a52bc18', '5', 'Detergente Magistral');


DROP TABLE IF EXISTS `detallereposicion`;
CREATE TABLE `detallereposicion` (
  `OIDDetalleReposicion` varchar(36) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `OIDArticulo` varchar(36) NOT NULL,
  `OIDReposicion` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`OIDDetalleReposicion`),
  KEY `OIDArticulo` (`OIDArticulo`),
  KEY `OIDReposicion` (`OIDReposicion`),
  KEY `idx` (`OIDDetalleReposicion`) USING BTREE,
  CONSTRAINT `OIDArticulo` FOREIGN KEY (`OIDArticulo`) REFERENCES `articulo` (`OIDArticulo`),
  CONSTRAINT `OIDReposicion` FOREIGN KEY (`OIDReposicion`) REFERENCES `reposicion` (`OIDReposicion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `detallereposicion` VALUES ('143b12b8-a0b1-4702-b6a7-43a58d3c14e9', '5', '6bbd4a6c-fcf8-11e5-870d-e8039a52bc18', '4d9a885c-fcf8-11e5-870d-e8039a52bc18');


DROP TABLE IF EXISTS `estado`;
CREATE TABLE `estado` (
  `OIDEstado` varchar(36) NOT NULL,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  PRIMARY KEY (`OIDEstado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `estado` VALUES ('2db55a28-fcf8-11e5-870d-e8039a52bc18', '1', 'Creada');



DROP TABLE IF EXISTS `reposicion`;
CREATE TABLE `reposicion` (
  `OIDReposicion` varchar(36) NOT NULL,
  `numero` int(10) NOT NULL,
  `fecha` date NOT NULL,
  `OIDEstado` varchar(36) NOT NULL DEFAULT '',
  PRIMARY KEY (`OIDReposicion`),
  KEY `OIDEstado` (`OIDEstado`),
  CONSTRAINT `OIDEstado` FOREIGN KEY (`OIDEstado`) REFERENCES `estado` (`OIDEstado`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `reposicion` VALUES ('4d9a885c-fcf8-11e5-870d-e8039a52bc18', '3', '2016-04-07', '2db55a28-fcf8-11e5-870d-e8039a52bc18');
