package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
<<<<<<< HEAD
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
=======
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
