import java.util.Scanner;

public class multiplo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numIntroducido = 0;
        int numMultiplos = 0;

        System.out.println("--Números múltiplos de 3--");
        System.out.println("Escribe un número: ");
        numIntroducido = sc.nextInt();

        for (int i = 1; i <= numIntroducido; i++) {
            if (i % 3 == 0) {
                numMultiplos++;
            }
        }
        System.out.println("Hay " + numMultiplos + " múltiplos de 3.");

    }
}