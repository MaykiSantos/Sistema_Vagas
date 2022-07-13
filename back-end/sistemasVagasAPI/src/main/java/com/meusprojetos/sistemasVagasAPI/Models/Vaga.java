package com.meusprojetos.sistemasVagasAPI.Models;

import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vaga {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	@Enumerated(EnumType.STRING)
	private TipoTrabalho tipoTrabalho;
	@Enumerated(EnumType.STRING)
	private TipoContrato tipoContrato;
	@Temporal(TemporalType.DATE)
	private Date dataInicio;
	@Temporal(TemporalType.DATE)
	private Date dataFimCandidatura;
	@Column(scale = 2)
	private BigDecimal salario;
	@Column(nullable = false)
	private Integer cargaHoraria;
	@Column(nullable = false)
	private String descricao;
	private String responsabilidades;
	private String requisitos;
	private String outros;
	@Column(nullable = false)
	private String linkCandidatura;
	@Enumerated(EnumType.STRING)
	private StatusVaga status;
	@Column(nullable = false)
	private Boolean validado = false;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataModificacao;
	@Column(nullable = false)
	private Boolean desabilita = false;
	@Column(nullable = false)
	private String nomeUsuarioCriacao;
	private String nomeUsuarioModificacao;
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Empresa empresa;
	@ManyToMany(mappedBy = "vaga", fetch = FetchType.LAZY)
	private List<Beneficio> beneficio;
	@ManyToMany(mappedBy = "vaga", fetch = FetchType.LAZY)
	private List<Curso> curso;

	public Vaga() {}

	public Vaga(String titulo, TipoTrabalho tipoTrabalho, TipoContrato tipoContrato, Date dataInicio,
			Date dataFimCandidatura, BigDecimal salario, Integer cargaHoraria, String descricao,
			String responsabilidades, String requisitos, String outros, String linkCandidatura,
			String nomeUsuarioCriacao, Empresa empresa, List<Beneficio> beneficio, List<Curso> curso) {
		this.titulo = titulo;
		this.tipoTrabalho = tipoTrabalho;
		this.tipoContrato = tipoContrato;
		this.dataInicio = dataInicio;
		this.dataFimCandidatura = dataFimCandidatura;
		this.salario = salario;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
		this.responsabilidades = responsabilidades;
		this.requisitos = requisitos;
		this.outros = outros;
		this.linkCandidatura = linkCandidatura;
		this.dataCriacao = new Date();
		this.nomeUsuarioCriacao = nomeUsuarioCriacao;
		this.empresa = empresa;
		this.beneficio = beneficio;
		this.curso = curso;
		this.status = StatusVaga.EM_ANALISE;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public TipoTrabalho getTipoTrabalho() {
		return tipoTrabalho;
	}

	public void setTipoTrabalho(TipoTrabalho tipoTrabalho) {
		this.tipoTrabalho = tipoTrabalho;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFimCandidatura() {
		return dataFimCandidatura;
	}

	public void setDataFimCandidatura(Date dataFimCandidatura) {
		this.dataFimCandidatura = dataFimCandidatura;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResponsabilidades() {
		return responsabilidades;
	}

	public void setResponsabilidades(String responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}

	public String getLinkCandidatura() {
		return linkCandidatura;
	}

	public void setLinkCandidatura(String linkCandidatura) {
		this.linkCandidatura = linkCandidatura;
	}

	public StatusVaga getStatus() {
		return status;
	}

	public void setStatus(StatusVaga status) {
		this.status = status;
	}

	public Boolean getValidado() {
		return validado;
	}

	public void setValidado(Boolean validado) {
		this.validado = validado;
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

	public Boolean getDesabilita() {
		return desabilita;
	}

	public void setDesabilita(Boolean desabilita) {
		this.desabilita = desabilita;
	}

	public String getNomeUsuarioCriacao() {
		return nomeUsuarioCriacao;
	}

	public void setNomeUsuarioCriacao(String nomeUsuarioCriacao) {
		this.nomeUsuarioCriacao = nomeUsuarioCriacao;
	}

	public String getNomeUsuarioModificacao() {
		return nomeUsuarioModificacao;
	}

	public void setNomeUsuarioModificacao(String nomeUsuarioModificacao) {
		this.nomeUsuarioModificacao = nomeUsuarioModificacao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<Beneficio> getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(List<Beneficio> beneficio) {
		this.beneficio = beneficio;
	}

	public List<Curso> getCurso() {
		return curso;
	}

	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	
	

}
