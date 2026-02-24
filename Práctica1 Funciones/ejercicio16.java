import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos el tamaño por teclado
        System.out.print("¿Qué tamaño quieres para el array?: ");
        int tamaño = sc.nextInt();

        // Creamos el array con ese tamaño
        int[] misNumeros = new int[tamaño];

        // Llamamos a la función para rellenarlo
        rellenarAleatorio(misNumeros);

        // Mostramos el resultado para comprobar que funciona
        System.out.println("Array rellenado con éxito:");
        for (int i = 0; i < misNumeros.length; i++) {
            System.out.print(misNumeros[i] + " ");
        }
        sc.close();
    }

    // Función que recibe un array y lo rellena de números aleatorios
    public static void rellenarAleatorio(int[] array) {
        for (int i = 0; i < array.length; i++) {
            // Math.random() genera un double entre 0 y 1.
            // Multiplicamos por 101 para que el rango sea de 0 a 100.
            // (int) convierte ese decimal en un entero.
            array[i] = (int) (Math.random() * 101);
        }
    }
}