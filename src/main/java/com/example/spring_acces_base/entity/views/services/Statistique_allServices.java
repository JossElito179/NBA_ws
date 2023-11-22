package com.example.spring_acces_base.entity.views.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.views.Statistique_all;
import com.example.spring_acces_base.entity.views.repository.Statistique_allRepository;

@Service
public class Statistique_allServices implements Statistique_allRemote {
    @Autowired
    private Statistique_allRepository statisitique_allRepository;

    @Override
    public List<Statistique_all> findAll() {
        return statisitique_allRepository.findAll();
    }
}
