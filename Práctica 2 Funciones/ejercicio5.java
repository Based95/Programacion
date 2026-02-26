import java.util.Scanner;

public class ejercicio5 {

    // Declaramos el Scanner a nivel de clase (static) para usarlo en cualquier función
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        // Bucle para repetir el menú hasta que elijamos la opción 5
        do {
            opcion = menu();

            // Si la opción es del 1 al 4, pedimos el radio y hacemos los cálculos
            if (opcion >= 1 && opcion <= 4) {
                double radio = pideRadio();

                switch (opcion) {
                    case 1:
                        System.out.println("La circunferencia es: " + circunferencia(radio));
                        break;
                    case 2:
                        System.out.println("El área es: " + area(radio));
                        break;
                    case 3:
                        System.out.println("El volumen es: " + volumen(radio));
                        break;
                    case 4:
                        System.out.println("Circunferencia: " + circunferencia(radio));
                        System.out.println("Área: " + area(radio));
                        System.out.println("Volumen: " + volumen(radio));
                        break;
                }
            } else if (opcion == 5) {
                System.out.println("¡Saliendo del programa!");
            } else {
                System.out.println("Opción no válida. Por favor, elige un número del 1 al 5.");
            }
            
            System.out.println();

        } while (opcion != 5);

        sc.close();
    }


    public static int menu() {
        System.out.println("=== MENÚ DE GEOMETRÍA ===");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        
        return sc.nextInt();
    }

    public static double pideRadio() {
        System.out.print("Introduce el radio de la esfera/círculo: ");
        return sc.nextDouble();
    }

    public static double circunferencia(double r) {
        // Fórmula: 2 * pi * r
        return 2 * Math.PI * r;
    }

    public static double area(double r) {
        // Fórmula: pi * r^2
        return Math.PI * Math.pow(r, 2);
    }

    public static double volumen(double r) {
        // Fórmula: (4/3) * pi * r^3
        // ¡OJO! Usamos 4.0 / 3.0 para que Java haga una división con decimales.
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}