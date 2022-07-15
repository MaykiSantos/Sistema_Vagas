package com.meusprojetos.sistemasVagasAPI.Views.BeneficioDtos;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateBeneficioDto {

	@NotBlank
	private String descricao;
}
