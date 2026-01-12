import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos las dos cadenas
        System.out.print("Introduce la primera frase: ");
        String texto1 = sc.nextLine();

        System.out.print("Introduce la segunda frase: ");
        String texto2 = sc.nextLine();

        System.out.println("--- Resultados ---");

        // Comprobamos si son exactamente iguales
        // El método .equals() devuelve true o false
        if (texto1.equals(texto2)) {
            System.out.println("Son exactamente iguales.");
        } else {
            System.out.println("NO son exactamente iguales.");
        }

        // Comprobamos si son iguales ignorando mayúsculas y minúsculas
        // El método .equalsIgnoreCase() considera que 'A' es igual a 'a'
        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Son iguales (sin diferenciar mayúsculas).");
        } else {
            System.out.println("NO son iguales (ni siquiera ignorando mayúsculas).");
        }

        sc.close();
    }
}