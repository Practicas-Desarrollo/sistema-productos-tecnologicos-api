package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "proveedor")
public class Proveedor extends Persona implements Serializable {
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "codigo_proveedor", nullable = false, updatable = false)
  private UUID codigoProveedor;

  @NotNull(message = "El campo de telefono no puede estar vacio")
  private String telefono;

  @NotNull(message = "El campo de email no puede estar vacio")
  private String email;

  @NotNull(message = "El nombre de la empresa no puede estar en blanco")
  @Column(name = "nombre_empresa")
  private String nombreEmpresa;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_rol", nullable = false)
  private Rol rol;

  public Proveedor() {}

  public Proveedor(UUID id, String nombre, String apellidoPaterno, String apellidoMaterno, String genero, UUID codigoProveedor, String telefono, String email, String nombreEmpresa) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero);
    this.codigoProveedor = codigoProveedor;
    this.telefono = telefono;
    this.email = email;
    this.nombreEmpresa = nombreEmpresa;
  }

  public Proveedor(String nombre, String apellidoPaterno, String apellidoMaterno, String genero, UUID codigoProveedor, String telefono, String email, String nombreEmpresa) {
    super(nombre, apellidoPaterno, apellidoMaterno, genero);
    this.codigoProveedor = codigoProveedor;
    this.telefono = telefono;
    this.email = email;
    this.nombreEmpresa = nombreEmpresa;
  }

  public UUID getCodigoProveedor() {
    return codigoProveedor;
  }

  public void setCodigoProveedor(UUID codigoProveedor) {
    this.codigoProveedor = codigoProveedor;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String empresa) {
    this.nombreEmpresa = empresa;
  }

  public Rol getRol() {
    return this.rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }
}
