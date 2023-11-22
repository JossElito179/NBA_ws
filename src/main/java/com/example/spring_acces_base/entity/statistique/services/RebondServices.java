package com.example.spring_acces_base.entity.statistique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.statistique.Rebond;
import com.example.spring_acces_base.entity.statistique.repository.RebondRepository;

@Service
public class RebondServices implements RebondRemote {
    @Autowired
    private RebondRepository rebondRepository;

    @Override
    public Rebond save(Rebond minute){
        return this.rebondRepository.save(minute);
    }
}
