CREATE DATABASE IF NOT EXISTS `contactdictionary`;

CREATE TABLE IF NOT EXISTS contacts (
    contact_id INT AUTO_INCREMENT NOT NULL,
    contact_phone VARCHAR(45),
    contact_name VARCHAR(45),
    contact_email VARCHAR(45),
    contact_alias VARCHAR(45)
);

