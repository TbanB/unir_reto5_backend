package com.chambaya.gestionEmpleoApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="vacantes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vacante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vacante")
    private Integer idVacante;

    @Column(name = "nombre", length = 2000)
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    private EstadoVacante estado;

    @Column(name = "detalles", columnDefinition = "TEXT")
    private String detalles;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;

    @OneToMany(mappedBy = "vacante", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Solicitud> solicitudes = new ArrayList<>();
}
