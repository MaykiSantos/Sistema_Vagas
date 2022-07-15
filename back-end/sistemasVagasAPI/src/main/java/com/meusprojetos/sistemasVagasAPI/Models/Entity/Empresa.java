package com.meusprojetos.sistemasVagasAPI.Models.Entity;

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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Empresa {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, unique = true)
	private String nome;
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
	private Date dataCriacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataModificacao;
	private String usuarioModificacao;
	private String usuarioCriacao;
	@ManyToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Setor> setor;
	@OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
	private List<Vaga> vaga;
	@OneToMany(mappedBy = "empresa" ,fetch = FetchType.LAZY)
	private List<Usuario> usuario;
	
	public Empresa(TamanhoEmpresa tamanhoEmpresa, String site, String localizacao, String telefone, String email,
			String sobre, String logotipo, String usuarioCriacao, List<Setor> setor) {
		this.tamanhoEmpresa = tamanhoEmpresa;
		this.site = site;
		this.localizacao = localizacao;
		this.telefone = telefone;
		this.email = email;
		this.sobre = sobre;
		this.logotipo = logotipo;
		this.dataCriacao = new Date();
		this.usuarioCriacao = usuarioCriacao;
		this.setor = setor;
	}
	
}
