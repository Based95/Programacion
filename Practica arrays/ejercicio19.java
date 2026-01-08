import java.util.Scanner;
import java.util.Arrays;

public class ejercicio19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] puntuaciones = new int[8];

        System.out.println("Introduce las puntuaciones de los 8 jugadores:");

        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Jugador " + (i + 1) + ": ");
            puntuaciones[i] = sc.nextInt();
        }

        Arrays.sort(puntuaciones);

        System.out.println("--- RANKING DEL TORNEO (Descendente) ---");

        for (int i = 7; i >= 0; i--) {
            System.out.println("Puesto " + (8 - i) + ": " + puntuaciones[i] + " puntos");
        }
        sc.close();
    }
}