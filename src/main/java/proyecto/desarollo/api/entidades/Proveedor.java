package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
