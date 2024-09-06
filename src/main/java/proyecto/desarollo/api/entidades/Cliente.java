package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
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
}
