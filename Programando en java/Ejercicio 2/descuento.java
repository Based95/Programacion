import java.util.Scanner;

public class descuento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe el precio original del artículo");
        double precio = scanner.nextDouble();
        System.out.println("Escribe el precio de venta del artículo");
        double precioVenta = scanner.nextDouble();
        scanner.close();

        double descuento = ((precio - precioVenta) / precio) * 100; 

        System.out.println("El descuento es del " +descuento +"%");

    }
    
}
