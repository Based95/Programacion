import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Introduce 10 números reales:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        double maximo = numeros[0];
        double minimo = numeros[0];

        for (int i = 0; i < 10; i++) {

            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        sc.close();
    }
}