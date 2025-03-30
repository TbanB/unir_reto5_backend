package com.chambaya.gestionEmpleoApp.controller;

import com.chambaya.gestionEmpleoApp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chambaya.gestionEmpleoApp.dto.UsuarioDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    @GetMapping("/{username}")
    public UsuarioDTO obtenerPorUsername(@PathVariable String username) {
        return usuarioService.obtenerPorUsername(username);
    }

    @PostMapping
    public UsuarioDTO crear(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.crear(usuarioDTO);
    }

    @PutMapping("/{username}")
    public UsuarioDTO actualizar(@PathVariable String username, @RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.actualizar(username, usuarioDTO);
    }

    // Endpoint para desactivar (dar de baja) al usuario sin eliminarlo
    @PutMapping("/{username}/desactivar")
    public void desactivarUsuario(@PathVariable String username) {
        usuarioService.desactivarUsuario(username);
    }

}
