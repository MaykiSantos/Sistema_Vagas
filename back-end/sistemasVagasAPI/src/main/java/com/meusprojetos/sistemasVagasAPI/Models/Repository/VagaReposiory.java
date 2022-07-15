package com.meusprojetos.sistemasVagasAPI.Models.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meusprojetos.sistemasVagasAPI.Models.Entity.Vaga;

@Repository
public interface VagaReposiory extends JpaRepository<Vaga, Long> {

}
