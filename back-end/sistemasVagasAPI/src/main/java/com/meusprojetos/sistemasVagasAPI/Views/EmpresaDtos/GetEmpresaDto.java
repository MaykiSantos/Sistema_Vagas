package com.meusprojetos.sistemasVagasAPI.Views.EmpresaDtos;

import java.util.Date;
import java.util.List;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Setor;
import com.meusprojetos.sistemasVagasAPI.Models.Entity.TamanhoEmpresa;
import com.meusprojetos.sistemasVagasAPI.Models.Entity.Vaga;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class GetEmpresaDto {

	private Long id;
	private String nome;
	private TamanhoEmpresa tamanhoEmpresa;
	private String site;
	private String localizacao;
	private String telefone;
	private String email;
	private String sobre;
	private String logotipo;
	private Date dataCriacao;
	private Date dataModificacao;
	private String usuarioModificacao;
	private String usuarioCriacao;
	private List<Setor> setor;
	private List<Vaga> vaga;
}
