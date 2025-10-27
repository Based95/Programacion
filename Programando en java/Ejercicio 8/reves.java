import java.util.Scanner;
public class reves {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //pedimos el número por pantalla
        System.out.print("Ingrese un número de 0 a 9999: ");
        
        // Leemos el número introducido por el usuario
        int numero = scanner.nextInt();
        
        //Creamos un buclo por si se introduciera un valor menor que 0 o mayor que 9999, se vuelve a pedir el numero y se sale del bucle cuando el valor está dentro del rango que pedimos
        while (numero < 0 || numero > 9999) {
            System.out.println("Error, el número está fuera de rango, ingréselo de nuevo ");
            numero = scanner.nextInt();
        }
        // Variable para construir el número al revés
        int numeroReverso = 0;
    
        //Repetimos el proceso mientras queden dígitos por procesar (mientras numero > 0)
        while (numero > 0) {
            
            //Usamos el módulo % para obtener el último dígito
            int ultimoDigito = numero % 10;
            
            //Multiplicamos el númeroReverso actual por 10 (para mover los dígitos a la izquierda) y le sumamos el último dígito
            numeroReverso = (numeroReverso * 10) + ultimoDigito;
            
            //Usamos la división entera / para quitar el último dígito
            numero = numero / 10;
        }
        
        //Mostramos el resultado en pantalla
        System.out.println("El número con las cifras al revés es: " + numeroReverso);
        
        scanner.close();
    }
    
}
