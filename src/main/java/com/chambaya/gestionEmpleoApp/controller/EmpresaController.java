package com.chambaya.gestionEmpleoApp.controller;

<<<<<<< HEAD
import com.chambaya.gestionEmpleoApp.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
=======
import com.chambaya.gestionEmpleoApp.dto.EmpresaDTO;
import com.chambaya.gestionEmpleoApp.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;
<<<<<<< HEAD
=======

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


>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
