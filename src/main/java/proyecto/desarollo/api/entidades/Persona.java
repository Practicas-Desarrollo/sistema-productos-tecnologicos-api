package proyecto.desarollo.api.entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public abstract class Persona {
  @Id
  @Column(name = "id_persona", nullable = false, updatable = false)
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @NotNull(message = "El nombre no puede ser nulo")
  private String nombre;

  @NotNull(message = "El apellido paterno no puede ser nulo")
  @Column(name = "apellido_paterno")
  private String apellidoPaterno;

  @NotNull(message = "El apellido materno no puede ser nulo")
  @Column(name = "apellido_materno")
  private String apellidoMaterno;

  @NotNull(message = "El genero no puede ser nulo")
  private String genero;
}
