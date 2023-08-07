package com.alura.one.entities;

import lombok.*;

import javax.persistence.*;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String nombre;
    private String email;
    private String telefono;
    private String documento;

    private Boolean activo;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;


    @Embedded
    private Direccion direccion;


}
