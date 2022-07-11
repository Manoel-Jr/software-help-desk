package com.example.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.software.entity.Tecnico;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico,Integer>{

}
