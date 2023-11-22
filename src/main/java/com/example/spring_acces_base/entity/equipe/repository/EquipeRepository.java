package com.example.spring_acces_base.entity.equipe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.equipe.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer> {
    List<Equipe> findAll();

    //nouvelle methode pour sauvegarder 🤣
}
