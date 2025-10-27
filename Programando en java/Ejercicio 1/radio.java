import java.util.Scanner;

public class radio {

    public static void main(String[] args) {
        //creamos el scanner//
        Scanner scanner = new Scanner(System.in);
        //pedimos los datos por pantalla
        System.out.println("---Escribe el radio---");
        //declaramos que la variable radio es un doble y que va a ser el valor que se ingrese por pantalla
        double radio = scanner.nextDouble();
        //cerramos el scanner si no lo necesitamos como buena práctica
        scanner.close();
        //hacemos las operaciones con el método Math
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        //Importante poner uno o ambos valores en decimal (4.0, 3.0) para forzar que la devisión devuelva decimales, si simplemente ponemos 4 y 3 calculará una división de enteros y se perderán los decimales
        double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
        //Imprimimos por pantalla el resultado
        System.out.println("La longitud de de la circunferencia es " + longitud);
        System.out.println("El área dela círculo es " + area);
        System.out.println("El volumen de la esfera es " + volumen);

    }
    
}
