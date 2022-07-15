package com.meusprojetos.sistemasVagasAPI.Views.EmpresaDtos;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.TamanhoEmpresa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UpdateEmpresaDto {

	@NotBlank
	private String nome;
	@NotBlank
	private TamanhoEmpresa tamanhoEmpresa;
	private String site;
	@NotBlank
	private String localizacao;
	@NotBlank @Pattern(regexp = "[^a-zA-Z]")
	private String telefone;
	@NotBlank @Email
	private String email;
	private String sobre;
	private String logotipo;
	@NotBlank
	private List<Integer> setor;
}
