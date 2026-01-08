import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
           
            // "Math.random()*10" genera de 0.0 a 9.999. "+1" transforma de 1.0 a 10.999. 
            // "(int)" quita los decimales, se queda el entero (1 al 10).
    
            numeros[i] = (int)(1 + Math.random() * 10);
        }

        System.out.print("Introduce un número (N) entre 1 y 10 para buscar sus posiciones: ");
        int n = sc.nextInt();

        System.out.println("El número " + n + " aparece en las siguientes posiciones (índices):");
        
        boolean numNoValido = false; 

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == n) {
                System.out.print(i + " "); 
                numNoValido = true;
            }
        }
        
        System.out.println(); 

        if (!numNoValido) {
            System.out.println("El número no aparece en el array.");
        }
        sc.close();
    }
}