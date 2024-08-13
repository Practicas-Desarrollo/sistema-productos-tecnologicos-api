package proyecto.desarollo.api.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Proveedor extends Persona implements Serializable {
  @Id
  private UUID codigoProveedor;
  private String telefono;
  private String email;
  private String empresa;

  public Proveedor() {}

  public Proveedor(UUID id, String nombre, String apellidoPaterno,
                   String apellidoMaterno, String genero, Rol tipo,
                   UUID codigoProveedor, String telefono, String email,
                   String empresa) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero, tipo);
    this.codigoProveedor = codigoProveedor;
    this.telefono = telefono;
    this.email = email;
    this.empresa = empresa;
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

  public String getEmpresa() {
    return empresa;
  }

  public void setEmpresa(String empresa) {
    this.empresa = empresa;
  }
}
