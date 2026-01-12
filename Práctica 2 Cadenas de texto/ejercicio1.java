import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        
        // String.trim() elimina espacios sobrantes al inicio y final de la frase
        frase = frase.trim();
        
        // .split() corta la frase en trozos.
        // "\\s+" hace que si hay muchos espacios juntos, cuenten como uno solo.
        // Así evitamos que salgan huecos vacíos si escribimos "Hola    Mundo".
        String[] palabras = frase.split("\\s+");
        
        System.out.println("--- Palabras separadas ---");
        
        //Recorremos el array y mostramos cada palabra
        for (String p : palabras) {
            System.out.println(p);
        }
        sc.close();
    }
}