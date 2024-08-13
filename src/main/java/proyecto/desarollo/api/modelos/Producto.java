package proyecto.desarollo.api.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Producto implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(nullable = false, updatable = false)
  private UUID id;
  private String nombre;
  private Double precio;
  private int estado;
  private int cantidad;
//  private Categoria categoria;

  public Producto() {}

  public Producto(UUID id, String nombre, Double precio,
                  int estado, int cantidad) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.estado = estado;
    this.cantidad = cantidad;
//    this.categoria = categoria;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

//  public Categoria getCategoria() {
//    return categoria;
//  }

//  public void setCategoria(Categoria categoria) {
//    this.categoria = categoria;
//  }
}
