package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
<<<<<<< HEAD
=======
import com.chambaya.gestionEmpleoApp.dto.CategoriaDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

<<<<<<< HEAD
=======
    @GetMapping
    public List<CategoriaDTO> obtenerTodas() {
        return categoriaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public CategoriaDTO obtenerPorId(@PathVariable Integer id) {
        return categoriaService.obtenerPorId(id);
    }

    @PostMapping
    public CategoriaDTO crear(@RequestBody CategoriaDTO categoriaDTO) {
        return categoriaService.crear(categoriaDTO);
    }

    @PutMapping("/{id}")
    public CategoriaDTO actualizar(@PathVariable Integer id, @RequestBody CategoriaDTO categoriaDTO) {
        return categoriaService.actualizar(id, categoriaDTO);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
