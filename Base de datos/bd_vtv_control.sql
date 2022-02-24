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
-- Table structure for table `control`
--

DROP TABLE IF EXISTS `control`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `control` (
  `id_control` int NOT NULL AUTO_INCREMENT,
  `vtv_id_vtv` int DEFAULT NULL,
  `tipo_control_id_tipo_control` int DEFAULT NULL,
  `estado_control_id_estado_control` int DEFAULT NULL,
  PRIMARY KEY (`id_control`),
  KEY `idVtv_idx` (`vtv_id_vtv`),
  KEY `idTipoControl_idx` (`tipo_control_id_tipo_control`),
  KEY `idEstadoControl_idx` (`estado_control_id_estado_control`),
  CONSTRAINT `idEstadoControl` FOREIGN KEY (`estado_control_id_estado_control`) REFERENCES `estadocontrol` (`id_estado_control`),
  CONSTRAINT `idTipoControl` FOREIGN KEY (`tipo_control_id_tipo_control`) REFERENCES `tipocontrol` (`id_Tipo_Control`),
  CONSTRAINT `idVtv` FOREIGN KEY (`vtv_id_vtv`) REFERENCES `vtv` (`id_Vtv`)
) ENGINE=InnoDB AUTO_INCREMENT=141 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `control`
--

LOCK TABLES `control` WRITE;
/*!40000 ALTER TABLE `control` DISABLE KEYS */;
INSERT INTO `control` VALUES (117,86,1,1),(118,86,2,1),(119,87,1,1),(120,87,2,2),(121,88,1,1),(122,88,2,1),(123,89,1,3),(124,89,2,2),(125,90,1,3),(126,90,2,1),(127,91,1,1),(128,91,2,2),(129,92,1,3),(130,92,2,1),(131,93,1,1),(132,93,2,1),(133,94,1,1),(134,94,2,1),(135,95,1,1),(136,95,2,1),(137,96,1,3),(138,96,2,2),(139,97,1,1),(140,97,2,1);
/*!40000 ALTER TABLE `control` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-24 10:22:54
