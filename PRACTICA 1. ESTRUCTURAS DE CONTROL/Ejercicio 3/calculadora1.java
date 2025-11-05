import java.util.Scanner;
public class calculadora1 {
   public static void main(String[] args) {
//Creamos el Scanner
    Scanner sc = new Scanner(System.in);
//Pedimos por pantalla los números y cerramos el Scanner  
    System.out.println("---Escribe el primer número---");
    double x = sc.nextDouble();
    System.out.println("---Escribe el segundo número---");
    double y = sc.nextDouble();
    sc.close();
//Hacemos las operaciones
    double suma = x + y;
    double resta = x - y;
    double mult = x * y;
//Mostramos por pantalla el resultado
    System.out.println("La suma es: " +suma);
    System.out.println("La resta es: " +resta);
    System.out.println("El producto es: " +mult);
    //En el caso de que y==0 tendríamos un problema ya que no se puede dividir por 0, para evitar que se calcule si es 0 lo metemos dentro de if, si el valor y!=0 se calcula normalmente.
    if (y==0){
        System.out.println("Error, dividiendo por 0!");
    } else {double division = x / y;
    System.out.println("La división es: " +division);
    }

   } 
}
