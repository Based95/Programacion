public class Articulo {
    private String nombre;
    private double precio, iva;
    private int cuantosQuedan;

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

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    // SETTERS
    public void setNombre(String nombre) {
        if (!nombre.equals("")) {
            this.nombre = nombre;
        } else {
            System.err.println("ERROR: El nombre no puede estar vacío");
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.err.println("ERROR: El precio debe ser mayor que 0");
        }
    }

    public void setIVA(double iva) {
        if (iva >= 0) {
            this.iva = iva;
        } else {
            System.err.println("ERROR: El iva no puede ser negativo");
        }
    }

    public void cuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("ERROR: el stock no puede ser nevativo");
        }
    }
}