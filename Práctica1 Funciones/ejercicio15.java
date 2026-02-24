public class ejercicio15 {
    public static void main(String[] args) {
        // Creamos el array de tamaño 100
        int[] numeros = new int[100];

        // Lo rellenamos con los primeros 100 números 
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }

        // Usamos las funciones para calcular los resultados
        int sumaTotal = calcularSuma(numeros);
        double mediaTotal = calcularMedia(numeros);

        // 4. Mostramos los resultados
        System.out.println("La suma total de los números es: " + sumaTotal);
        System.out.println("La media de los números es: " + mediaTotal);
    }

    // Función que recibe un array de enteros y devuelve la suma (int)
    public static int calcularSuma(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    // Función que recibe un array de enteros y devuelve la media (double)
    public static double calcularMedia(int[] array) {
        int suma = calcularSuma(array);
        return (double) suma / array.length;
    }
}