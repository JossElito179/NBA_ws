package com.example.spring_acces_base.entity.equipe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.equipe.Equipe;
import com.example.spring_acces_base.entity.equipe.repository.EquipeRepository;

import java.util.List;

@Service
public class EquipeServices implements EquipeRemote{
    @Autowired
    private EquipeRepository equipeRepository;

    @Override
    public List<Equipe> findAll() {
       return this.equipeRepository.findAll();
    }

    @Override
    public Equipe savEquipes(Equipe equipe) {
       return this.equipeRepository.save(equipe);
    }
}
