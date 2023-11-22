package com.example.spring_acces_base.entity.statistique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.statistique.TirType;
import com.example.spring_acces_base.entity.statistique.repository.TirTypeRepository;

@Service
public class TirTypeServices implements TirTypeRemote{
    @Autowired
    private TirTypeRepository tirtypeRepository;

    @Override
    public TirType save(TirType tirtype){
        return this.tirtypeRepository.save(tirtype);
    }
}
