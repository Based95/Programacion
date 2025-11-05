import java.util.Scanner;
public class mayor {
    public static void main(String[] args) {
//Creamos el Scanner     
    Scanner sc = new Scanner(System.in);
//Pedimos los números por pantalla, usaremos INT para números enteros
    System.out.println("---Escribe el primer número---");
    int x = sc.nextInt();
    System.out.println("---Escribe el segundo número---");
    int y = sc.nextInt();

    sc.close();
//Podría pasar que ingresen el mismo número para ambas variables, creamos la condición x==y
    if (x == y) {
        System.out.println("Los dos números son iguales!");
    }
    //vemos si x > y
    else if (x > y) {
        System.out.println("El mayor es: " +x);
    }
    //si x no es mayor que y, solo queda la posibilidad de que y sea mayor que x, escribimos else
    else {
        System.out.println("El mayor es: " +y);
    }
    }
}
