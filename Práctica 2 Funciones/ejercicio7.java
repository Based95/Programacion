import java.util.Arrays;

public class ejercicio7 {

    public static void main(String[] args) {
        //  nivel base 
        int[] base = {1, 2, 3, 4, 5};
        
        System.out.println("Output:");
        imprimirTriangulo(base);
    }

    //  Función recursiva que calcula las sumas y dibuja el triángulo de arriba a abajo.
   
    public static void imprimirTriangulo(int[] arr) {
        // Si el array ya no tiene elementos, paramos.
        if (arr.length < 1) {
            return;
        }

        // Preparamos el siguiente nivel (un elemento menos que el actual)
        int[] nivelSuperior = new int[arr.length - 1];

        // Calculamos las sumas de los números adyacentes
        for (int i = 0; i < arr.length - 1; i++) {
            nivelSuperior[i] = arr[i] + arr[i + 1];
        }

        //  Pasamos la información al siguiente nivel antes de imprimir
        imprimirTriangulo(nivelSuperior);

        // Como esta línea está debajo de la llamada recursiva,
        // el programa se queda "pausado" aquí. Solo cuando llegue a la punta
        // del triángulo empezará a imprimir deshaciendo el camino hacia atrás.
        System.out.println(Arrays.toString(arr));
    }
}