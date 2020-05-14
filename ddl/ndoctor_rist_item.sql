CREATE TABLE `ndoctor_risk_item` (
  `id` int(11) NOT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `positive_id` varchar(255) DEFAULT NULL,
  `score` varchar(255) DEFAULT NULL,
	`create_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
	`effect_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
	KEY `idx_main_device` (`user_id`,`positive_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;