package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
