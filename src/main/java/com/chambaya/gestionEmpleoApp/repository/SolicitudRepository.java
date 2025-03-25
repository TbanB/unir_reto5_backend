package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
}
