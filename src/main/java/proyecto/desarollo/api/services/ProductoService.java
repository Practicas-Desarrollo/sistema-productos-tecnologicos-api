package proyecto.desarollo.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.desarollo.api.exceptions.ProductoNotFoundException;
import proyecto.desarollo.api.modelos.Producto;
import proyecto.desarollo.api.repositories.ProductoRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ProductoService {
  private final ProductoRepository productoRepository;

  @Autowired
  public ProductoService(ProductoRepository productoRepository) {
    this.productoRepository = productoRepository;
  }

  public Producto addProducto(Producto producto) {
    producto.setId(UUID.fromString(UUID.randomUUID().toString()));
    return productoRepository.save(producto);
  }

  public List<Producto> findAllProductos() {
    return productoRepository.findAll();
  }

  public Producto updateProducto(Producto producto) {
    return productoRepository.save(producto);
  }

  public Producto findProductoById(UUID id) {
    return productoRepository
            .findProductoById(id)
            .orElseThrow(
                    () -> new ProductoNotFoundException("Producto with id " + id + " was not found"));
  }

  public void deleteProducto(UUID id) {
    productoRepository.deleteProductoById(id);
  }
}
