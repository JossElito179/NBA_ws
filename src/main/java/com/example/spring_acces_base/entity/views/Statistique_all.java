package com.example.spring_acces_base.entity.views;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "v_stat_all")
public class Statistique_all {
    @Id
    @Column(name = "id")
    int id;

    @Column(name = "nom")
    String nom;

    @Column(name = "id_equipe")
    int id_equipe;

    @Column(name = "nom_equipe")
    String nom_equipe;

    @Column(name = "mj" )
    int mj;

    @Column(name = "ppm")
    double ppm;

    @Column(name = "rpm")
    double rpm;

    @Column(name = "pdpm")
    double pdpm;

    @Column(name = "mpm")
    Time mpm;

    @Column(name = "fg")
    double fg;

    public Statistique_all() {
    }
    public Statistique_all(int id, String nom, int id_equipe, String nom_equipe, int mj, double ppm, double rpm, double pdpm, Time mpm, double fg) {
        this.id = id;
        this.nom = nom;
        this.id_equipe = id_equipe;
        this.nom_equipe = nom_equipe;
        this.mj = mj;
        this.ppm = ppm;
        this.rpm = rpm;
        this.pdpm = pdpm;
        this.mpm = mpm;
        this.fg = fg;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getId_equipe() {
        return id_equipe;
    }
    public void setId_equipe(int id_equipe) {
        this.id_equipe = id_equipe;
    }
    public String getNom_equipe() {
        return nom_equipe;
    }
    public void setNom_equipe(String nom_equipe) {
        this.nom_equipe = nom_equipe;
    }
    public int getMj() {
        return mj;
    }
    public void setMj(int mj) {
        this.mj = mj;
    }
    public double getPpm() {
        return ppm;
    }
    public void setPpm(double ppm) {
        this.ppm = ppm;
    }
    public double getRpm() {
        return rpm;
    }
    public void setRpm(double rpm) {
        this.rpm = rpm;
    }
    public double getPdpm() {
        return pdpm;
    }
    public void setPdpm(double pdpm) {
        this.pdpm = pdpm;
    }
    public Time getMpm() {
        return mpm;
    }
    public void setMpm(Time mpm) {
        this.mpm = mpm;
    }
    public double getFg() {
        return fg;
    }
    public void setFg(double fg) {
        this.fg = fg;
    }
}
