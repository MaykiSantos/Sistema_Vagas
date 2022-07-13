package com.meusprojetos.sistemasVagasAPI.Models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Beneficio {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String descricao;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Vaga> vaga;
	
	public Beneficio() {}
	
	public Beneficio(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Vaga> getVaga() {
		return vaga;
	}

	public void setVaga(List<Vaga> vaga) {
		this.vaga = vaga;
	}
	
	
}
