package com.meusprojetos.sistemasVagasAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.sistemasVagasAPI.Models.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
