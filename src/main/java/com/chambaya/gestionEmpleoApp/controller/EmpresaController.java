package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;
}
