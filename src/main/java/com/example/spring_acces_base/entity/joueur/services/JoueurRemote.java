package com.example.spring_acces_base.entity.joueur.services;

import java.util.List;

import com.example.spring_acces_base.entity.joueur.Joueur;

public interface JoueurRemote {
    public List<Joueur> findAll();
    public Joueur saveJoueur(Joueur joueur);
}
