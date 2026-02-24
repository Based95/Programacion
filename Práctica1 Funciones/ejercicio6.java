import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Usamos un bucle for para pedir los 5 precios
        for (int i = 0; i <= 5; i++) {
            System.out.println("Introduce el precio para el producto " + i + ":");
            double precioOriginal = sc.nextDouble();

            double precioFinal = precioConIVA(precioOriginal);

            // Mostramos el resultado
            System.out.println("El precio con iVA es " + precioFinal + "euros");
        }
        sc.close();
    }

    public static double precioConIVA(double precio) {
        return precio * 1.21;
    }
}
