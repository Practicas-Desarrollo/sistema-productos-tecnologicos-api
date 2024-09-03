package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "rol")
public class Rol implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_rol", nullable = false, updatable = false)
  private UUID id;

  @Column(unique = true)
  private String nombre;

  private int estado;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
  private List<Cliente> clientes;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
  private List<Proveedor> proveedores;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
  private List<Usuario> usuarios;

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
