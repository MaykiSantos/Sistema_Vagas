package com.meusprojetos.sistemasVagasAPI.Views.BeneficioDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetBeneficioDto {

	private Long id;
	private String descricao;
	
	public GetBeneficioDto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
		
	
}
