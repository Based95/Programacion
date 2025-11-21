import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroIntroducido = 0;
        boolean esPrimo = true;

        System.out.println("--Introduce un número para saber si es primo--");
        numeroIntroducido = sc.nextInt();

        if (numeroIntroducido <= 1) {
            System.out.println("El número no es primo");
            esPrimo = false;
        } else {

            for (int i = 2; i < numeroIntroducido; i++) {
                if (numeroIntroducido % i == 0) {
                    System.out.println("No es primo");
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numeroIntroducido + " es primo");
        } else {
            System.out.println("El número" + numeroIntroducido + "NO es primo");
        }
        sc.close();
    }

}
