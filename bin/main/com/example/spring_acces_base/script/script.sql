Create table saison (
    id INTEGER DEFAULT nextval('s_idsaison') PRIMARY KEY,
    nom varchar,
    debut date,
    fin date
);

CREATE table equipe (
    id INTEGER DEFAULT nextval('s_idequipe') PRIMARY KEY,
    nom varchar
);

CREATE table joueur (
    id INTEGER DEFAULT nextval('s_idjoueur') PRIMARY KEY,
    nom varchar,
    id_equipe int,
    FOREIGN KEY (id_equipe) REFERENCES equipe(id)
);

CREATE table match (
    id INTEGER DEFAULT nextval('s_idmatch') PRIMARY KEY,
    id_saison int,
    id_equipe1 int,
    id_equipe2 int,
    date_debut timestamp,
    date_fin timestamp,
    FOREIGN KEY (id_saison) REFERENCES saison(id),
    FOREIGN KEY (id_equipe1) REFERENCES equipe(id),
    FOREIGN KEY (id_equipe2) REFERENCES equipe(id)
);

CREATE table stat (
    id INTEGER DEFAULT nextval('s_idstat') PRIMARY KEY,
    id_match int,
    id_joueur int,
    FOREIGN KEY (id_match) REFERENCES match(id),
    FOREIGN KEY (id_joueur) REFERENCES joueur(id)
);

CREATE table rebond(
    id INTEGER DEFAULT nextval('s_idrebond') PRIMARY KEY,
    nombre double precision,
    id_stat int,
    FOREIGN KEY (id_stat) REFERENCES stat(id)
);

CREATE TABLE type_tir(
    id INTEGER DEFAULT nextval('s_idtypetir') PRIMARY KEY,
    nom varchar,
    points double precision
);

CREATE table tir (
    id INTEGER DEFAULT nextval('s_idtir') PRIMARY KEY,
    etat int,
    id_type_tir int,
    id_stat int,
    FOREIGN KEY (id_type_tir) REFERENCES type_tir(id),
    FOREIGN KEY (id_stat) REFERENCES stat(id)
);

CREATE table passe_d (
    id INTEGER DEFAULT nextval('s_idpassed') PRIMARY KEY,
    nombre double precision,
    id_stat int,
    FOREIGN KEY (id_stat) REFERENCES stat(id)
);

CREATE TABLE mpm (
    id INTEGER DEFAULT nextval('s_mpm') PRIMARY KEY,
    entree time,
    sortie time,
    id_stat int,
    FOREIGN KEY (id_stat) REFERENCES stat(id)
);