package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "detalle_compra")
public class DetalleCompra {
  @Id
  @Column(name = "id_detalle_compra", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  private double precioUnitario;
  private double precioTotal;
  private int cantidad;
  private int estado;

//  @ManyToOne
//  @JoinColumn(name = "id_compra")
//  private Compra compra;

  public DetalleCompra() {}

  public DetalleCompra(UUID id, double precioUnitario, double precioTotal, int cantidad, int estado, Compra compra) {
    this.id = id;
    this.precioUnitario = precioUnitario;
    this.precioTotal = precioTotal;
    this.cantidad = cantidad;
    this.estado = estado;
//    this.compra = compra;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public double getPrecioUnitario() {
    return this.precioUnitario;
  }

  public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }

  public double getPrecioTotal() {
    return this.precioTotal;
  }

  public void setPrecioTotal(double precioTotal) {
    this.precioTotal = precioTotal;
  }

  public int getCantidad() {
    return this.cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public int getEstado() {
    return this.estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }

//  public Compra getCompra() {
//    return this.compra;
//  }
//
//  public void setCompra(Compra compra) {
//    this.compra = compra;
//  }
}
