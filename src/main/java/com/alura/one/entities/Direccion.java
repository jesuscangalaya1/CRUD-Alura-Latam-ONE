package com.alura.one.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Direccion {

    private String calle;
    private String numero;
    private String complemento;
    private String distrito;
    private String ciudad;

}