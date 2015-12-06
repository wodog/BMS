-- MySQL dump 10.13  Distrib 5.5.28, for Win32 (x86)
--
-- Host: localhost    Database: bms
-- ------------------------------------------------------
-- Server version	5.5.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bms_book`
--

DROP TABLE IF EXISTS `bms_book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bms_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `effect_date` datetime DEFAULT NULL,
  `expired_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bms_book`
--

LOCK TABLES `bms_book` WRITE;
/*!40000 ALTER TABLE `bms_book` DISABLE KEYS */;
/*!40000 ALTER TABLE `bms_book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bms_user`
--

DROP TABLE IF EXISTS `bms_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bms_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `nickname` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `effect_date` datetime DEFAULT NULL,
  `expired_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bms_user`
--

LOCK TABLES `bms_user` WRITE;
/*!40000 ALTER TABLE `bms_user` DISABLE KEYS */;
INSERT INTO `bms_user` VALUES (23,'asdsa','','','2015-09-11 16:25:07',NULL,NULL),(27,'asdsad','','xsadasda','2015-09-11 17:30:03','2015-09-12 00:29:59','2015-09-12 00:30:01'),(29,'asd','','','2015-09-11 17:36:12',NULL,NULL),(34,'ff','','','2015-09-12 00:00:12',NULL,NULL),(36,'aa','','','2015-09-12 00:31:32','2015-09-12 00:53:32','2015-09-12 00:53:36'),(37,'aaaaaaa','','aaa','2015-09-12 00:38:32','2015-09-12 00:29:59','2015-09-12 00:30:01'),(38,'aaaaaaa','','aaaaaa','2015-09-12 00:38:48','2015-09-12 00:29:59','2015-09-12 00:30:01'),(39,'aa','','','2015-09-12 00:41:10',NULL,NULL),(40,'bb','','','2015-09-12 00:41:16','2015-09-12 00:00:00','2015-09-12 00:00:00'),(41,'asdad','','','2015-09-12 01:05:13','2015-09-12 00:53:32','2015-09-12 00:53:36'),(42,'asdad','','asdasdsa','2015-09-12 01:05:17','2015-09-12 00:53:32','2015-09-12 00:53:36'),(43,'阿斯dad','','','2015-09-12 01:27:06',NULL,NULL),(44,'阿斯dad地方','sdf','dsad','2015-09-12 01:27:17','2015-09-13 00:00:00','2015-09-13 00:00:00'),(45,'asd','sadas','撒打算的','2015-09-12 01:32:14','2015-09-12 00:00:00','2015-09-12 00:00:00'),(46,'asd','sadas','撒打算的','2015-09-12 01:32:21','2015-09-12 00:00:00','2015-09-12 00:00:00');
/*!40000 ALTER TABLE `bms_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-12-06 16:54:41
