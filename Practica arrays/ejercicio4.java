import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];

        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Introduce 20 números enteros:");
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {

            if (numeros[i] > 0) {
                sumaPositivos = sumaPositivos + numeros[i];
            } 
            else if (numeros[i] < 0) {
                sumaNegativos = sumaNegativos + numeros[i];
            }
        }

        System.out.println("La suma de los positivos es: " + sumaPositivos);
        System.out.println("La suma de los negativos es: " + sumaNegativos);
        sc.close();
    }
}