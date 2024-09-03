package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente extends Persona implements Serializable {
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "codigo_cliente", nullable = false, updatable = false)
  private UUID codigoCliente;

  @NotNull(message = "El campo de CI no debe estar vacio")
  @Min(value = 0, message = "El CI no puede ser negativo")
  private int ci;

  @NotNull(message = "El NIT no debe estar vacio")
  @Min(value = 0, message = "El NIT no puede ser negativo")
  private int nit;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_rol", nullable = false)
  private Rol rol;

  public Cliente() {}

  public Cliente(UUID id, String nombre, String apellidoPaterno, String apellidoMaterno, String genero, UUID codigoCliente, int ci, int nit) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero);
    this.codigoCliente = codigoCliente;
    this.ci = ci;
    this.nit = nit;
  }

  public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String genero, UUID codigoCliente, int ci, int nit) {
    super(nombre, apellidoPaterno, apellidoMaterno, genero);
    this.codigoCliente = codigoCliente;
    this.ci = ci;
    this.nit = nit;
  }

  public UUID getCodigoCliente() {
    return codigoCliente;
  }

  public void setCodigoCliente(UUID codigoCliente) {
    this.codigoCliente = codigoCliente;
  }

  public int getCi() {
    return ci;
  }

  public void setCi(int ci) {
    this.ci = ci;
  }

  public int getNit() {
    return nit;
  }

  public void setNit(int nit) {
    this.nit = nit;
  }

  public Rol getRol() {
    return this.rol;
  }

  public void setRol(Rol rol) {
    this.rol = rol;
  }
}
