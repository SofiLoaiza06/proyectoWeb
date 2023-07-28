package com.proyectoWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")

public class producto implements Serializable{
private static final long serialVersionUID= 1L;  

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_producto")
  private long id_producto;
  private long id_categoria;
  private String descripcion;
  private String detalle;
  private double precio;
  private int existencias;
  private String imagen;
  private boolean activo;


    public producto() {
    }
}

//fin producto