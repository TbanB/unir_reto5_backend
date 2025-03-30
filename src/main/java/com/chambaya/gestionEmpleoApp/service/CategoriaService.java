package com.chambaya.gestionEmpleoApp.service;

import com.chambaya.gestionEmpleoApp.dto.CategoriaDTO;
import java.util.List;

public interface CategoriaService {
    List<CategoriaDTO> obtenerTodas();
    CategoriaDTO obtenerPorId(Integer id);
    CategoriaDTO crear(CategoriaDTO categoriaDTO);
    CategoriaDTO actualizar(Integer id, CategoriaDTO categoriaDTO);
    void eliminar(Integer id);
}
