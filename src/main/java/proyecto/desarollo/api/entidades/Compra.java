package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "compra")
public class Compra {
  @Id
  @Column(name = "id_compra", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String nombre;

  private String descripcion;

  @Temporal(TemporalType.TIMESTAMP)
  private Date fecha;

  private double costo;

//  @OneToMany
//  @JoinColumn(name = "id_producto")
//  private List<Producto> productos;
//
//  @ManyToOne
//  @JoinColumn(name = "id_proveedor")
//  private Proveedor proveedor;

  public Compra() {}

  public Compra(UUID id, String nombre, String descripcion,
                Date fecha, double costo) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.costo = costo;
  }

  public UUID getId() {
    return this.id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Date getFecha() {
    return this.fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }

  public double getCosto() {
    return this.costo;
  }

  public void setCosto(double costo) {
    this.costo = costo;
  }

//  public List<Producto> getProductos() {
//    return productos;
//  }
//
//  public void setProductos(List<Producto> productos) {
//    this.productos = productos;
//  }
//
//  public Proveedor getProveedor() {
//    return this.proveedor;
//  }
//
//  public void setProveedor(Proveedor proveedor) {
//    this.proveedor = proveedor;
//  }
}
