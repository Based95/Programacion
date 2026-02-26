import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Comprobar si x² + y² = z²---");

        System.out.println("Introduce el valor de x");
        int x = sc.nextInt();
        System.out.println("Introduce el valor de y");
        int y = sc.nextInt();
        System.out.println("Introduce el valor de z");
        int z = sc.nextInt();

        if (comprobarPitagoras(x, y, z)) {
            System.out.println("Los números " + x + ", " + y + ", " + z + " forman una terna pitagórica");
        } else {
            System.out.println("Estos números no cumplen la ecuación");
        }
        sc.close();

    }

    public static boolean comprobarPitagoras(int x, int y, int z) {
        int sumaCuadrados = (x * x) + (y * y);
        int zCuadrado = (z * z);
        return sumaCuadrados == zCuadrado;
    }
}
