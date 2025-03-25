package com.chambaya.gestionEmpleoApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="empresas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Integer idEmpresa;

    @Column(name = "razon_social", length = 45)
    private String razonSocial;

    @Column(name = "direccion_fiscal", length = 100)
    private String direccionFiscal;

    @Column(name = "pais", length = 45)
    private String pais;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Vacante> vacantes = new ArrayList<>();
}
