package com.meusprojetos.sistemasVagasAPI.Models.Entity;

import lombok.Getter;

@Getter
public enum StatusVaga {

	PUBLICADO("publicado"), 
	REMOVIDO("removido"), 
	PENDENTE("pendente"), 
	RECUSADO("recusado"), 
	EM_ANALISE("em_analise"); 
	
	private String valor;

	private StatusVaga(String valor) {
		this.valor = valor;
	}	
	
}
