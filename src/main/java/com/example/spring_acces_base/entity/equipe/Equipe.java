package com.example.spring_acces_base.entity.equipe;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipe")
public class Equipe {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idequipe_seq")
    @SequenceGenerator(name = "s_idequipe_seq", sequenceName = "s_idequipe", allocationSize = 1)
    int idequipe;

    @Column(name = "nom")
    String nom;

    public Equipe() {
    }

    public Equipe(String nom) {
        this.nom = nom;
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
