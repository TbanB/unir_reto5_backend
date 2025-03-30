package com.chambaya.gestionEmpleoApp.dto;

<<<<<<< HEAD
public class NuevoUsuarioDTO {
=======
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NuevoUsuarioDTO {
    private String username;
    private String password;
    private String email;
    private List<Integer> idPerfiles;
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
