import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Pedimos los datos por teclado
    System.out.println("Introduce el primer número entero: ");
    int a = sc.nextInt();
    System.out.println("Introduce el segundo número entero: ");
    int b = sc.nextInt();

    //Llamamos a la función y mostramos el resultado
    int menor = minimo(a, b);
    System.out.println("El número mínimo es: " +menor);

    sc.close();
        
    }

    public static int minimo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }
}
