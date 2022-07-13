package com.meusprojetos.sistemasVagasAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meusprojetos.sistemasVagasAPI.Models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
