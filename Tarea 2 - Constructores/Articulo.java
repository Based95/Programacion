public class Articulo {
    String nombre;
    double precio, iva;
    int cuantosQuedan;

    public Articulo(String nombre, double precio, double iva, int cuantosQuedan) {
        if (!nombre.equals("") && (precio > 0) && (iva >= 0) && (cuantosQuedan >= 0)) {
            this.nombre = nombre;
            this.precio = precio;
            this.iva = iva;
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("Error, el producto no cumple los requisitos para ser añadido");
        }
    }
}