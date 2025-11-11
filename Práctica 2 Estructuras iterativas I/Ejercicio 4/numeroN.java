import java.util.Scanner;

public class numeroN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 1;

        System.out.println("---Introduce un número hasta el que quieras contar---");
        int numIntroducido = sc.nextInt();
        sc.close();

        for (num=1; num<=numIntroducido; num++) {
            System.out.println(+num);
        }
    }
}
