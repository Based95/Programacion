import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el carácter para el dibujo: ");
        char caracter = sc.next().charAt(0); // Leemos el primer carácter de lo que escribas
        
        System.out.print("Introduce el número de líneas: ");
        int lineas = sc.nextInt();

        // Llamamos a la función
        dibujarTriangulo(caracter, lineas);

        sc.close();
    }

    public static void dibujarTriangulo(char c, int n) {
        // Recorremos cada fila
        for (int i = 1; i <= n; i++) {
            
            // Imprimir espacios (para centrar)
            // En cada fila hay menos espacios: n - i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            // Imprimir el carácter
            // La secuencia es: 1, 3, 5, 7... La fórmula es (2 * i) - 1
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(c);
            }

            // Salto de línea al terminar la fila
            System.out.println();
        }
    }
}