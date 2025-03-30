package com.chambaya.gestionEmpleoApp.service;

import com.chambaya.gestionEmpleoApp.dto.SolicitudDTO;
import java.util.List;

public interface SolicitudService {
    SolicitudDTO aplicarVacante(SolicitudDTO solicitudDTO);

    List<SolicitudDTO> obtenerSolicitudesPorVacante(Integer idVacante);
}
