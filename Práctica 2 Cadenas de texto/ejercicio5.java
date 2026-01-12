import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase para ver si es palíndromo:");
        String fraseOriginal = sc.nextLine();
 
        // Convertimos a minúsculas para igualar 'A' y 'a'
        // Usamos .replace() para eliminar los espacios en blanco
        String fraseLimpia = fraseOriginal.toLowerCase().replace(" ", "");

        // Invertimos la cadena
        // Creamos una variable vacía donde iremos guardando la frase al revés
        String fraseInvertida = "";

        // Recorremos la frase limpia desde el final (length - 1) hasta el principio (0)
        for (int i = fraseLimpia.length() - 1; i >= 0; i--) {
            // Concatenamos cada letra a la nueva cadena
            fraseInvertida = fraseInvertida + fraseLimpia.charAt(i);
        }

        // Comparamos la versión limpia normal con la versión invertida
        if (fraseLimpia.equals(fraseInvertida)) {
            System.out.println("¡ES UN PALÍNDROMO!");
        } else {
            System.out.println("No es un palíndromo.");
        }
        sc.close();
    }
}