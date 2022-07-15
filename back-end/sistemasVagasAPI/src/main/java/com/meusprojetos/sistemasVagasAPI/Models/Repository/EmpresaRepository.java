package com.meusprojetos.sistemasVagasAPI.Models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
