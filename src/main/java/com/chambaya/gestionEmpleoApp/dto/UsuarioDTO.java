package com.chambaya.gestionEmpleoApp.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private String username;
    private String password;
    private String email;
    private LocalDate fechaRegistro;
    private Boolean enabled;
}