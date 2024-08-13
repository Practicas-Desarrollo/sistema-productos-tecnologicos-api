package proyecto.desarollo.api.controllers;

import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto.desarollo.api.modelos.Producto;
import proyecto.desarollo.api.services.ProductoService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/producto")
public class ProductoController {
  private final ProductoService productoService;

  public ProductoController(ProductoService productoService) {
    this.productoService = productoService;
  }

  @GetMapping("/all")
  public ResponseEntity<List<Producto>> getAllProductos() {
    List<Producto> productos = productoService.findAllProductos();
    return new ResponseEntity<>(productos, HttpStatus.OK);
  }

  @GetMapping("/find/{id}")
  public ResponseEntity<Producto> getProductoById(@PathVariable("id") UUID id) {
    Producto producto = productoService.findProductoById(id);
    return new ResponseEntity<>(producto, HttpStatus.OK);
  }

  @PostMapping("/add")
  public ResponseEntity<Producto> addProducto(@RequestBody Producto producto) {
    Producto productoCreado = productoService.addProducto(producto);
    return new ResponseEntity<>(productoCreado, HttpStatus.CREATED);
  }

  @PutMapping("/update")
  public ResponseEntity<Producto> updateProducto(@RequestBody Producto producto) {
    Producto productoActualizado = productoService.updateProducto(producto);
    return new ResponseEntity<>(productoActualizado, HttpStatus.OK);
  }

  @DeleteMapping("/delete/{id}")
  @Transactional
  public ResponseEntity<Producto> deleteProductoById(@PathVariable("id") UUID id) {
    productoService.deleteProducto(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }
}
