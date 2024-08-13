package proyecto.desarollo.api.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Rol implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(nullable = false, updatable = false)
  private UUID id;
  private String nombre;
  private int estado;

  public Rol() {}

  public Rol(UUID id, String nombre, int estado) {
    this.id = id;
    this.nombre = nombre;
    this.estado = estado;
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

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
}
