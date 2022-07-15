package com.meusprojetos.sistemasVagasAPI.Models.Entity;

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

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
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

}
