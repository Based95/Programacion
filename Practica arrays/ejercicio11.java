public class ejercicio11 {
    public static void main(String[] args) {
        
        int[] ascendente = new int[100];
        int[] descendente = new int[100];

        for (int i = 0; i < 100; i++) {
            ascendente[i] = i + 1; 
        }

        for (int i = 0; i < 100; i++) {
    
            descendente[i] = ascendente[99 - i];
        }

        System.out.println("--- RESULTADOS ---");
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Posición " + i + ": ");
            System.out.print("Normal: " + ascendente[i]);
            System.out.println(" | Inverso: " + descendente[i]);
        }
    }
}