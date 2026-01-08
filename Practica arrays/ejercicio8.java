import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[100];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }
        System.out.println("Se han generado 100 números aleatorios");

        System.out.print("Introduce un valor R (entre 0.0 y 1.0) para comparar, escribe con coma(,): ");
        double r = sc.nextDouble();

        int contador = 0; 

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] >= r) {
                contador++; 
            }
        }

        System.out.println("Hay " + contador + " números que son mayores o iguales a " + r);
        sc.close();
    }
}