package com.meusprojetos.sistemasVagasAPI.Models;

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

	public Usuario() {}

	public Usuario(String nome, String email, String senha, Empresa empresa, List<Perfil> perfil) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = new Date();
		this.empresa = empresa;
		this.perfil = perfil;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Boolean getEmailValidado() {
		return emailValidado;
	}

	public void setEmailValidado(Boolean emailValidado) {
		this.emailValidado = emailValidado;
	}

	public Boolean getDesabilita() {
		return desabilita;
	}

	public void setDesabilita(Boolean desabilita) {
		this.desabilita = desabilita;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Perfil> getPerfil() {
		return perfil;
	}

	public void setPerfil(List<Perfil> perfil) {
		this.perfil = perfil;
	}
	

}
