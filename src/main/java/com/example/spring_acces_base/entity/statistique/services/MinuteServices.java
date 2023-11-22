package com.example.spring_acces_base.entity.statistique.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.statistique.Minute;
import com.example.spring_acces_base.entity.statistique.repository.MinuteRepository;

@Service
public class MinuteServices implements MinuteRemote {
    @Autowired
    private MinuteRepository minuteRepository;

    @Override
    public Minute save(Minute minute){
        return this.minuteRepository.save(minute);
    }
}
