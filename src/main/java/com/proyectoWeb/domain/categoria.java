package com.proyectoWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria")

public class categoria implements Serializable{
private static final long serialVersionUID= 1L;  

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="idCategoria")
  private long idCategoria;
  private String descripcion;
  private String RutaImagen;
  private boolean isActivo;


    public categoria() {
    }

   
}
