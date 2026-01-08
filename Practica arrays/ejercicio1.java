import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        System.out.println("Introduce 10 números :");

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número para la posición " + i + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("--- Los números guardados son: ---");

        for (int i = 0; i < 10; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        sc.close();
    }
}