import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[1000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100);
        }

        System.out.println("Se ha generado el array con 1000 números.");

        System.out.print("Introduce un valor N (0-99) para buscarlo: ");
        int n = sc.nextInt();

        int contador = 0; 

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == n) {
                contador++;
            }
        }

        System.out.println("---------------- RESULTADOS ----------------");
        if (contador > 0) {
            System.out.println("¡El número " + n + " EXISTE en el array!");
            System.out.println("Aparece un total de " + contador + " veces.");
        } else {
            System.out.println("El número " + n + " NO existe en el array.");
        }
        sc.close();
    }
}