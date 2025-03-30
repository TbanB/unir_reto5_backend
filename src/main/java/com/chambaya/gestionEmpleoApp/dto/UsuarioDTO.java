package com.chambaya.gestionEmpleoApp.dto;

<<<<<<< HEAD
public class UsuarioDTO {
}
=======
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
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
