package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
=======
import com.chambaya.gestionEmpleoApp.dto.SolicitudDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;
<<<<<<< HEAD
=======
    @PostMapping
    public SolicitudDTO aplicarVacante(@RequestBody SolicitudDTO solicitudDTO) {
        return solicitudService.aplicarVacante(solicitudDTO);
    }

    @GetMapping("/vacante/{idVacante}")
    public List<SolicitudDTO> obtenerSolicitudesPorVacante(@PathVariable Integer idVacante) {
        return solicitudService.obtenerSolicitudesPorVacante(idVacante);
    }
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
