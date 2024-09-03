package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "usuario")
public class Usuario extends Persona implements Serializable {
  @NotNull(message = "Algunos de los campos se encuentra en blanco")
  private String username;

  @NotNull(message = "Algunos de los campos se encuentra en blanco")
  private String password;

  @Min(value = 0, message = "El estado no puede ser negativo")
  @Max(value = 1, message = "El estado solo puede ser 0 o 1")
  private int estado;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_rol", nullable = false)
  private Rol rol;

  public Usuario() {}

  public Usuario(UUID id, String nombre, String apellidoPaterno, String apellidoMaterno, String genero, String username, String password, int estado) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero);
    this.username = username;
    this.password = password;
    this.estado = estado;
  }

  public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String genero, String username, String password, int estado) {
    super(nombre, apellidoPaterno, apellidoMaterno, genero);
    this.username = username;
    this.password = password;
    this.estado = estado;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getEstado() {
    return this.estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

  public Rol getRol() {
    return this.rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }
}
