package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "factura")
public class Factura {
  @Id
  @Column(name = "id_factura", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
//  @OneToOne
//  @JoinColumn(name = "id_venta")
//  private Venta venta;
  private double total;
  @Temporal(TemporalType.DATE)
  private Date fechaExpiracion;
  private int estado;

  public Factura() {}

  public Factura(UUID id, Venta venta, double total, Date fechaExpiracion, int estado) {
    this.id = id;
//    this.venta = venta;
    this.total = total;
    this.fechaExpiracion = fechaExpiracion;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

//  public Venta getVenta() {
//    return this.venta;
//  }
//
//  public void setVenta(Venta venta) {
//    this.venta = venta;
//  }

  public double getTotal() {
    return this.total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public Date getFechaExpiracion() {
    return this.fechaExpiracion;
  }

  public void setFechaExpiracion(Date fechaExpiracion) {
    this.fechaExpiracion = fechaExpiracion;
  }

  public int getEstado() {
    return this.estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
}
