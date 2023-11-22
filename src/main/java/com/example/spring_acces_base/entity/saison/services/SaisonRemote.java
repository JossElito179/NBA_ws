package com.example.spring_acces_base.entity.saison.services;

import java.util.List;

import com.example.spring_acces_base.entity.saison.Saison;

public interface SaisonRemote {
    public List<Saison> findAll();
    public Saison saveSaisons(Saison saison);
}
