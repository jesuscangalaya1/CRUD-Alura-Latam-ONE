package com.alura.one.dto.request;

import com.alura.one.entities.Especialidad;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class MedicoRequest {

    @NotBlank
    private String nombre;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String telefono;

    @NotBlank
    @Pattern(regexp = "\\d{4,6}")
    private String documento;

    @NotNull
    private Especialidad especialidad;

    @NotNull
    @Valid
    private DireccionRequest direccion;


}
