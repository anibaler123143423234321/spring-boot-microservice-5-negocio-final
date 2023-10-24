package com.dagnerchuman.springbootmicroservice5Negocio.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="negocio")
public class Negocio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name="direccion", length = 100, nullable = false)
    private String direccion;

    @Column(name="fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

    @Column(name = "ruc", nullable = false, length = 11, unique = true)
    private String ruc;

    @Column(name = "tipo_ruc", length = 25 , nullable = false)
    private String tipoRuc;

    @Column(name="foto", length = 1200, nullable = true )
    private String picture;

    @Column(name="fotoQr", length = 1200, nullable = true )
    private String pictureQr;

    @Column(name = "telefono", nullable = false, unique = true)
    private String telefono;

}



