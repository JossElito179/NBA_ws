package com.example.spring_acces_base.entity.match.services;

import java.util.List;

import com.example.spring_acces_base.entity.match.Match;

public interface MatchRemote {
    public List<Match> findAll();
    public Match saveMatch(Match match);
}
