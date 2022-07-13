package com.meusprojetos.sistemasVagasAPI.Models;

public enum TipoContrato {
	
	CLT("clt"), 
	PJ("pj"), 
	BOLSA("bolsa"), 
	ESTAGIO("estagio");
	
	private String valor;

	private TipoContrato(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
}
