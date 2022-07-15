package com.meusprojetos.sistemasVagasAPI.Models.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Setor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String descricao;
	@ManyToMany(fetch = FetchType.LAZY)
	private List<Empresa> empresa;
	
	public Setor(String descricao) {
		this.descricao = descricao;
	}
	
}
