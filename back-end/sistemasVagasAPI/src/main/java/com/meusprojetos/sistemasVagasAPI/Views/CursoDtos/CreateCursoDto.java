package com.meusprojetos.sistemasVagasAPI.Views.CursoDtos;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CreateCursoDto {

	@NotBlank
	private String descricao;
}
