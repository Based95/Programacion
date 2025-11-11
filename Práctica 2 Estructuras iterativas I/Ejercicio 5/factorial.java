import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        int num = 1;
        int resultado = 1;
        int N;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero N");

        N = sc.nextInt();
        sc.close();

        for (num=1; num<=N; num++) {
            resultado *= num;
        }
        System.out.println("El factorial de " + N + " es: " + resultado);
    }

}