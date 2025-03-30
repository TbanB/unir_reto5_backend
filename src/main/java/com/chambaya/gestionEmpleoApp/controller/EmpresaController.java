package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.dto.EmpresaDTO;
import com.chambaya.gestionEmpleoApp.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public List<EmpresaDTO> listarEmpresas() {
        return empresaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public EmpresaDTO verEmpresa(@PathVariable Integer id) {
        return empresaService.obtenerPorId(id);
    }

    @PostMapping
    public EmpresaDTO crearEmpresa(@RequestBody EmpresaDTO dto) {
        return empresaService.crear(dto);
    }

    @PutMapping("/{id}")
    public EmpresaDTO actualizarEmpresa(@PathVariable Integer id, @RequestBody EmpresaDTO dto) {
        return empresaService.actualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpresa(@PathVariable Integer id) {
        empresaService.eliminar(id);
    }


}
