package com.meusprojetos.sistemasVagasAPI.Models.Entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 255)
	private String nome;
	@Column(nullable = false, length = 255, unique = true)
	private String email;
	@Column(nullable = false, length = 500)
	private String senha;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataModificacao;
	private Boolean emailValidado = false;
	private Boolean desabilita = false;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Empresa empresa;
	@ManyToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
	private List<Perfil> perfil;

	public Usuario(String nome, String email, String senha, Empresa empresa, List<Perfil> perfil) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = new Date();
		this.empresa = empresa;
		this.perfil = perfil;
	}

}
