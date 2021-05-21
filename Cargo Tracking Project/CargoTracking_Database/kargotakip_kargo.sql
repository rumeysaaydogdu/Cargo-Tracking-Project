-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: kargotakip
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `kargo`
--

DROP TABLE IF EXISTS `kargo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kargo` (
  `KargoID` int NOT NULL AUTO_INCREMENT,
  `MusteriID` int NOT NULL,
  `KuryeID` int NOT NULL,
  `KargoUcret` int DEFAULT NULL,
  `GelisTarihi` varchar(45) DEFAULT NULL,
  `KargoEbat` varchar(45) DEFAULT NULL,
  `KargoAgirlik` float DEFAULT NULL,
  `SiparisAdres` varchar(100) DEFAULT NULL,
  `OdemeTuru` varchar(45) DEFAULT NULL,
  `TeslimDurumu` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`KargoID`)
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kargo`
--

LOCK TABLES `kargo` WRITE;
/*!40000 ALTER TABLE `kargo` DISABLE KEYS */;
INSERT INTO `kargo` VALUES (51,1,31,151,'2003-04-20 21:00:00','3',5,'beylikduzu/istanbul','online kredi kartı','teslim edildi'),(52,2,32,49,'2010-05-20 21:00:00','1',2,'corlu/tekirdag','online banka kartı','teslim edildi');
/*!40000 ALTER TABLE `kargo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-20  0:32:13
