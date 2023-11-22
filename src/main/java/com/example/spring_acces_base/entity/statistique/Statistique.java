package com.example.spring_acces_base.entity.statistique;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "stat")
public class Statistique {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idstat_seq")
    @SequenceGenerator(name = "s_idstat_seq", sequenceName = "s_idstat", allocationSize = 1)
    @Column(name = "id")
    int id;

    @Column(name = "id_match")
    int id_match;

    @Column(name = "id_joueur")
    int id_joueur;
    
    public Statistique() {
    }
    public Statistique(int id_match, int id_joueur) {
        this.id_match = id_match;
        this.id_joueur = id_joueur;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_match() {
        return id_match;
    }
    public void setId_match(int id_match) {
        this.id_match = id_match;
    }
    public int getId_joueur() {
        return id_joueur;
    }
    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }
}
