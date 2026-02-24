import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la cantidad en kilómetros: ");
        double kmInput = sc.nextDouble();

        // Llamamos a la función que hace el cálculo
        double millas = kilometros_a_millas(kmInput);

        // Mostramos el resultado
        System.out.println(kmInput + " kilómetros equivalen a " + millas + " millas.");

        sc.close();
    }

    // Función: Recibe km y devuelve millas 
    public static double kilometros_a_millas(double km) {
        // Si 1 milla = 1.60934 km, entonces 1 km = 1 / 1.60934 millas
        double factorConversion = 1.60934;
        return km / factorConversion;
    }
}