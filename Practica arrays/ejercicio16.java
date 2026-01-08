import java.util.Arrays;

public class ejercicio16 {
    public static void main(String[] args) {
        
        int[] secuencia = new int[55];
        
        int inicio = 0;

        for (int valor = 1; valor <= 10; valor++) {

            int fin = inicio + valor;

            Arrays.fill(secuencia, inicio, fin, valor);

            inicio = fin;
        }

        System.out.println(Arrays.toString(secuencia));
    }
}