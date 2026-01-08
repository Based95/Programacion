import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        double sumaTotal = 0;

        System.out.println("Introduce 10 números :");

        for (int i = 0; i < 10; i++) {
            System.out.print("Dime el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            sumaTotal = sumaTotal + numeros[i];
        }

        System.out.println("La suma de todos los números es: " + sumaTotal);

        sc.close();
    }
}