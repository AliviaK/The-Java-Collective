-- MySQL dump 10.13  Distrib 8.0.27, for Linux (x86_64)
--
-- Host: localhost    Database: java_collective
-- ------------------------------------------------------
-- Server version	8.0.27-0ubuntu0.21.10.1

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
-- Table structure for table `income_data`
--

DROP TABLE IF EXISTS `income_data`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `income_data` (
  `id` int NOT NULL AUTO_INCREMENT,
  `year` int NOT NULL,
  `zip_code` int NOT NULL,
  `estimate_households_total` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_less_than_10000` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_10000_to_14999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_15000_to_24999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_25000_to_34999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_35000_to_49999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_50000_to_74999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_75000_to_99999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_100000_to_149999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_150000_to_199999` decimal(10,2) DEFAULT NULL,
  `estimate_households_total_200000_or_more` decimal(10,2) DEFAULT NULL,
  `estimate_households_median_income_dollars` decimal(10,2) DEFAULT NULL,
  `estimate_households_mean_income_dollars` decimal(10,2) DEFAULT NULL,
  `estimate_households_percent_allocated_household_income` decimal(10,2) DEFAULT NULL,
  `estimate_families_total` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_less_than_10000` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_10000_to_14999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_15000_to_24999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_25000_to_34999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_35000_to_49999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_50000_to_74999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_75000_to_99999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_100000_to_149999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_150000_to_199999` decimal(10,2) DEFAULT NULL,
  `estimate_families_total_200000_or_more` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=164544 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-12  0:59:16
