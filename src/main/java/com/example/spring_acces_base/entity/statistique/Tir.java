package com.example.spring_acces_base.entity.statistique;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tir")
public class Tir {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idtir_seq")
    @SequenceGenerator(name = "s_idtir_seq", sequenceName = "s_idtir", allocationSize = 1)
    @Column(name = "id")
    int id;

    @Column(name = "etat")
    int etat;

    @Column(name = "id_type_tir")
    int id_type_tir;

    @Column(name = "id_stat")
    int id_stat;

    public Tir() {
    }

    public Tir(int etat, int id_type_tir, int id_stat) {
        this.etat = etat;
        this.id_type_tir = id_type_tir;
        this.id_stat = id_stat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public int getId_type_tir() {
        return id_type_tir;
    }

    public void setId_type_tir(int id_type_tir) {
        this.id_type_tir = id_type_tir;
    }

    public int getId_stat() {
        return id_stat;
    }

    public void setId_stat(int id_stat) {
        this.id_stat = id_stat;
    }
}
