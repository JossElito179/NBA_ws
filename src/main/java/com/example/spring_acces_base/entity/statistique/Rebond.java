package com.example.spring_acces_base.entity.statistique;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "rebond")
public class Rebond {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_idrebond_seq")
    @SequenceGenerator(name = "s_idrebond_seq", sequenceName = "s_idrebond", allocationSize = 1)
    @Column(name = "id")
    int id;

    @Column(name = "nombre")
    int nombre;

    @Column(name = "id_stat")
    int id_stat;

    public Rebond() {
    }

    public Rebond(int nombre, int id_stat) {
        this.nombre = nombre;
        this.id_stat = id_stat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getId_stat() {
        return id_stat;
    }

    public void setId_stat(int id_stat) {
        this.id_stat = id_stat;
    }
}
