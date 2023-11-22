package com.example.spring_acces_base.entity.match;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "match")
public class Match {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idmatch_seq")
    @SequenceGenerator(name = "s_idmatch_seq", sequenceName = "s_idmatch", allocationSize = 1)
    int idMatch;

    @Column(name = "id_saison")
    int idsaison;

    @Column(name = "date_debut")
    Timestamp date_debut;

    @Column(name = "date_fin")
    Timestamp date_fin;

    @Column(name = "id_equipe1")
    int idequipea;

    @Column(name = "id_equipe2")
    int idequipeb;

    
    public Match(int idsaison, Timestamp date_debut, Timestamp date_fin, int idequipea, int idequipeb) {
        this.idsaison = idsaison;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.idequipea = idequipea;
        this.idequipeb = idequipeb;
    }


    public Match() {}


    public int getIdMatch() {
        return idMatch;
    }


    public void setIdMatch(int idMatch) {
        this.idMatch = idMatch;
    }


    public int getIdsaison() {
        return idsaison;
    }


    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }

    public int getIdequipea() {
        return idequipea;
    }


    public void setIdequipea(int idequipea) {
        this.idequipea = idequipea;
    }


    public int getIdequipeb() {
        return idequipeb;
    }


    public void setIdequipeb(int idequipeb) {
        this.idequipeb = idequipeb;
    }


    public Timestamp getDate_debut() {
        return date_debut;
    }


    public void setDate_debut(Timestamp date_debut) {
        this.date_debut = date_debut;
    }


    public Timestamp getDate_fin() {
        return date_fin;
    }


    public void setDate_fin(Timestamp date_fin) {
        this.date_fin = date_fin;
    }

}
