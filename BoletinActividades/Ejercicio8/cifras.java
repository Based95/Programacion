import java.util.Scanner;
public class cifras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //pedimos que se introducza un número del 0 al 9999
        System.out.println("Escribe un número del 0 al 9999");
        //asignamos a la variable cifras el valor introducido
        int cifras = scanner.nextInt();
        //creamos una cadena de texto para averiguar cuantas cifras tiene. valueOf convierte la variable cifras en una cadena de texto
        String cifra = String.valueOf(cifras);
        //Creamos la variable numCifras y usamos length para que nos devuelva la cantidad de caracteres
        int numCifras = cifra.length();
        //Pedimo que imprima por pantalla la respuesta
        System.out.println("El número de cifras es " + numCifras);
    }
    
}
