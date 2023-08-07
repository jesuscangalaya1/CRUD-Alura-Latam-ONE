package com.alura.one.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class DireccionRequest {

    @NotBlank
    private String calle;

    @NotBlank
    private String distrito;

    @NotBlank
    private String ciudad;

    @NotBlank
    private String numero;

    @NotBlank
    private String complemento;

}
