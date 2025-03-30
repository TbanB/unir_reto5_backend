package com.chambaya.gestionEmpleoApp.service;

<<<<<<< HEAD
public interface SolicitudService {
=======
import com.chambaya.gestionEmpleoApp.dto.SolicitudDTO;
import java.util.List;

public interface SolicitudService {
    SolicitudDTO aplicarVacante(SolicitudDTO solicitudDTO);

    List<SolicitudDTO> obtenerSolicitudesPorVacante(Integer idVacante);
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
