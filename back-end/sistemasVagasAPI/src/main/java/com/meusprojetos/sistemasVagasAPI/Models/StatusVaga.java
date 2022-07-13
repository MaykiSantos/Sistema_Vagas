package com.meusprojetos.sistemasVagasAPI.Models;

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

	public String getValor() {
		return valor;
	}
	
	
}
