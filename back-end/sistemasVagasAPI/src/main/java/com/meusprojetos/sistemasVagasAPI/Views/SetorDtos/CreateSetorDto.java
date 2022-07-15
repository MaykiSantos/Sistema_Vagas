package com.meusprojetos.sistemasVagasAPI.Views.SetorDtos;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CreateSetorDto {

	@NotBlank
	private String descricao;
}
