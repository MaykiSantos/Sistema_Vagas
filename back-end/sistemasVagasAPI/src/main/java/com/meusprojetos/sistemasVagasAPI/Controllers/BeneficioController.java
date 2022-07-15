package com.meusprojetos.sistemasVagasAPI.Controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Beneficio;
import com.meusprojetos.sistemasVagasAPI.Models.Repository.BeneficioRepository;
import com.meusprojetos.sistemasVagasAPI.Views.UsuarioDtos.CreateUsuarioDto;

@RestController
@RequestMapping("beneficio")
public class BeneficioController {

	@Autowired
	private BeneficioRepository beneficioRepository;
	
	@GetMapping
	public ResponseEntity<?> listar(@Valid @RequestBody CreateUsuarioDto dto){
		
		return ResponseEntity.ok(dto.toString());
	}
}
