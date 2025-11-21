import java.util.Scanner;

public class mostrarPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int numPares = 0;

        System.out.println("Dime un número: ");
        a = sc.nextInt();
        System.out.println("Dime otro número: ");
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                numPares++;
            }
        }
        System.out.println();
        System.out.println("El numero de pares es: " + numPares);

    }

}
