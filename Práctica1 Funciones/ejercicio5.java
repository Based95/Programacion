import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos la distancia en millas
        System.out.println("Introduce la distancia en millas como entero: ");
        int millasInput = sc.nextInt();

        // Llamamos a la función
        double km = millas_a_kilometros(millasInput);

        // Mostramos el resultado
        System.out.println(millasInput + " millas equivalen a " + km + " kilómetros.");
        sc.close();

    }

    public static double millas_a_kilometros(int millas) {
        // cambiamos km a millas
        double Conversión = 1.60934;
        return millas * Conversión;
    }
}
