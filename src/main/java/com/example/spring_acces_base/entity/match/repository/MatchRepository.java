package com.example.spring_acces_base.entity.match.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.match.Match;


@Repository
public interface MatchRepository  extends CrudRepository<Match, Integer>{
    List<Match> findAll();
    //nouvelle methode
}
