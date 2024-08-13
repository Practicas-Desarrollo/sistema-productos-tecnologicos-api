package proyecto.desarollo.api.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Categoria implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(nullable = false, updatable = false)
  private UUID id;
  private String nombre;
  private int garantia;

  public Categoria() {}

  public Categoria(UUID id, String nombre, int garantia) {
    this.id = id;
    this.nombre = nombre;
    this.garantia = garantia;
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

  public int getGarantia() {
    return garantia;
  }

  public void setGarantia(int garantia) {
    this.garantia = garantia;
  }
}
