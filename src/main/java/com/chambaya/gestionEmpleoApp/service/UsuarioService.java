package com.chambaya.gestionEmpleoApp.service;

<<<<<<< HEAD
public interface UsuarioService {
=======
import com.chambaya.gestionEmpleoApp.dto.UsuarioDTO;
import java.util.List;

public interface UsuarioService {
    List<UsuarioDTO> obtenerTodos();
    UsuarioDTO obtenerPorUsername(String username);
    UsuarioDTO crear(UsuarioDTO usuarioDTO);
    UsuarioDTO actualizar(String username, UsuarioDTO usuarioDTO);

    void desactivarUsuario(String username);
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
}
