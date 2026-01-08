import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array (N): ");
        int n = sc.nextInt();

        System.out.print("Introduce el valor a repetir (M): ");
        int m = sc.nextInt();

        int[] Array = new int[n];

        for (int i = 0; i < n; i++) {
            Array[i] = m; 
        }

        System.out.println("Contenido del array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Posición " + i + ": " + Array[i]);
        }
        sc.close();
    }
}