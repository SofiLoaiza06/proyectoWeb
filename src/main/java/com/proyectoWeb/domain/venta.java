package com.proyectoWeb.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="venta")

public class venta implements Serializable{
private static final long serialVersionUID= 1L;  

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id_venta")
  private long id_venta;
  private long id_factura;
  private long id_producto;
  private double precio;
  private int cantidad;
 

    public venta() {
    }
}
//fin venta
