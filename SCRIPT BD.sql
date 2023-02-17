CREATE database titulacion;
Use titulacion ;

CREATE TABLE `persona` (
  `idPersona` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(80) COLLATE utf8_bin NOT NULL,
  `primerApellido` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `segundoApellido` varchar(300) COLLATE utf8_bin NOT NULL,
  `idUniversidad` int NOT NULL,
  `usuario` varchar(45) COLLATE utf8_bin NOT NULL,
  `password` varchar(45) COLLATE utf8_bin NOT NULL,
  `email` varchar(150) COLLATE utf8_bin NOT NULL,
  `idRol` int NOT NULL,
  `idAdeudo` int NOT NULL,
  `superadmin` tinyint(1) DEFAULT NULL,
  
  `fechaCreacion` datetime NOT NULL,
  `fechaModificacion` datetime DEFAULT NULL,
  `estatus` tinyint(1) NOT NULL,
   PRIMARY KEY (`idPersona`)
	
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `rol` (
  `idRol` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_bin NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaModificacion` datetime DEFAULT NULL,
  `estatus` tinyint(1) NOT NULL,
  PRIMARY KEY (`idRol`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `universidad` (
  `idUniversidad` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_bin NOT NULL,
  `fechaCreacion` datetime NOT NULL,
  `fechaModificacion` datetime DEFAULT NULL,
  `estatus` tinyint(1) NOT NULL,
  PRIMARY KEY (`idUniversidad`)
 
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `procesoTitulacion` (
  `idProcesoTitulacion` int NOT NULL AUTO_INCREMENT,
  `comentarios` varchar(45) COLLATE utf8_bin NOT NULL,
  `idPersona` int NOT NULL,
  `fechaCreacion` datetime DEFAULT NULL,
  `estatus` tinyint(1) NOT NULL,
  PRIMARY KEY (`idProcesoTitulacion`)
  
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `adeudo` (

  `idAdeudo` int NOT NULL AUTO_INCREMENT,
  `idPersona` int NOT NULL,
  `aduedo` int DEFAULT NULL ,
  PRIMARY KEY (`idAdeudo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `docuementacion` (
  `idDocuementacion` int NOT NULL AUTO_INCREMENT,
  `idPersona` int NOT NULL,
  `idAdeudo` int NOT NULL ,
  `estatus` tinyint(1) NOT NULL,
  `expedienteAlumno` varchar(500) COLLATE utf8_bin NOT NULL,
  `nombre` varchar(80) COLLATE utf8_bin NOT NULL,
  `primerApellido` varchar(300) COLLATE utf8_bin DEFAULT NULL,
  `segundoApellido` varchar(300) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`idDocuementacion`)
 
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

ALTER TABLE persona  ADD CONSTRAINT `fk_persona_rol1` FOREIGN KEY (`idRol`) REFERENCES `rol` (`idRol`);
ALTER TABLE persona  ADD CONSTRAINT `fk_persona_adeudo1` FOREIGN KEY (`idAdeudo`) REFERENCES `adeudo` (`idAdeudo`);
ALTER TABLE persona  ADD CONSTRAINT `fk_persona_universidad1` FOREIGN KEY (`idUniversidad`) REFERENCES `universidad` (`idUniversidad`);
ALTER TABLE procesoTitulacion  ADD CONSTRAINT `fk_persona_procesoTitulacion1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);
ALTER TABLE docuementacion ADD CONSTRAINT `fk_universidad_docuementacionPersona` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`);
ALTER TABLE docuementacion ADD CONSTRAINT `fk_universidad_docuementacionAdeudo` FOREIGN KEY (`idAdeudo`) REFERENCES `adeudo` (`idAdeudo`);
ALTER TABLE persona add esEstudiante tinyint(1) DEFAULT NULL;