package com.meusprojetos.sistemasVagasAPI.Views.BeneficioDtos;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UpdateBeneficioDto {

	@NotBlank
	private String descricao;
}
