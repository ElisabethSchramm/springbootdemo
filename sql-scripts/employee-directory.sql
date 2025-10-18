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
	(1,'Max','Müller','Max@firma.com'),
	(2,'Martin','Maier','Martin@firma.com'),
	(3,'Maria','Meyer','Maria@firma.com'),
	(4,'Maximilian','Merkel','Maximilian@firma.com'),
	(5,'Marianne','Möller','Marianne@firma.com');

