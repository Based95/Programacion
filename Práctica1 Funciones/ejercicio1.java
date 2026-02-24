import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos los números
        System.out.println("Introduce el primer número: ");
        double num1  = sc.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2  = sc.nextDouble();

        //Llamamos a la función y guardamos el resultado
        double resultado = multiplica(num1, num2);

        //Mostramos el resultado por pantalla
        System.out.println("El resultado de la multiplicación es: " +resultado);

        sc.close();

    }

    //Definimos la función: recibe dos doubles y devuelve su producto
    public static double multiplica(double a, double b) {
        return a * b;
    }
}