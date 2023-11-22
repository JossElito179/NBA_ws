package com.example.spring_acces_base.entity.joueur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idjoueur_seq")
    @SequenceGenerator(name = "s_idjoueur_seq", sequenceName = "s_idjoueur", allocationSize = 1)
    @Column(name = "id")
    int idjoueur;

    @Column(name = "nom")
    String nom;

    @Column(name = "id_equipe")
    int idequipe;

    public Joueur() {
    }

    public Joueur(String nom, int idequipe) {
        this.nom = nom;
        this.idequipe = idequipe;
    }

    public int getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
