import java.util.Scanner;

public class mayorIgual {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// Pedimos los datos
    System.out.println("---Escribe el primer número---");
    int x = sc.nextInt();
    System.out.println("---Escribe el segundo número---");
    int y = sc.nextInt();
    sc.close();
// Comprobamos si son iguales, luego si x es mayor que y, y si nada de esto ocure solo queda una opción, que y sea el mayor
    if (x == y){
        System.out.println("Ambos números son iguales");
    }
    else if (x > y) {
        System.out.println("El número mayor es: " +x);
    }
    else {
        System.out.println("El número mayor es: " +y);
    }
    }
}
