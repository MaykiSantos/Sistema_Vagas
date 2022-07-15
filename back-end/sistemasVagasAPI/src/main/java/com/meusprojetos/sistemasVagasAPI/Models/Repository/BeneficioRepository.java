package com.meusprojetos.sistemasVagasAPI.Models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Beneficio;

@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio, Long> {

}
