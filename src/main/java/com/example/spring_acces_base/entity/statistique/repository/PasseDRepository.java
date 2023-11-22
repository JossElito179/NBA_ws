package com.example.spring_acces_base.entity.statistique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.statistique.PasseD;

@Repository
public interface PasseDRepository extends JpaRepository<PasseD, Integer>{
    
}
