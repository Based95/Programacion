import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[20];

        double suma = 0;

        double media;

        System.out.println("Introduce 20 números reales:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Dime el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        for (int i = 0; i < 20; i++) {
            suma = suma + numeros[i]; 
        }

        media = suma / 20;
        //podríamos usar "media = suma / numeros.length;" en el caso de que quisiéramos cambiar la longitud del array en el futuro,
        // así no tendríamos que cambiarlo manualmente

        System.out.println("--------------------------------");
        System.out.println("La suma total es: " + suma);
        System.out.println("La media es: " + media);

        sc.close();
    }
}