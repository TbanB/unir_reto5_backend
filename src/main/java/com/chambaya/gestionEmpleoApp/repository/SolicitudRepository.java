package com.chambaya.gestionEmpleoApp.repository;

import com.chambaya.gestionEmpleoApp.model.Solicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
<<<<<<< HEAD

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Long> {
=======
import com.chambaya.gestionEmpleoApp.model.Vacante;
import java.util.List;

@Repository
public interface SolicitudRepository extends JpaRepository<Solicitud, Integer> {
    List<Solicitud> findByVacante(Vacante vacante);
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
