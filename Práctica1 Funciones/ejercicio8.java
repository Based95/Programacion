import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero N: ");
        int n = sc.nextInt();

        // Llamamos a las tres funciones
        int suma = suma1aN(n);
        int producto = producto1aN(n);
        double medio = intermedio1aN(n);

        // Mostramos resultados
        System.out.println("El sumatorio de 1 a " + n + " es: " + suma);
        System.out.println("El productorio de 1 a " + n + " es: " + producto);
        System.out.println("El valor intermedio es: " + medio);

        sc.close();
    }

    // Suma de 1 a n: 1 + 2 + 3...
    public static int suma1aN(int n) {
        int acumulador = 0;
        for (int i = 1; i <= n; i++) {
            acumulador += i;
        }
        return acumulador;
    }

    // Producto de 1 a n (Factorial): 1 * 2 * 3...
    public static int producto1aN(int n) {
        int acumulador = 1; // ¡OJO! En productos empezamos en 1, no en 0
        for (int i = 1; i <= n; i++) {
            acumulador *= i;
        }
        return acumulador;
    }

    // Valor intermedio: (1 + n) / 2.0
    public static double intermedio1aN(int n) {
        // Usamos 2.0 para que la división sea decimal
        return (1 + n) / 2.0;
    }
}