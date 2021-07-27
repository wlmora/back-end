package com.stefanini.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private UUID id;
    private String identificacion;
    private String razonSocial;
    private String contacto;
    private String region;
    private String tipoCliente;

}
