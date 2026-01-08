import java.util.Scanner;
import java.util.Arrays; 

public class ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        System.out.println("Vamos a pedirte 20 números en total.");
        System.out.println("--- Introduce los 10 primeros valores ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.println("--- Introduce los 10 siguientes valores ---");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }


        boolean sonIguales = Arrays.equals(array1, array2);

        System.out.println("---------------- RESULTADO ----------------");
        if (sonIguales) {
            System.out.println("¡Los dos arrays son IDÉNTICOS!");
        } else {
            System.out.println("Los arrays son distintos.");
        }
        sc.close();
    }
}