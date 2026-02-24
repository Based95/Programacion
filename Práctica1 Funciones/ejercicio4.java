import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos el número

        System.out.println("Introduce un número entero: ");
        int numero = sc.nextInt();

        // Llamamos a la función y guardamos el resultado
        int signo = dimeSigno(numero);

        // Interpretamos el resultado
        if (signo == -1) {
            System.out.println("El número es negativo");
        } else if (signo == 0) {
            System.out.println("El número es cero");
        } else {
            System.out.println("El número es positivo");
        }
        sc.close();

    }

    public static int dimeSigno(int a) {
        if (a < 0) {
            return -1;
        } else if (a == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
