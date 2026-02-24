import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el día: ");
        int d = sc.nextInt();
        System.out.print("Introduce el mes: ");
        int m = sc.nextInt();
        System.out.print("Introduce el año: ");
        int a = sc.nextInt();

        // Llamamos a la función y mostramos si es válida o no
        if (fechaCorrecta(d, m, a)) {
            System.out.println("La fecha es CORRECTA.");
        } else {
            System.out.println("La fecha es INCORRECTA.");
        }

        sc.close();
    }

    // Función que devuelve true si la fecha cumple las reglas
    public static boolean fechaCorrecta(int dia, int mes, int año) {
        //  El mes debe estar entre 1 y 12
        if (mes < 1 || mes > 12) {
            return false;
        }
        
        //  El día debe estar entre 1 y 30 
        if (dia < 1 || dia > 30) {
            return false;
        }

        //  El año no puede ser negativo 
        if (año < 0) {
            return false;
        }

        // Si ha pasado todos los filtros anteriores, es que está bien
        return true;
    }
}