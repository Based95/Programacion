import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor inicial (P): ");
        int p = sc.nextInt();

        System.out.print("Introduce el valor final (Q): ");
        int q = sc.nextInt();

        if (p > q) {
            System.out.println("Error: P debe ser menor o igual que Q.");
        } else {

            int cantidad = (q - p) + 1;

            int[] miArray = new int[cantidad];

            for (int i = 0; i < cantidad; i++) {

                miArray[i] = p + i;
            }

            System.out.println("Secuencia generada:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print(miArray[i] + " ");
            }
        }
        sc.close();
    }
}