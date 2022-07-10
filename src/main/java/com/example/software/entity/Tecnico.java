package com.example.software.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.example.software.enums.Perfil;

@Entity
public class Tecnico extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "tecnico")
	private List<Chamado> chamados = new ArrayList<>();

	public Tecnico() {
		super();
		addPerfis(Perfil.CLIENTE);
	}

	public Tecnico(List<Chamado> chamados) {
		super();
		this.chamados = chamados;
	}

	public List<Chamado> getChamados() {
		return chamados;
	}

	public void setChamados(List<Chamado> chamados) {
		this.chamados = chamados;
	}

	public Tecnico(Integer id, String nome, String cpf, String email, String senha, List<Chamado> chamados) {
		super(id, nome, cpf, email, senha);
		this.chamados = chamados;
		addPerfis(Perfil.CLIENTE);
	}

}
