package com.meusprojetos.sistemasVagasAPI.Views.UsuarioDtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import com.meusprojetos.sistemasVagasAPI.Utils.Validador.ComparaCampos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ComparaCampos(field = "senha", fieldMatch = "confirmacaoSenha")
public class CreateUsuarioDto {
	
	@NotBlank
	private String nome;
	@Email
	private String email;
	@NotBlank
	private String senha;
	@NotBlank
	private String confirmacaoSenha;
	@NotNull @Positive
	private Long idEmpresa;
	
}
