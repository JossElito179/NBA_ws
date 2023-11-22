-- Saison Table
INSERT INTO saison (nom, debut, fin) VALUES
    ('Saison 1', '2023-01-01', '2023-12-31'),
    ('Saison 2', '2024-01-01', '2024-12-31');

-- Equipe Table
INSERT INTO equipe (nom) VALUES
    ('Equipe A'),
    ('Equipe B');

-- Joueur Table
INSERT INTO joueur (nom, id_equipe) VALUES
    ('Joueur 1', 1),
    ('Joueur 2', 1),
    ('Joueur 3', 2),
    ('Joueur 4', 2);

-- Match Table
INSERT INTO match (id_saison, id_equipe1, id_equipe2, date_debut, date_fin) VALUES
    (1, 1, 2, '2023-02-01 18:00:00', '2023-02-01 20:00:00'),
    (1, 2, 1, '2023-02-15 19:00:00', '2023-02-15 21:00:00');

-- Stat Table
INSERT INTO stat (id_match, id_joueur) VALUES
    (1, 1),
    (1, 2),
    (2, 3),
    (2, 4);

INSERT INTO stat (id_match, id_joueur) VALUES
(1, 4);

-- Rebond Table
INSERT INTO rebond (nombre, id_stat) VALUES
    (5, 1),
    (3, 2),
    (4, 3),
    (6, 4);

INSERT INTO rebond (nombre, id_stat) VALUES
(5, 5);

-- Type_tir Table
INSERT INTO type_tir (nom, points) VALUES
    ('Tir à 2 points', 2),
    ('Tir à 3 points', 3),
    ('LF', 1);

-- Tir Table
INSERT INTO tir (etat, id_type_tir, id_stat) VALUES
    (1, 1, 1),
    (1, 2, 2),
    (1, 1, 3),
    (1, 2, 4);

INSERT INTO tir (etat, id_type_tir, id_stat) VALUES
(0, 2, 4);

-- Passe_d Table
INSERT INTO passe_d (nombre, id_stat) VALUES
    (10, 1),
    (8, 2),
    (12, 3),
    (9, 4);

-- Mpm Table
INSERT INTO mpm (entree, sortie, id_stat) VALUES
    ('18:15:00', '19:30:00', 1),
    ('19:30:00', '20:45:00', 2),
    ('18:45:00', '20:00:00', 3),
    ('19:00:00', '20:15:00', 4);