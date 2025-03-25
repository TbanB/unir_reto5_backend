package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.service.SolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudController {
    @Autowired
    private SolicitudService solicitudService;
}
