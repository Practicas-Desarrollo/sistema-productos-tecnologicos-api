package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {
  @Id
  @Column(name = "id_detalle_venta", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
//  @ManyToOne
//  @JoinColumn(name = "id_venta")
//  private Venta venta;
  private int estado;

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

//  public Venta getVenta() {
//    return venta;
//  }
//
//  public void setVenta(Venta venta) {
//    this.venta = venta;
//  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
}
