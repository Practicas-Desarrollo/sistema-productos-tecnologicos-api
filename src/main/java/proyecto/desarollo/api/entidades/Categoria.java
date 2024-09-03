package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_categoria", nullable = false, updatable = false)
  private UUID id;

  @NotNull(message = "El nombre no puede ser nulo")
  @Column(unique = true)
  private String nombre;

  @NotNull(message = "La garantia no puede ser nula")
  @Positive(message = "La garantia debe ser un número positivo")
  private int garantia;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.ALL)
  private List<Producto> productos;

  public Categoria() {}

  public Categoria(UUID id, String nombre, int garantia) {
    this.id = id;
    this.nombre = nombre;
    this.garantia = garantia;
  }

  public Categoria(String nombre, int garantia) {
    this.nombre = nombre;
    this.garantia = garantia;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getGarantia() {
    return garantia;
  }

  public void setGarantia(int garantia) {
    this.garantia = garantia;
  }

  public List<Producto> getProductos() {
    return this.productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }
}
