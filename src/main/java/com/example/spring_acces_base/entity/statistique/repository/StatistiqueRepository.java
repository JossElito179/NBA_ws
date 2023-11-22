package com.example.spring_acces_base.entity.statistique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.statistique.Statistique;

@Repository
public interface StatistiqueRepository extends JpaRepository<Statistique, Integer> {
    
}
