package com.example.spring_acces_base.entity.statistique;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "mpm")
public class Minute {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_mpm_seq")
    @SequenceGenerator(name = "s_mpm_seq", sequenceName = "s_mpm", allocationSize = 1)
    @Column(name = "id")
    int id;

    @Column(name = "entree")
    Time entree;

    @Column(name = "sortie")
    Time sortie;

    @Column(name = "id_stat")
    int id_stat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time getEntree() {
        return entree;
    }

    public void setEntree(Time entree) {
        this.entree = entree;
    }

    public Time getSortie() {
        return sortie;
    }

    public void setSortie(Time sortie) {
        this.sortie = sortie;
    }

    public int getId_stat() {
        return id_stat;
    }

    public void setId_stat(int id_stat) {
        this.id_stat = id_stat;
    }

    
}
