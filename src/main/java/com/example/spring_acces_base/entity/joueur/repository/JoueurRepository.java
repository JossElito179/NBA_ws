package com.example.spring_acces_base.entity.joueur.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.joueur.Joueur;

@Repository
public interface JoueurRepository extends CrudRepository<Joueur, Integer> {
    List<Joueur> findAll();
}
