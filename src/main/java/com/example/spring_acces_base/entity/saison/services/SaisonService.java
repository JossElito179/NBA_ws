package com.example.spring_acces_base.entity.saison.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.saison.Saison;
import com.example.spring_acces_base.entity.saison.repository.SaisonRepository;

@Service
public class SaisonService implements SaisonRemote {
    @Autowired
    private SaisonRepository saisonRepository;

    @Override
    public List<Saison> findAll() {
        return saisonRepository.findAll();
    }

    @Override
    public Saison saveSaisons(Saison saison) {
        return saisonRepository.save(saison);
    }
    
}
