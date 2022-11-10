CREATE TABLE IF NOT EXISTS asistente(
id SERIAL,
name VARCHAR(50) NOT NULL,
mail VARCHAR(50),
institution VARCHAR(50),
position VARCHAR(50),
PRIMARY KEY(id),
UNIQUE(mail)
);