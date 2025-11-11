public class sumaProdNaturales {
    public static void main(String[] args) {
        
        int contador = 1;
        int suma = 0;
        int producto = 1;
        

    for (contador=1; contador <= 10; contador++) {
        suma += contador;
        producto *= contador;
        System.out.println("Suma nº" +contador +": " +suma);
        System.out.println("Producto nº" +contador +": " +producto);
    }
     System.out.println("La suma de los primeros 10 números naturales es: " +suma);   
     System.out.println("El producto de los primeros 10 números naturales es: " +producto); 
    }
}
