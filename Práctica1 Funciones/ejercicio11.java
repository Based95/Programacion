import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De qué número quieres la tabla?: ");
        int numero = sc.nextInt();

        // Llamamos a la función.
        // No la guardamos en ninguna variable porque es 'void'
        mostrarTabla(numero);

        sc.close();
    }

    // Usamos 'void' porque la función imprime ella misma, no devuelve nada
    public static void mostrarTabla(int n) {
        System.out.println("--- Tabla del " + n + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}