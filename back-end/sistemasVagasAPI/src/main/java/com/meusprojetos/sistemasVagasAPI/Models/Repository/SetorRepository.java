package com.meusprojetos.sistemasVagasAPI.Models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Setor;

@Repository
public interface SetorRepository extends JpaRepository<Setor, Long> {

}
