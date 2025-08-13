CREATE TABLE sigh (
    location VARCHAR(50),
    date_and_time TIMESTAMP,
    color VARCHAR(20),
    shape VARCHAR(20),
    quantity_of_objects INT
);

-- Inserindo o primeiro registro de exemplo.
INSERT INTO sigh (location, date_and_time, color, shape, quantity_of_objects)
VALUES ('São Paulo', '2024-08-10 22:30:00', 'Verde', 'Esfera', 3);

-- Inserindo o segundo registro de exemplo.
INSERT INTO sigh (location, date_and_time, color, shape, quantity_of_objects)
VALUES ('Rio de Janeiro', '2024-08-11 01:15:00', 'Prata', 'Disco', 1);

