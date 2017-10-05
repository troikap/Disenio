
SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `atributoadicional`;
CREATE TABLE `atributoadicional` (
  			`OIDAtributoAdicional` varchar(36) NOT NULL,
  			`codigoAtributoAdicional` varchar(10) NOT NULL,
  			`nombreAtributoAdicional` varchar(20) NOT NULL,
  			`fechaInhabilitacionAA` varchar(10) NULL,
  			`longitud` int(10) NOT NULL,
  			
			PRIMARY KEY (`OIDAtributoAdicional`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `atributoadicional` VALUES ('11111111-1111-1111-1111-111111111111', 'cod1', 'Impuesto Municipal', NULL, '15');
INSERT INTO `atributoadicional` VALUES ('22222222-2222-2222-2222-222222222222', 'cod2', 'Intereses', NULL, '12');
INSERT INTO `atributoadicional` VALUES ('33333333-3333-3333-3333-333333333333', 'cod3', 'Cobro Haberes', NULL , '13');
INSERT INTO `atributoadicional` VALUES ('44444444-4444-4444-4444-444444444444', 'cod4', 'Mensualidad', '' , '10');


DROP TABLE IF EXISTS `numeracionatributo`;
CREATE TABLE `numeracionatributo` (
  			`OIDNumeracionAtributo` varchar(36) NOT NULL,
  			`orden` int(11) NOT NULL,
  			`OIDAtributoAdicional` varchar(36) NOT NULL,
			`OIDTipoImpuesto` varchar(36) DEFAULT NULL,
  
  			PRIMARY KEY (`OIDNumeracionAtributo`),
  			KEY `OIDAtributoAdicional` (`OIDAtributoAdicional`),
			KEY `idx` (`OIDNumeracionAtributo`) USING BTREE,
			KEY `OIDTipoImpuesto` (`OIDTipoImpuesto`),
      			CONSTRAINT `OIDAtributoAdicional` FOREIGN KEY (`OIDAtributoAdicional`) REFERENCES `atributoadicional` (`OIDAtributoAdicional`),
  			CONSTRAINT `OIDTipoImpuesto` FOREIGN KEY (`OIDTipoImpuesto`) REFERENCES `tipoimpuesto` (`OIDTipoImpuesto`)
			) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `numeracionatributo` VALUES ('00000000-0000-1111-1111-111111111111', '1', '11111111-1111-1111-1111-111111111111', '00000000-0000-0000-0000-111111111111');
INSERT INTO `numeracionatributo` VALUES ('00000000-0000-1111-2222-111111111111', '1', '22222222-2222-2222-2222-222222222222', '00000000-0000-0000-0000-111111111111');
INSERT INTO `numeracionatributo` VALUES ('00000000-0000-2222-3333-111111111111', '2', '33333333-3333-3333-3333-333333333333', '00000000-0000-0000-0000-222222222222');
INSERT INTO `numeracionatributo` VALUES ('00000000-0000-3333-1111-333333333333', '1', '22222222-2222-2222-2222-222222222222', '00000000-0000-0000-0000-333333333333');
INSERT INTO `numeracionatributo` VALUES ('00000000-0000-3333-2222-333333333333', '2', '44444444-4444-4444-4444-444444444444', '00000000-0000-0000-0000-333333333333');



DROP TABLE IF EXISTS `tipoimpuesto`;
CREATE TABLE `tipoimpuesto` (
			  `OIDTipoImpuesto` varchar(36) NOT NULL,
			  `codigoTipoImpuesto` varchar(15) NOT NULL,
			  `nombreTipoImpuesto` varchar(20) NOT NULL,
			  `fechaInhabilitacionTI` varchar(10) NULL,
  
  			 PRIMARY KEY (`OIDTipoImpuesto`)
 			  ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `tipoimpuesto` VALUES ('00000000-0000-0000-0000-111111111111', '987654321', 'Municipal', NULL);
INSERT INTO `tipoimpuesto` VALUES ('00000000-0000-0000-0000-222222222222', '123456789', 'Pension', NULL);
INSERT INTO `tipoimpuesto` VALUES ('00000000-0000-0000-0000-333333333333', '111112222', 'Telefonia', '12345-12-12');
