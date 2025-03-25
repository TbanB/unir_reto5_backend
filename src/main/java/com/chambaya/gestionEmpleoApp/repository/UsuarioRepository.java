package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
