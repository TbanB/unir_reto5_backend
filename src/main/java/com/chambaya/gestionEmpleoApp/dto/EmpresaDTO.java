package com.chambaya.gestionEmpleoApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {
    private Integer idEmpresa;
    private String razonSocial;
    private String direccionFiscal;
    private String pais;
}
