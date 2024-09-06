package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rol")
public class Rol implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "id_rol", nullable = false, updatable = false)
  private UUID id;

  @Column(unique = true)
  private String nombre;

  @Min(value = 0, message = "El estado no puede ser negativo")
  @Max(value = 1, message = "El estado solo puede ser 0 o 1")
  private int estado;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
  private List<Cliente> clientes;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
  private List<Proveedor> proveedores;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
  private List<Usuario> usuarios;
}
