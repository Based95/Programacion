import java.util.Scanner;
public class mayorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Escribe tu edad---");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad!");
        }
        sc.close();
    }
}
