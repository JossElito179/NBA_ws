package com.example.spring_acces_base.entity.statistique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.statistique.Tir;
import com.example.spring_acces_base.entity.statistique.repository.TirRepository;

@Service
public class TirServices implements TirRemote {
    @Autowired
    private TirRepository tirRepository;

    @Override
    public Tir save(Tir tir){
        return this.tirRepository.save(tir);
    }
}
