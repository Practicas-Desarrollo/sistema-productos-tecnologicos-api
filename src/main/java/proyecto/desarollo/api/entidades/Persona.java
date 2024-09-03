package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@MappedSuperclass
public abstract class Persona {
  @Id
  @Column(name = "id_persona", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @NotNull(message = "El nombre no puede ser nulo")
  private String nombre;

  @NotNull(message = "El apellido paterno no puede ser nulo")
  @Column(name = "apellido_paterno")
  private String apellidoPaterno;

  @NotNull(message = "El apellido materno no puede ser nulo")
  @Column(name = "apellido_materno")
  private String apellidoMaterno;

  @NotNull(message = "El genero no puede ser nulo")
  private String genero;

  public Persona() {}

  public Persona(UUID id, String nombre, String apellidoPaterno, String apellidoMaterno, String genero) {
    this.id = id;
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.genero = genero;
  }

  public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String genero) {
    this.nombre = nombre;
    this.apellidoPaterno = apellidoPaterno;
    this.apellidoMaterno = apellidoMaterno;
    this.genero = genero;
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

  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }
}
