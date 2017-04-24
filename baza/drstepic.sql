/*
SQLyog Community v12.4.1 (64 bit)
MySQL - 5.7.14 : Database - drstepic
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`drstepic` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_croatian_ci */;

USE `drstepic`;

/*Table structure for table `kartonipacijenata` */

DROP TABLE IF EXISTS `kartonipacijenata`;

CREATE TABLE `kartonipacijenata` (
  `JMBG` varchar(13) COLLATE utf8_croatian_ci NOT NULL,
  `LBO` varchar(11) COLLATE utf8_croatian_ci NOT NULL,
  `Ime` varchar(30) COLLATE utf8_croatian_ci NOT NULL,
  `Prezime` varchar(30) COLLATE utf8_croatian_ci NOT NULL,
  `Pol` varchar(6) COLLATE utf8_croatian_ci DEFAULT NULL,
  `DatumRođenja` datetime DEFAULT NULL,
  `Adresa` varchar(30) COLLATE utf8_croatian_ci DEFAULT NULL,
  `KrvnaGrupa` varchar(3) COLLATE utf8_croatian_ci DEFAULT NULL,
  PRIMARY KEY (`JMBG`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `kartonipacijenata` */

/*Table structure for table `pregled` */

DROP TABLE IF EXISTS `pregled`;

CREATE TABLE `pregled` (
  `BrojPregleda` int(255) NOT NULL AUTO_INCREMENT,
  `DatumPregleda` date DEFAULT NULL,
  `VremePregleda` time DEFAULT NULL,
  `KrvniPritisak` varchar(3) COLLATE utf8_croatian_ci DEFAULT NULL,
  `Puls` int(11) DEFAULT NULL,
  `Anamneza` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `JMBG` varchar(13) COLLATE utf8_croatian_ci NOT NULL,
  PRIMARY KEY (`BrojPregleda`),
  KEY `KartonPacijenta_fk` (`JMBG`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `pregled` */

/*Table structure for table `tipusluge` */

DROP TABLE IF EXISTS `tipusluge`;

CREATE TABLE `tipusluge` (
  `ŠifraTipaUsluge` int(11) NOT NULL AUTO_INCREMENT,
  `NazivTipaUsluge` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  PRIMARY KEY (`ŠifraTipaUsluge`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `tipusluge` */

insert  into `tipusluge`(`ŠifraTipaUsluge`,`NazivTipaUsluge`) values 
(1,'Analize krvi'),
(2,'Analize urina i fecesa'),
(3,'Hormoni i tumorski markeri'),
(4,'Imunologija'),
(5,'Virusološka serologija'),
(6,'Bakteriološka i parazitološka serologija'),
(7,'Mikrobiologija'),
(8,'Citogenetika'),
(9,'Patohistologija'),
(10,'Ostale usluge laboratorije');

/*Table structure for table `usluga` */

DROP TABLE IF EXISTS `usluga`;

CREATE TABLE `usluga` (
  `ŠifraUsluge` int(11) NOT NULL,
  `NazivUsluge` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `OpisUsluge` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `CenaUsluge` double DEFAULT '0',
  `ŠifraTipaUsluge` int(11) DEFAULT NULL,
  PRIMARY KEY (`ŠifraUsluge`),
  KEY `ŠifraTipaUsluge_fk` (`ŠifraTipaUsluge`),
  CONSTRAINT `ŠifraTipaUsluge_fk` FOREIGN KEY (`ŠifraTipaUsluge`) REFERENCES `tipusluge` (`ŠifraTipaUsluge`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `usluga` */

insert  into `usluga`(`ŠifraUsluge`,`NazivUsluge`,`OpisUsluge`,`CenaUsluge`,`ŠifraTipaUsluge`) values 
(1,'Jako sam kul','Opis',2500,4),
(2,'Sada imam kulj naziv','Opis',1234,4),
(3,'addas','dsa',21212,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
