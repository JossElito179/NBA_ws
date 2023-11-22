package com.example.spring_acces_base.entity.joueur.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.joueur.Joueur;
import com.example.spring_acces_base.entity.joueur.repository.JoueurRepository;

@Service
public class JoueurService implements JoueurRemote{
    @Autowired
    private JoueurRepository joueurRepository;

    @Override
    public List<Joueur> findAll() {
        return this.joueurRepository.findAll();
    }
    
    @Override
    public Joueur saveJoueur(Joueur joueur) {
        return this.joueurRepository.save(joueur);
    }

}
