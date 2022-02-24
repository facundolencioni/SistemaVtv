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
-- Table structure for table `vtv`
--

DROP TABLE IF EXISTS `vtv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vtv` (
  `id_Vtv` int NOT NULL AUTO_INCREMENT,
  `fecha_Ini` date NOT NULL,
  `fecha_ven` date DEFAULT NULL,
  `vehiculo_id_vehiculo` int DEFAULT NULL,
  `inspector_id_inspector` int DEFAULT NULL,
  `estado_vtv_id_estado_vtv` int DEFAULT NULL,
  `nro_vtv` int NOT NULL,
  PRIMARY KEY (`id_Vtv`),
  KEY `idVehiculo_idx` (`vehiculo_id_vehiculo`),
  KEY `idInspector_idx` (`inspector_id_inspector`),
  KEY `idEstadoVtv_idx` (`estado_vtv_id_estado_vtv`),
  CONSTRAINT `idEstadoVtv` FOREIGN KEY (`estado_vtv_id_estado_vtv`) REFERENCES `estadovtv` (`id_Estado_Vtv`),
  CONSTRAINT `idInspector` FOREIGN KEY (`inspector_id_inspector`) REFERENCES `inspector` (`id_inspector`),
  CONSTRAINT `idVehiculo` FOREIGN KEY (`vehiculo_id_vehiculo`) REFERENCES `vehiculo` (`id_Vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=98 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vtv`
--

LOCK TABLES `vtv` WRITE;
/*!40000 ALTER TABLE `vtv` DISABLE KEYS */;
INSERT INTO `vtv` VALUES (86,'2021-12-29','2022-12-29',1,6,1,4189046),(87,'2021-12-29',NULL,2,8,2,1527968),(88,'2021-12-29','2022-12-29',3,9,1,5881415),(89,'2021-12-29',NULL,4,9,2,3957681),(90,'2021-12-29',NULL,10,6,3,4498086),(91,'2021-12-29',NULL,11,6,2,6438242),(92,'2021-12-29',NULL,12,6,3,3891300),(93,'2021-12-29','2022-12-29',13,6,1,3485923),(94,'2021-12-29','2022-12-29',14,8,1,8763321),(95,'2021-12-30','2022-12-30',10,6,1,4643954),(96,'2022-02-18',NULL,4,8,2,8129514),(97,'2022-02-18','2023-02-18',3,8,1,2880247);
/*!40000 ALTER TABLE `vtv` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-24  9:06:46
