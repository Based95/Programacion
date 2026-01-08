import java.util.Arrays;

public class ejercicio18 {
    public static void main(String[] args) {
        
        int[] numeros = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 10);
        }

        System.out.println("--- Array Original (Desordenado) ---");
        System.out.println(Arrays.toString(numeros));

  
        Arrays.sort(numeros);

        System.out.println("--- Array Ordenado ---");
        System.out.println(Arrays.toString(numeros));
    }
}