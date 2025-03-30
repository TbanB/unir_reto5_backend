package com.chambaya.gestionEmpleoApp.service;

import com.chambaya.gestionEmpleoApp.dto.EmpresaDTO;

import java.util.List;

public interface EmpresaService {
    List<EmpresaDTO> obtenerTodas();
    EmpresaDTO obtenerPorId(Integer id);
    EmpresaDTO crear(EmpresaDTO dto);
    EmpresaDTO actualizar(Integer id, EmpresaDTO dto);
    void eliminar(Integer id);
}