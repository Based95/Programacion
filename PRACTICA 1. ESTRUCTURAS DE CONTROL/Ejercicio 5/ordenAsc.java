import java.util.Scanner;
public class ordenAsc {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
// Pedimos los datos
    System.out.println("---Escribe el primer número---");
    int x = sc.nextInt();
    System.out.println("---Escribe el segundo número---");
    int y = sc.nextInt();
    sc.close();
// Comparamos x con y, si x es mayor se ejecuta la primera condición, si no, al quedar solo una opción (que y sea mayor) ponemos simplemente else
    if (x < y) {
        System.out.println("El órden de menor a mayor es: " +x +"," +y);
    }
    else {
        System.out.println("El órden de menor a mayor es: " +y +" , " +x);
    }
 }   
}
