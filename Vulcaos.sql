CREATE TABLE `Vulcao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `formadoPor` varchar(45) DEFAULT NULL,
  `ultimaErupcao` varchar(45) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `coordenadas` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `tipoLava` varchar(45) DEFAULT NULL,
  `descricao` varchar(800) DEFAULT NULL,
  `erupcaoVulcanica` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
