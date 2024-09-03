package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "venta")
public class Venta {
  @Id
  @Column(name = "id_venta", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;
  @Temporal(TemporalType.TIMESTAMP)
  private Date fecha;
  @ManyToOne
  @JoinColumn(name = "id_cliente")
  private Cliente cliente;
  private String descripcion;
//  @ManyToOne
//  @JoinColumn(name = "id_producto")
//  private Producto producto;
  private int cantidad;
  private double precioUnitario;
  private int estado;

  public Venta() {}

  public Venta(UUID id, Date fecha, Cliente cliente, String descripcion, Producto producto, int cantidad, double precioUnitario, int estado) {
    this.id = id;
    this.fecha = fecha;
    this.cliente = cliente;
    this.descripcion = descripcion;
//    this.producto = producto;
    this.cantidad = cantidad;
    this.precioUnitario = precioUnitario;
    this.estado = estado;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

//  public Producto getProducto() {
//    return producto;
//  }
//
//  public void setProducto(Producto producto) {
//    this.producto = producto;
//  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  public double getPrecioUnitario() {
    return precioUnitario;
  }

  public void setPrecioUnitario(double precioUnitario) {
    this.precioUnitario = precioUnitario;
  }

  public int getEstado() {
    return estado;
  }

  public void setEstado(int estado) {
    this.estado = estado;
  }
}
