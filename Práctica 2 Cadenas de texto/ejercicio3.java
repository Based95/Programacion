import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedimos los datos
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu primer apellido: ");
        String apellido1 = sc.nextLine();

        System.out.print("Introduce tu segundo apellido: ");
        String apellido2 = sc.nextLine();

        // Extraemos las 3 primeras letras de cada uno
        // El método .substring(0, 3) coge los caracteres desde la posición 0 hasta la 2
        String parte1 = nombre.substring(0, 3);
        String parte2 = apellido1.substring(0, 3);
        String parte3 = apellido2.substring(0, 3);

        // Unimos todo
        String codigo = parte1 + parte2 + parte3;

        // Convertimos a mayúsculas
        codigo = codigo.toUpperCase();

        System.out.println("El código generado es: " + codigo);

        sc.close();
    }
}