package com.chambaya.gestionEmpleoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NuevaSolicitudDTO {
    private String archivo;
    private String comentarios;
    private Integer idVacante;
    private String username;
}