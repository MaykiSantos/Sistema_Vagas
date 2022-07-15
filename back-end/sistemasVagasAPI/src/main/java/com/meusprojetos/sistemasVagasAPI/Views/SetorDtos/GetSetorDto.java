package com.meusprojetos.sistemasVagasAPI.Views.SetorDtos;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class GetSetorDto {

	private Long id;
	private String descricao;
}
