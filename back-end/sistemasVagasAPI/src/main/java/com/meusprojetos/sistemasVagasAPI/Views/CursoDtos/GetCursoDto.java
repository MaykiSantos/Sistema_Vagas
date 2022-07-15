package com.meusprojetos.sistemasVagasAPI.Views.CursoDtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class GetCursoDto {

	private Long id;
	private String descricao;
}
