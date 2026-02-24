import java.util.Scanner;

public class BrechaSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de personas
        System.out.println("Introduce el número de empleados (N): ");
        int n = sc.nextInt();

        // Creamos la matriz: N filas y 2 columnas
        double[][] empleados = new double[n][2];

        // Leemos los datos
        for (int i = 0; i < n; i++) {
            System.out.println("Empleado " + (i + 1) + ":");

            // Validamos el genero
            int genero;
            do {
                System.out.println("Género (0 para varón, 1 para mujer): ");
                genero = sc.nextInt();
            } while (genero != 0 && genero != 1);

            empleados[i][0] = genero;

            System.out.println("Sueldo: ");
            empleados[i][1] = sc.nextDouble();
        }

        // Calculamos el sueldo medio
        double sumaHombres = 0, sumaMujeres = 0;
        int contHombres = 0, contMujeres = 0;

        for (int i = 0; i < n; i++) {
            if (empleados[i][0] == 0) { // si es hombre
                sumaHombres += empleados[i][1];
                contHombres++;
            } else { // es mujer
                sumaMujeres += empleados[i][1];
                contMujeres++;
            }
        }
        // Mostramos los resultados por pantalla
        System.out.println("--Informe de sueldos--");

        if (contHombres > 0) {
            System.out.println("Sueldo medio de los varones: " + (sumaHombres / contHombres));
        } else {
            System.out.println("No se han registrado varones.");
        }
        if (contMujeres > 0) {
            System.out.println("Sueldo medio de las mujeres: " + (sumaMujeres / contMujeres));
        } else {
            System.out.println("No se han registrado mujeres");
        }

        sc.close();
    }
}
