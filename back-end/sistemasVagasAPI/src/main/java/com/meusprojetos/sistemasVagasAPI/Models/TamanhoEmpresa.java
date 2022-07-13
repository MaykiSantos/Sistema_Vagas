package com.meusprojetos.sistemasVagasAPI.Models;

public enum TamanhoEmpresa {
	
	ATE_9_EMPREGADOS("ATE 09 EMPREGADOS"),
	DE_10_A_49_EMPREGADOS("DE 10 A 49 EMPREGADOS"),
	DE_50_A_99_EMPREGADOS("DE 50 A 99 EMPREGADOS"),
	MAIS_DE_100_EMPREGADOS("MAIS DE 100 EMPREGADOS");
	
	private String valor;

	private TamanhoEmpresa(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}
	
	
}
