package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil, Integer> {
}
