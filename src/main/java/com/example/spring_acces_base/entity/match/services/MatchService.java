package com.example.spring_acces_base.entity.match.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_acces_base.entity.match.Match;
import com.example.spring_acces_base.entity.match.repository.MatchRepository;

@Service
public class MatchService implements MatchRemote {
    @Autowired
    private MatchRepository matchRepository;


    @Override
    public List<Match> findAll(){
        return matchRepository.findAll();
    }

    @Override
    public Match saveMatch(Match match){
        return matchRepository.save(match);
    }
    
}
