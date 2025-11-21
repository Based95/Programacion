import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int altura = 0;
        System.out.println("--introduce un número para crear una pirámide--");
        altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
