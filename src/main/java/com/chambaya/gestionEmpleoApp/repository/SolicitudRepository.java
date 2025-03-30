package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.chambaya.gestionEmpleoApp.model.Vacante;
import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
    List<Solicitud> findByVacante(Vacante vacante);
}
