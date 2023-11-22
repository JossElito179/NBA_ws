package com.example.spring_acces_base.entity.statistique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.statistique.PasseD;
import com.example.spring_acces_base.entity.statistique.repository.PasseDRepository;

@Service
public class PasseDServices implements PasseDRemote {
    @Autowired
    private PasseDRepository passeDRepository;

    @Override
    public PasseD save(PasseD passed){
        return this.passeDRepository.save(passed);
    }
}
