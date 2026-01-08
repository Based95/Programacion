import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos valores quieres generar (N)? ");
        int n = sc.nextInt();

        System.out.print("Introduce el valor inicial (V): ");
        int v = sc.nextInt();

        System.out.print("Introduce el incremento (I): ");
        int incremento = sc.nextInt();

        int[] secuencia = new int[n];

        for (int i = 0; i < n; i++) {
            secuencia[i] = v + (i * incremento);
        }

        System.out.println("\n--- Secuencia Generada ---");
        for (int i = 0; i < n; i++) {
            System.out.print(secuencia[i] + " ");
        }
        sc.close();
    }
}