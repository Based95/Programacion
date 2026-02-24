public class tablasMultiplicar {
    public static void main(String[] args) {
        
        //definimos la matrix
    
        int [][] matriz = new int [10][10];

        //llenamos la matriz con las tablas de multiplicar

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //i + 1 es el número de la tabla (1 al 10)
                //j + 1 es el multiplicador (1 al 10)
                matriz[i][j] = (i + 1) * (j + 1);
            }
        }

        //mostramos la matriz por pantalla
        System.out.println("--Tablas de multiplicar del 1 al 10--");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //usamos printf para que los números queden alineados en columnas
                System.out.printf("%4d", matriz[i][j]);
            }
            // Salto de línea al terminar cada fila (cada tabla)
            System.out.println();
        }

    }
}
