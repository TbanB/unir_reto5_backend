package com.chambaya.gestionEmpleoApp.service;

import com.chambaya.gestionEmpleoApp.dto.EmpresaDTO;
import com.chambaya.gestionEmpleoApp.model.Empresa;
import com.chambaya.gestionEmpleoApp.repository.EmpresaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Override
    public List<EmpresaDTO> obtenerTodas() {
        return empresaRepository.findAll()
                .stream()
                .map(this::toDTO)
                .toList();
    }

    @Override
    public EmpresaDTO obtenerPorId(Integer id) {
        Empresa empresa = empresaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));
        return toDTO(empresa);
    }

    @Override
    public EmpresaDTO crear(EmpresaDTO dto) {
        Empresa empresa = toEntity(dto);
        return toDTO(empresaRepository.save(empresa));
    }

    @Override
    public EmpresaDTO actualizar(Integer id, EmpresaDTO dto) {
        Empresa empresa = empresaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada"));

        empresa.setRazonSocial(dto.getRazonSocial());
        empresa.setDireccionFiscal(dto.getDireccionFiscal());
        empresa.setPais(dto.getPais());

        return toDTO(empresaRepository.save(empresa));
    }

    @Override
    public void eliminar(Integer id) {
        if (!empresaRepository.existsById(id)) {
            throw new RuntimeException("Empresa no encontrada");
        }
        empresaRepository.deleteById(id);
    }

    private EmpresaDTO toDTO(Empresa empresa) {
        return new EmpresaDTO(
                empresa.getIdEmpresa(),
                empresa.getRazonSocial(),
                empresa.getDireccionFiscal(),
                empresa.getPais()
        );
    }

    private Empresa toEntity(EmpresaDTO dto) {
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(dto.getIdEmpresa());
        empresa.setRazonSocial(dto.getRazonSocial());
        empresa.setDireccionFiscal(dto.getDireccionFiscal());
        empresa.setPais(dto.getPais());
        return empresa;
    }
}
