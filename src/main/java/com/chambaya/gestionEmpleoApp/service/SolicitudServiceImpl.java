package com.chambaya.gestionEmpleoApp.service;

<<<<<<< HEAD
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SolicitudServiceImpl {
}
=======
import com.chambaya.gestionEmpleoApp.dto.CategoriaDTO;
import com.chambaya.gestionEmpleoApp.dto.EmpresaDTO;
import com.chambaya.gestionEmpleoApp.dto.SolicitudDTO;
import com.chambaya.gestionEmpleoApp.dto.UsuarioDTO;
import com.chambaya.gestionEmpleoApp.dto.VacanteDTO;
import com.chambaya.gestionEmpleoApp.model.Categoria;
import com.chambaya.gestionEmpleoApp.model.Empresa;
import com.chambaya.gestionEmpleoApp.model.Solicitud;
import com.chambaya.gestionEmpleoApp.model.Usuario;
import com.chambaya.gestionEmpleoApp.model.Vacante;
import com.chambaya.gestionEmpleoApp.repository.SolicitudRepository;
import com.chambaya.gestionEmpleoApp.repository.UsuarioRepository;
import com.chambaya.gestionEmpleoApp.repository.VacanteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SolicitudServiceImpl implements SolicitudService {

    @Autowired
    private SolicitudRepository solicitudRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private VacanteRepository vacanteRepository;

    @Override
    public SolicitudDTO aplicarVacante(SolicitudDTO solicitudDTO) {
        // Obtenemos el usuario (candidato) a partir del username contenido en el DTO
        Usuario usuario = usuarioRepository.findById(solicitudDTO.getUsuario().getUsername())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        // Obtenemos la vacante usando el id contenido en el VacanteDTO
        Integer idVacante = solicitudDTO.getVacante().getIdVacante();
        Vacante vacante = vacanteRepository.findById(idVacante)
                .orElseThrow(() -> new RuntimeException("Vacante no encontrada"));

        // Creamos la entidad Solicitud y asignamos los datos
        Solicitud solicitud = new Solicitud();
        solicitud.setArchivo(solicitudDTO.getArchivo());
        solicitud.setComentarios(solicitudDTO.getComentarios());
        solicitud.setFecha(LocalDate.now());
        solicitud.setUsuario(usuario);
        solicitud.setVacante(vacante);

        solicitud = solicitudRepository.save(solicitud);
        return toDTO(solicitud);
    }

    @Override
    public List<SolicitudDTO> obtenerSolicitudesPorVacante(Integer idVacante) {
        Vacante vacante = vacanteRepository.findById(idVacante)
                .orElseThrow(() -> new RuntimeException("Vacante no encontrada"));
        List<Solicitud> solicitudes = solicitudRepository.findByVacante(vacante);
        return solicitudes.stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    // Método para convertir una entidad Solicitud a SolicitudDTO
    private SolicitudDTO toDTO(Solicitud solicitud) {
        SolicitudDTO dto = new SolicitudDTO();
        dto.setIdSolicitud(solicitud.getIdSolicitud());
        dto.setArchivo(solicitud.getArchivo());
        dto.setComentarios(solicitud.getComentarios());
        dto.setFecha(solicitud.getFecha() != null ? solicitud.getFecha().toString() : null);
        dto.setVacante(toVacanteDTO(solicitud.getVacante()));
        dto.setUsuario(toUsuarioDTO(solicitud.getUsuario()));
        return dto;
    }

    // Conversión de Vacante a VacanteDTO
    private VacanteDTO toVacanteDTO(Vacante vacante) {
        VacanteDTO dto = new VacanteDTO();
        dto.setIdVacante(vacante.getIdVacante());
        dto.setNombre(vacante.getNombre());
        dto.setDescripcion(vacante.getDescripcion());
        dto.setFecha(vacante.getFecha() != null ? vacante.getFecha().toString() : null);
        dto.setEstado(vacante.getEstado() != null ? vacante.getEstado().toString() : null);
        dto.setDetalles(vacante.getDetalles());
        dto.setCategoria(vacante.getCategoria() != null ? toCategoriaDTO(vacante.getCategoria()) : null);
        dto.setEmpresa(vacante.getEmpresa() != null ? toEmpresaDTO(vacante.getEmpresa()) : null);
        return dto;
    }

    // Conversión de Usuario a UsuarioDTO
    private UsuarioDTO toUsuarioDTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setUsername(usuario.getUsername());
        dto.setPassword(usuario.getPassword());
        dto.setEmail(usuario.getEmail());
        dto.setFechaRegistro(usuario.getFechaRegistro());
        dto.setEnabled(usuario.getEnabled());
        return dto;
    }

    // Conversión de Categoria a CategoriaDTO
    private CategoriaDTO toCategoriaDTO(Categoria categoria) {
        CategoriaDTO dto = new CategoriaDTO();
        dto.setIdCategoria(categoria.getIdCategoria());
        dto.setNombre(categoria.getNombre());
        dto.setDescripcion(categoria.getDescripcion());
        return dto;
    }

    // Conversión de Empresa a EmpresaDTO
    private EmpresaDTO toEmpresaDTO(Empresa empresa) {
        EmpresaDTO dto = new EmpresaDTO();
        dto.setIdEmpresa(empresa.getIdEmpresa());
        dto.setRazonSocial(empresa.getRazonSocial());
        dto.setDireccionFiscal(empresa.getDireccionFiscal());
        dto.setPais(empresa.getPais());
        return dto;
    }
}
>>>>>>> 691d4df4ba3100a06721ebd6ec16390380ed9b2f
