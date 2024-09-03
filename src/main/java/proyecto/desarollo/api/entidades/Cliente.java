package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "cliente")
public class Cliente extends Persona implements Serializable {
//  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "codigo_cliente", nullable = false, updatable = false)
  private UUID codigoCliente;

  private int ci;

  private int nit;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_rol", nullable = false)
  private Rol rol;

  public Cliente() {}

  public Cliente(UUID id, String nombre, String apellidoPaterno,
                 String apellidoMaterno, String genero,
                 UUID codigoCliente, int ci, int nit) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero);
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
