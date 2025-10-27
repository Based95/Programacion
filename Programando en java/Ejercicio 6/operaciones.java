import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        
        //Creamos el scanner
        Scanner scanner = new Scanner(System.in);
        //Pedimos X y asignamos el valor
        System.out.println("---Inserte el valor de X---");
        double x = scanner.nextDouble();
        //Pedimos Y y asignamos el valor
        System.out.println("---Inserte el valor de Y---");
        double y = scanner.nextDouble();
        
        //Realizamos las operaciones
        double suma = x + y;
        double resta = x - y;
        double multiplicacion = x * y;
        double division = x / y;
        double potencia = Math.pow(x, 2);
        double raiz = Math.sqrt(x);
        //Imprimimos por pantalla el resultado
        System.out.println("x = " +x +" y = " +y);
        System.out.println("x + y = " +suma);
        System.out.println("x - y = " +resta);
        System.out.println("x * y = " +multiplicacion);
        System.out.println("x / y = " +division);
        System.out.println("x^2 = " +potencia);
        //No he encontrado la forma de mostrar el símbolo de raiz cuadrada en pantalla.
        System.out.println("raiz cuadrada de x = " +raiz);
        //cerramos el Scanner
        scanner.close();

    }
}
