package com.chambaya.gestionEmpleoApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="ususarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @Column(name = "username", length = 45, nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    @Column(name = "enabled")
    private Boolean enabled;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = false)
    private List<Solicitud> solicitudes = new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_perfil",
            joinColumns = @JoinColumn(name = "username", referencedColumnName = "username"),
            inverseJoinColumns = @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil"))
    private Set<Perfil> perfiles = new HashSet<>();
}
