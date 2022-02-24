-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_vtv
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `duenio`
--

DROP TABLE IF EXISTS `duenio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `duenio` (
  `dni_duenio` varchar(80) NOT NULL,
  `nombre` varchar(80) DEFAULT NULL,
  `direccion` varchar(80) DEFAULT NULL,
  `telefono` varchar(80) DEFAULT NULL,
  `tipo_duenio_id_tipo_duenio` int DEFAULT NULL,
  PRIMARY KEY (`dni_duenio`),
  UNIQUE KEY `dni_duenio_UNIQUE` (`dni_duenio`),
  KEY `idTipoDuenio_idx` (`tipo_duenio_id_tipo_duenio`),
  CONSTRAINT `idTipoDuenio` FOREIGN KEY (`tipo_duenio_id_tipo_duenio`) REFERENCES `tipoduenio` (`id_tipo_duenio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `duenio`
--

LOCK TABLES `duenio` WRITE;
/*!40000 ALTER TABLE `duenio` DISABLE KEYS */;
INSERT INTO `duenio` VALUES ('1','Mario Flores','Junin','12345',1),('10','Pedro Perez','Mendoza','123123',1),('11','Pedro Perez','Mendoza','123123',1),('12','asd','asd','asd',1),('2','Javier Garcia','Rivadavia','12348',2),('3','Facundo Jhon','San Martin','1587',1),('40103904','Facundo Nicolas','junin','2634747337',2),('40103905','Javier Garcia','asd','123457',2),('8','Raul Lopez','Godoy Cruz','156789',2),('9','Facundo Lopez','Mendoza','15978',1);
/*!40000 ALTER TABLE `duenio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-24 16:16:22
