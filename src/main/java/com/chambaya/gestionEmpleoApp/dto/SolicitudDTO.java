package com.chambaya.gestionEmpleoApp.dto;

<<<<<<< HEAD
public class SolicitudDTO {
=======
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
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
