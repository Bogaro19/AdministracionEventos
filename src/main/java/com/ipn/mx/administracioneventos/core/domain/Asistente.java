package com.ipn.mx.administracioneventos.core.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Asistente", schema = "public")
public class Asistente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsistente;

    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 2, max = 50, message = "El valor debera de estar entre 2-50")
    @Column(name = "nombre", length = 50, nullable = false)
private String nombre;


    @Size(min = 2, max = 50, message = "El valor debera de estar entre 2-50")
    @Column(name = "paterno", length = 50, nullable = false)
private String paterno;

    @Size(min = 2, max = 50, message = "El valor debera de estar entre 2-50")
    @Column(name = "materno", length = 50, nullable = false)
private String materno;

    @Email(message = "Escribe un correo valido")
    @Column(name = "email", length = 50, nullable = false)
private String email;

    @Column(name = "nombre", length = 50, nullable = false)
private Date fechaRegistro;
    @Column(name = "nombre", length = 50, nullable = false)


}
