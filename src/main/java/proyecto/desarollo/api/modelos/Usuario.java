package proyecto.desarollo.api.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Usuario extends Persona implements Serializable {
  private String username;
  private String password;
  @Id
  private int estado;

  public Usuario() {}

  public Usuario(UUID id, String nombre, String apellidoPaterno,
                 String apellidoMaterno, String genero, Rol tipo,
                 String username, String password, int estado) {
    super(id, nombre, apellidoPaterno,
            apellidoMaterno, genero, tipo);
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
}
