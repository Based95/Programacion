import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio original (sin descuento): ");
        double sinDescuento = sc.nextDouble();

        System.out.print("Introduce el precio que has pagado: ");
        double conDescuento = sc.nextDouble();

        // Llamamos a la función
        double porcentaje = calcularDescuento(sinDescuento, conDescuento);

        // Pegamos los trozos de texto y variables con el +
        System.out.println("Te han aplicado un descuento del " + porcentaje + "%");

        sc.close();
    }

    // Función que calcula qué porcentaje de rebaja nos han hecho
    public static double calcularDescuento(double sinDescuento, double conDescuento) {
        // Ejemplo: 100 - (80 / 100 * 100) = 20%
        double porcentajePagado = (conDescuento / sinDescuento) * 100;
        double ahorro = 100 - porcentajePagado;
        return ahorro;
    }
}