package com.meusprojetos.sistemasVagasAPI.Views.UsuarioDtos;

import java.util.Date;
import java.util.List;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Perfil;
import com.meusprojetos.sistemasVagasAPI.Views.EmpresaDtos.GetEmpresaDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class GetUsuarioDto {

	private Long id;
	private String nome;
	private String email;
	private Date dataCriacao;
	private Date dataModificacao;
	private GetEmpresaDto empresa;
	private List<Perfil> perfil;
}
