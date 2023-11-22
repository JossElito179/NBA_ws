package com.example.spring_acces_base.entity.views.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_acces_base.entity.views.Statistique_all;

@Repository
public interface Statistique_allRepository  extends JpaRepository<Statistique_all, Integer> {
    List<Statistique_all> findAll();
}   
