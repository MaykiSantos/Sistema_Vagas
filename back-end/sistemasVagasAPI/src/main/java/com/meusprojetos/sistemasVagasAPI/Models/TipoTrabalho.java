package com.meusprojetos.sistemasVagasAPI.Models;


public enum TipoTrabalho {

	REMOTO("remoto"), 
	HIBRIDO("hibrido"), 
	PRESENCIAL("presencial");

	
	private String valor;

	private TipoTrabalho(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
	
	
}
