package proyecto.desarollo.api.modelos;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class Cliente extends Persona implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(nullable = false, updatable = false)
  private UUID codigoCliente;
  private int ci;
  private int nit;

  public Cliente() {}

  public Cliente(UUID id, String nombre, String apellidoPaterno,
                 String apellidoMaterno, String genero, Rol tipo,
                 UUID codigoCliente, int ci, int nit) {
    super(id, nombre, apellidoPaterno, apellidoMaterno, genero, tipo);
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

  @Override
  public String toString() {
    return "Cliente{" +
            "codigoCliente=" + codigoCliente +
            ", ci=" + ci +
            ", nit=" + nit +
            '}';
  }
}
