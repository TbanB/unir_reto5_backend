package com.chambaya.gestionEmpleoApp.service;

<<<<<<< HEAD
public interface CategoriaService {
=======
import com.chambaya.gestionEmpleoApp.dto.CategoriaDTO;
import java.util.List;

public interface CategoriaService {
    List<CategoriaDTO> obtenerTodas();
    CategoriaDTO obtenerPorId(Integer id);
    CategoriaDTO crear(CategoriaDTO categoriaDTO);
    CategoriaDTO actualizar(Integer id, CategoriaDTO categoriaDTO);
    void eliminar(Integer id);
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
