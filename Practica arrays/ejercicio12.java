import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        String opcion = "";

        do {
            System.out.println("--- MENÚ PRINCIPAL ---");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = sc.next();

            switch (opcion) {
                case "a":
                    System.out.println("Valores actuales del array:");
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Posición " + i + ": " + numeros[i]);
                    }
                    break; 

                case "b":
                    System.out.print("Dime la posición (0 al 9): ");
                    int p = sc.nextInt();
                    
                    System.out.print("Dime el valor a guardar: ");
                    int v = sc.nextInt();

                    if (p >= 0 && p <= 9) {
                        numeros[p] = v; 
                        System.out.println("¡Valor guardado correctamente!");
                    } else {
                        System.out.println("ERROR: La posición debe ser entre 0 y 9.");
                    }
                    break;

                case "c":
                    System.out.println("¡Adiós!");
                    break;

                default:
                    System.out.println("Opción no válida. Prueba otra vez.");
            }

        
        } while (!opcion.equals("c")); 
        sc.close();
    }
}