package com.chambaya.gestionEmpleoApp.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.chambaya.gestionEmpleoApp.dto.UsuarioDTO;
import com.chambaya.gestionEmpleoApp.model.Usuario;
import com.chambaya.gestionEmpleoApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@Transactional
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioDTO> obtenerTodos() {
        return usuarioRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    @Override
    public UsuarioDTO obtenerPorUsername(String username) {
        Usuario usuario = usuarioRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return toDTO(usuario);
    }

    @Override
    public UsuarioDTO crear(UsuarioDTO usuarioDTO) {
        Usuario usuario = toEntity(usuarioDTO);
        return toDTO(usuarioRepository.save(usuario));
    }

    @Override
    public UsuarioDTO actualizar(String username, UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setFechaRegistro(usuarioDTO.getFechaRegistro());
        usuario.setEnabled(usuarioDTO.getEnabled());

        return toDTO(usuarioRepository.save(usuario));
    }

    @Override
    public void desactivarUsuario(String username) {
        Usuario usuario = usuarioRepository.findById(username)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        usuario.setEnabled(false);
        usuarioRepository.save(usuario);
    }

    // Métodos de mapeo entre entidad y DTO
    private UsuarioDTO toDTO(Usuario usuario) {
        return new UsuarioDTO(
                usuario.getUsername(),
                usuario.getPassword(),
                usuario.getEmail(),
                usuario.getFechaRegistro(),
                usuario.getEnabled()
        );
    }

    private Usuario toEntity(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setPassword(usuarioDTO.getPassword());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setFechaRegistro(usuarioDTO.getFechaRegistro());
        usuario.setEnabled(usuarioDTO.getEnabled());
        return usuario;
    }
}