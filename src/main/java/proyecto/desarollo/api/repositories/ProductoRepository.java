package proyecto.desarollo.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.desarollo.api.modelos.Producto;

import java.util.Optional;
import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {
  Optional<Producto> findProductoById(UUID id);
  void deleteProductoById(UUID id);
}
