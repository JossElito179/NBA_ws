package com.example.spring_acces_base.entity.saison.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.saison.Saison;

@Repository
public interface SaisonRepository  extends CrudRepository<Saison, Integer>{
    List<Saison> findAll();
}
