import java.util.Scanner;
import java.util.Arrays; 

public class ejercicio15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduce el tamaño del array (N): ");
        int n = sc.nextInt();

        System.out.print("Introduce el valor a rellenar (M): ");
        int m = sc.nextInt();

  
        int[] miArray = new int[n];

        Arrays.fill(miArray, m);

        System.out.println("Resultado:");
        System.out.println(Arrays.toString(miArray));
        sc.close();
    }
}