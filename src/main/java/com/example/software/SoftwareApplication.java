package com.example.software;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.software.entity.Chamado;
import com.example.software.entity.Cliente;
import com.example.software.entity.Tecnico;
import com.example.software.enums.Perfil;
import com.example.software.enums.Prioridade;
import com.example.software.enums.Status;
import com.example.software.repository.ChamadoRepository;
import com.example.software.repository.ClienteRepository;
import com.example.software.repository.TecnicoRepository;

@SpringBootApplication
public class SoftwareApplication implements CommandLineRunner{

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SoftwareApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Tecnico t1 = new Tecnico(null,"junior", "656.854.510-40", "junior@hotmail.com", "123456");
		t1.addPerfis(Perfil.ADMIN);
	    Cliente cli = new Cliente(null, "manoel", "138.431.050-90", "manoel1@hotmail.com", "23564");
	    Chamado chamado = new Chamado(null, Prioridade.BAIXA, Status.ANDAMENTO, "chamado 01", "Chamado teste", t1, cli);
	    
	    tecnicoRepository.saveAll(Arrays.asList(t1));
	    clienteRepository.saveAll(Arrays.asList(cli));
	    chamadoRepository.saveAll(Arrays.asList(chamado));
	}

}
