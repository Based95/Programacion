import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una palabra o frase: ");
        String texto = sc.nextLine(); 

        System.out.println("--- RESULTADOS ---");
        
        // método Iterativo 
        char letraIterativa = buscarIterativo(texto);
        System.out.println("Método Iterativo encontró: '" + letraIterativa + "'");

        // método Recursivo
        // Le pasamos el texto y le decimos que empiece a buscar desde la posición 0
        char letraRecursiva = buscarRecursivo(texto, 0); 
        System.out.println("Método Recursivo encontró: '" + letraRecursiva + "'");

        sc.close();
    }

    //FORMA ITERATIVA (Con bucle)
    public static char buscarIterativo(String texto) {
        // Recorremos la palabra letra a letra
        for (int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);
            
            // La herramienta Character.isUpperCase comprueba si es mayúscula
            if (Character.isUpperCase(letraActual)) {
                return letraActual; // Si lo es, la devuelve y termina la función
            }
        }
        return ' '; // Si termina el bucle y no hay mayúsculas, devolvemos un espacio vacío
    }

    //FORMA RECURSIVA (Sin bucles, la función se llama a sí misma)
    public static char buscarRecursivo(String texto, int posicion) {
        // Caso de salida 1: Si hemos llegado al final de la palabra y no hay mayúsculas
        if (posicion >= texto.length()) {
            return ' '; 
        }

        // Sacamos la letra en la que estamos ahora mismo
        char letraActual = texto.charAt(posicion);

        // Caso de salida 2: Encontramos la mayúscula
        if (Character.isUpperCase(letraActual)) {
            return letraActual;
        }

        // Como no es mayúscula, la función se llama a sí misma pero avanzamos la posición + 1
        return buscarRecursivo(texto, posicion + 1);
    }
}