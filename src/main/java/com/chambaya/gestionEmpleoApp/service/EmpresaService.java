package com.chambaya.gestionEmpleoApp.service;

<<<<<<< HEAD
public interface EmpresaService {
}
=======
import com.chambaya.gestionEmpleoApp.dto.EmpresaDTO;

import java.util.List;

public interface EmpresaService {
    List<EmpresaDTO> obtenerTodas();
    EmpresaDTO obtenerPorId(Integer id);
    EmpresaDTO crear(EmpresaDTO dto);
    EmpresaDTO actualizar(Integer id, EmpresaDTO dto);
    void eliminar(Integer id);
}
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
