import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números enteros (0 para salir)");

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            if (numero != 0) {
                if (esPrimo(numero)) {
                    System.out.println(numero + " es primo.");
                } else {
                    System.out.println(numero + " no es primo.");
                }
            }
        } while (numero != 0);

        System.out.println("Saliendo del programa");
        sc.close();
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
