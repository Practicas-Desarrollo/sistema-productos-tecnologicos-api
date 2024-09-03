package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_producto", nullable = false, updatable = false)
  private UUID id;

  @Column(unique = true)
  @NotNull(message = "El nombre no puede estar vacio")
  @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
  private String nombre;

  @NotNull(message = "El precio no puede ser nulo")
  @Positive(message = "El precio debe ser un número positivo")
  private Double precio;

  @Min(value = 0, message = "El estado no puede ser negativo")
  @Max(value = 1, message = "El estado solo puede ser 0 o 1")
  private int estado;

  @Min(value = 0, message = "La cantidad no puede ser negativa")
  private int cantidad;

  @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  @JoinColumn(name = "id_categoria")
  private Categoria categoria;

  public Producto() {}

  public Producto(UUID id, String nombre, Double precio, int estado, int cantidad) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.estado = estado;
    this.cantidad = cantidad;
  }

  public Producto(String nombre, Double precio, int estado, int cantidad, Categoria categoria) {
    this.nombre = nombre;
    this.precio = precio;
    this.estado = estado;
    this.cantidad = cantidad;
    this.categoria = categoria;
  }

  public UUID getId() {
    return this.id;
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

  public Categoria getCategoria() {
    return this.categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }
}
