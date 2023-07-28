package com.proyectoWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="factura")

public class factura implements Serializable{
private static final long serialVersionUID= 1L;  

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_factura")
  private long id_factura;
  private long id_usuario;
  private int fecha;
  private double total;
  private boolean estado;   

 
 

    public factura() {
    }
}
//fin factura