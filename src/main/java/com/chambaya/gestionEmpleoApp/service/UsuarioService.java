package com.chambaya.gestionEmpleoApp.service;

import com.chambaya.gestionEmpleoApp.dto.UsuarioDTO;
import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> obtenerTodos();
    UsuarioDTO obtenerPorUsername(String username);
    UsuarioDTO crear(UsuarioDTO usuarioDTO);
    UsuarioDTO actualizar(String username, UsuarioDTO usuarioDTO);

    void desactivarUsuario(String username);
}
