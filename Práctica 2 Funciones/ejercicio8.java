public class ejercicio8 {

    public static void main(String[] args) {
        int[] numeros = {15, 42, 8, 99, 23};

        System.out.println("Array a analizar: [15, 42, 8, 99, 23]");

        // Le pasamos el array y le decimos que empiece a buscar desde la posición 0
        int maximo = encontrarMaximo(numeros, 0);
        int minimo = encontrarMinimo(numeros, 0);

        System.out.println("El número MÁXIMO es: " + maximo);
        System.out.println("El número MÍNIMO es: " + minimo);
    }

    //  FUNCIÓN PARA EL MÁXIMO 
    public static int encontrarMaximo(int[] arr, int indice) {
        // Si hemos llegado al último número del array, 
        // no hay nada más que comparar, así que devolvemos ese número directo.
        if (indice == arr.length - 1) {
            return arr[indice];
        }

        // Llamada recursiva: Le pasamos los datos al clon.
        // Busca el máximo del resto del array (avanzando el índice + 1)
        int maxDelResto = encontrarMaximo(arr, indice + 1);

        // Cuando los clones terminan y vuelven con un ganador, 
        // lo comparamos con nuestro número actual.
        if (arr[indice] > maxDelResto) {
            return arr[indice]; // Si el mío es mayor, gano yo
        } else {
            return maxDelResto; // Si el del clon es mayor, gana el clon
        }
    }

    // FUNCIÓN PARA EL MÍNIMO
    public static int encontrarMinimo(int[] arr, int indice) {
        if (indice == arr.length - 1) {
            return arr[indice];
        }

        int minDelResto = encontrarMinimo(arr, indice + 1);

        //(Solo cambia el signo '<' respecto a la otra función)
        if (arr[indice] < minDelResto) {
            return arr[indice];
        } else {
            return minDelResto;
        }
    }
}