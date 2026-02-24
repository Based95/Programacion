public class Matriz5 {
    public static void main(String[] args) {

        // Declaramos de la matriz. Los dos corchetes indican que es una matriz (2
        // dimensiones). Si fuera solo [] sería una lista simple.
        // int[filas][columnas]
        int[][] matriz = new int[5][5];

        // Creamos una variable para llevar la cuenta de los números del 1 al 25
        int contador = 1;

        // Llenamos la matriz
        for (int i = 0; i < 5; i++) { // Recorre las filas (0 a 4)
            for (int j = 0; j < 5; j++) { // Recorre las columnas (0 a 4)
                matriz[i][j] = contador; // Asigna el número actual
                contador++; // Aumenta el contador para el siguiente
            }
        }

        // Mostramos la matriz por pantalla
        System.out.println("--- Matriz 5x5 ---");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Imprimimos el número seguido de una tabulación (\t)
                // Usamos 'print' en lugar de 'println' para que sigan en la misma línea
                System.out.print(matriz[i][j] + "\t");
            }
            // Al terminar una fila (el bucle interno), hacemos un salto de línea
            System.out.println();
        }
    }
}