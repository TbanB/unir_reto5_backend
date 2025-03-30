package com.chambaya.gestionEmpleoApp.service;

import com.chambaya.gestionEmpleoApp.dto.CategoriaDTO;
import com.chambaya.gestionEmpleoApp.model.Categoria;
import com.chambaya.gestionEmpleoApp.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaDTO> obtenerTodas() {
        return categoriaRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    @Override
    public CategoriaDTO obtenerPorId(Integer id) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
        return toDTO(categoria);
    }

    @Override
    public CategoriaDTO crear(CategoriaDTO categoriaDTO) {
        Categoria categoria = toEntity(categoriaDTO);
        return toDTO(categoriaRepository.save(categoria));
    }

    @Override
    public CategoriaDTO actualizar(Integer id, CategoriaDTO categoriaDTO) {
        Categoria categoria = categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));

        categoria.setNombre(categoriaDTO.getNombre());
        categoria.setDescripcion(categoriaDTO.getDescripcion());

        return toDTO(categoriaRepository.save(categoria));
    }

    @Override
    public void eliminar(Integer id) {
        if (!categoriaRepository.existsById(id)) {
            throw new RuntimeException("Categoría no encontrada");
        }
        categoriaRepository.deleteById(id);
    }

    private CategoriaDTO toDTO(Categoria categoria) {
        return new CategoriaDTO(
                categoria.getIdCategoria(),
                categoria.getNombre(),
                categoria.getDescripcion()
        );
    }

    private Categoria toEntity(CategoriaDTO categoriaDTO) {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(categoriaDTO.getIdCategoria());
        categoria.setNombre(categoriaDTO.getNombre());
        categoria.setDescripcion(categoriaDTO.getDescripcion());
        return categoria;
    }
}

