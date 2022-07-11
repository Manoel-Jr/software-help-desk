package com.example.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.software.entity.Chamado;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
