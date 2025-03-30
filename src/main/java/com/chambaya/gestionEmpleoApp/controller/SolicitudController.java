package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chambaya.gestionEmpleoApp.dto.SolicitudDTO;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;
    @PostMapping
    public SolicitudDTO aplicarVacante(@RequestBody SolicitudDTO solicitudDTO) {
        return solicitudService.aplicarVacante(solicitudDTO);
    }

    @GetMapping("/vacante/{idVacante}")
    public List<SolicitudDTO> obtenerSolicitudesPorVacante(@PathVariable Integer idVacante) {
        return solicitudService.obtenerSolicitudesPorVacante(idVacante);
    }
}
