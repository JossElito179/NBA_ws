package com.example.spring_acces_base.entity.statistique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.statistique.Statistique;
import com.example.spring_acces_base.entity.statistique.repository.StatistiqueRepository;

@Service
public class StatistiqueServices implements StatistiqueRemote {
    @Autowired
    private StatistiqueRepository statistiqueRepository;

    @Override
    public Statistique save(Statistique statistique){
        return this.statistiqueRepository.save(statistique);
    }
}
