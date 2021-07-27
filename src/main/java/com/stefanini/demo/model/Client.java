package com.stefanini.demo.model;

import com.stefanini.demo.enums.ClientKind;
import com.stefanini.demo.enums.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Entity Client
 * @author William Londoño
 * @since 27/07/2021
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    @Id
    @GeneratedValue
    private int id;
    private String identificacion;
    private String razonSocial;
    private String contacto;
    @Enumerated(EnumType.STRING)
    private Region region;
    @Enumerated(EnumType.STRING)
    private ClientKind tipoCliente;
}
