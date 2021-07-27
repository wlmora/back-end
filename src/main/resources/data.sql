DROP TABLE IF EXISTS client;

CREATE TABLE client (
                              id INT AUTO_INCREMENT  PRIMARY KEY,
                              identificacion VARCHAR(250) NOT NULL,
                              razon_social VARCHAR(250) NOT NULL,
                              contacto VARCHAR(250) NOT NULL,
                              region VARCHAR(250) NOT NULL,
                              tipo_cliente VARCHAR(250) DEFAULT NULL
);

INSERT INTO client (identificacion, razon_social, contacto, region, tipo_cliente) VALUES
('8080398783', 'ExxonMobil', '+57 93939393', 'AMERICAS', 'SUPPLIER'),
('9345765445', 'McKesson', '+56 3839393', 'ASIA', 'COMMERCIAL'),
('8565345674', 'Apple', '+25 45678998', 'EUROPE','MARKETING');