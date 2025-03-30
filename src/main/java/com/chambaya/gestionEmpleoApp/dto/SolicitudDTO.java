package com.chambaya.gestionEmpleoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudDTO {
    private Integer idSolicitud;
    private String archivo;
    private String comentarios;
    private String fecha;
    private VacanteDTO vacante;
    private UsuarioDTO usuario;
}
