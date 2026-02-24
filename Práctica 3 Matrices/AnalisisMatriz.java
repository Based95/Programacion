import java.util.Scanner;

public class AnalisisMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir dimensiones N y M
        System.out.print("Introduce el número de filas (N)");
        int n = sc.nextInt();
        System.out.print("Introduce el número de filas (M)");
        int m = sc.nextInt();

        // Creamos la matriz con el valor introducido
        int[][] matriz = new int[n][m];

        // Introducimos los valores por teclado
        System.out.println("Introduce los valores de la matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Recorremos la matriz y clasificamos los valores
        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] > 0) {
                    mayoresCero++;
                } else if (matriz[i][j] < 0) {
                    menoresCero++;
                } else {
                    igualesCero++;
                }
            }
        }

        // Mostramos los resultados
        System.out.println("--Resultados--");
        System.out.println("Valores mayores que cero: " + mayoresCero);
        System.out.println("Valores menores que cero: " + menoresCero);
        System.out.println("Valores iguales que cero: " + igualesCero);

        sc.close();

    }
}
