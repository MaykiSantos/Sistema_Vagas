package com.meusprojetos.sistemasVagasAPI.Models;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Empresa {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private TamanhoEmpresa tamanhoEmpresa;
	private String site;
	@Column(nullable = false)
	private String localizacao;
	@Column(nullable = false, unique = true)
	private String telefone;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String sobre;
	private String logotipo;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dataCriacao;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime dataModificacao;
	private String usuarioModificacao;
	private String usuarioCriacao;
	@ManyToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Setor> setor;
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Vaga> vaga;
	@OneToMany(mappedBy = "empresa" ,fetch = FetchType.LAZY)
	private List<Usuario> usuario;
	
	public Empresa() {}

	public Empresa(TamanhoEmpresa tamanhoEmpresa, String site, String localizacao, String telefone, String email,
			String sobre, String logotipo, String usuarioCriacao, List<Setor> setor) {
		this.tamanhoEmpresa = tamanhoEmpresa;
		this.site = site;
		this.localizacao = localizacao;
		this.telefone = telefone;
		this.email = email;
		this.sobre = sobre;
		this.logotipo = logotipo;
		this.dataCriacao = LocalDateTime.now();
		this.usuarioCriacao = usuarioCriacao;
		this.setor = setor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TamanhoEmpresa getTamanhoEmpresa() {
		return tamanhoEmpresa;
	}

	public void setTamanhoEmpresa(TamanhoEmpresa tamanhoEmpresa) {
		this.tamanhoEmpresa = tamanhoEmpresa;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}

	public String getLogotipo() {
		return logotipo;
	}

	public void setLogotipo(String logotipo) {
		this.logotipo = logotipo;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(LocalDateTime dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public String getUsuarioModificacao() {
		return usuarioModificacao;
	}

	public void setUsuarioModificacao(String usuarioModificacao) {
		this.usuarioModificacao = usuarioModificacao;
	}

	public String getUsuarioCriacao() {
		return usuarioCriacao;
	}

	public void setUsuarioCriacao(String usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}

	public List<Setor> getSetor() {
		return setor;
	}

	public void setSetor(List<Setor> setor) {
		this.setor = setor;
	}

	public List<Vaga> getVaga() {
		return vaga;
	}

	public void setVaga(List<Vaga> vaga) {
		this.vaga = vaga;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
	
}
