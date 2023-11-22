package com.example.spring_acces_base.entity.statistique;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_tire")
public class TirType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idtypetir_seq")
    @SequenceGenerator(name = "s_idtypetir_seq", sequenceName = "s_idtypetir", allocationSize = 1)
    @Column(name = "id")
    int id;

    @Column(name = "nom")
    String nom;

    @Column(name = "points")
    int points;

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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
