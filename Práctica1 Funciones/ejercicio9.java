import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int n3 = sc.nextInt();

        //Comparamos n1 y n2
        int ganadorProvisional = maximo(n1, n2);

        //Comparamos el ganador de antes con n3
        int elMasGrande = maximo(ganadorProvisional, n3);

        System.out.println("El número más elevado es: " + elMasGrande);
        
        sc.close();
    }

    // La función solo acepta dos números
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}