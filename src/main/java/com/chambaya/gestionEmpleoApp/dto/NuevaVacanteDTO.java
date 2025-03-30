package com.chambaya.gestionEmpleoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NuevaVacanteDTO {
    private String nombre;
    private String descripcion;
    private String detalles;
    private String estado;
    private Integer idCategoria;
    private Integer idEmpresa;
}