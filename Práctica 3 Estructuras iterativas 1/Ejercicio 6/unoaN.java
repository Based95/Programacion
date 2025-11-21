import java.util.Scanner;

public class unoaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numIntroducido;
        System.out.println("Introduce un número del 0 al 20");
        numIntroducido = sc.nextInt();

        for (int i = 1; i <= numIntroducido; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
