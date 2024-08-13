package proyecto.desarollo.api.exceptions;

public class ProductoNotFoundException extends RuntimeException {
  public ProductoNotFoundException(String message) {
    super(message);
  }
}
