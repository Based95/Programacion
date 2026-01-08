public class ejercicio14 {
    public static void main(String[] args) {
        
        //Creamos el array con el tamaño exacto (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55)
        int[] secuencia = new int[55];
        
        int posicion = 0;


        for (int valor = 1; valor <= 10; valor++) {
            

            for (int veces = 0; veces < valor; veces++) {
                
                secuencia[posicion] = valor; 
                posicion++; 
            }
        }

        System.out.println("Secuencia generada:");
        for (int i = 0; i < secuencia.length; i++) {
            System.out.print(secuencia[i] + " ");
        }
    }
}