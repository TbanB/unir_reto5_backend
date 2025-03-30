package com.chambaya.gestionEmpleoApp.dto;

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
}
