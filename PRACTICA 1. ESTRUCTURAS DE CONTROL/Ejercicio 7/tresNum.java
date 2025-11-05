import java.util.Scanner;

public class tresNum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// Pedimos los datos
    System.out.println("---Escribe el primer número---");
    int a = sc.nextInt();
    System.out.println("---Escribe el segundo número---");
    int b = sc.nextInt();
    System.out.println("---Escribe el tercer número---");
    int c = sc.nextInt();
    sc.close();
// Comprobamos que a swa mayor o igual que b (igual por los empates), si esto no ocurre comprobamos b, y si esto no es ciertop solo queda una opción, que c sea el mayor
    if (a >= b && a >= c) {
        System.out.println("El mayor es: " +a);
    }
    else if (b >= a && b >= c) {
        System.out.println("El mayor es: " +b);
    }
    else {
        System.out.println("El mayor es: " +c);
    }
    }
}
