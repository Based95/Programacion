import java.util.Scanner;

public class asterisco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numAsteriscos = 0;

        System.out.print("introduce un numero:");
        numAsteriscos = sc.nextInt();
        if (numAsteriscos <= 0) {
            System.out.println("*");
        }
        for (int i = 1; i <= numAsteriscos; i++) {
            System.out.print("*");
        }
    }

}
