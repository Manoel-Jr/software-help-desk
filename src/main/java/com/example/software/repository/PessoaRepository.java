package com.example.software.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.software.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	
}
