package com.chambaya.gestionEmpleoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacanteDTO {
    private Integer idVacante;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String estado;
    private String detalles;
    private CategoriaDTO categoria;
    private EmpresaDTO empresa;
}
