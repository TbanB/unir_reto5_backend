package com.chambaya.gestionEmpleoApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="solicitudes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_solicitud")
    private Integer idSolicitud;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "archivo", length = 2000)
    private String archivo;

    @Column(name = "comentarios", length = 2000)
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "id_vacante", nullable = false)
    private Vacante vacante;

    @ManyToOne
    @JoinColumn(name = "username", nullable = false)
    private Usuario usuario;
}
