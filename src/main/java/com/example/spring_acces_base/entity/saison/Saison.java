package com.example.spring_acces_base.entity.saison;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "saison")
public class Saison {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idsaison_seq")
    @SequenceGenerator(name = "s_idsaison_seq", sequenceName = "s_idsaison", allocationSize = 1)
    @Column(name = "id")
    int idsaison;

    @Column(name = "nom")
    String nom;

    @Column(name = "fin")
    Date date_fin;

    @Column(name = "debut")
    Date date_debut;

    public Saison() {
    }

    public Saison(String nom, Date date_fin, Date date_debut) {
        this.nom = nom;
        this.date_fin = date_fin;
        this.date_debut = date_debut;
    }

    public int getIdsaison() {
        return idsaison;
    }

    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }
    
    
}
