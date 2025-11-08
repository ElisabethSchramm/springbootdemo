CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Maier','leslie@Maier.com'),
	(2,'Nadine','Mueller','Nadine@Mueller.com'),
	(3,'Maria','Werder','Maria@Werder.com'),
	(4,'Franziska','Doe','Franziska@Doe.com'),
	(5,'Paul','Baumgarten','Paul@Baumgarten.com');

