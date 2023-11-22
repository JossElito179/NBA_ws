package com.example.spring_acces_base.entity.equipe.services;

import java.util.List;

import com.example.spring_acces_base.entity.equipe.Equipe;

public interface EquipeRemote {
     public List<Equipe> findAll();
     public Equipe savEquipes(Equipe equipe);
}
