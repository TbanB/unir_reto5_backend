package com.chambaya.gestionEmpleoApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="perfiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil")
    private Integer idPerfil;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @ManyToMany(mappedBy = "perfiles")
    private Set<Usuario> usuarios = new HashSet<>();
}
