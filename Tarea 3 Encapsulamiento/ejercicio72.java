import java.util.Scanner;

public class ejercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre para la primera persona:");
        String nombre1 = sc.nextLine();
        System.out.println("Introduce los apellidos para la primera persona:");
        String apellidos1 = sc.nextLine();
        System.out.println("Introduce el dni para la primera persona:");
        String dni1 = sc.nextLine();
        System.out.println("Introduce la edad para la primera persona:");
        int edad1 = sc.nextInt();
        sc.nextLine();

        Persona p1 = new Persona(dni1, nombre1, apellidos1, edad1);
        // usamos un operador ternario para saber si es mayor de eada
        String mayorp1 = (p1.getEdad() >= 18) ? " es mayor de edad" : " no es mayor de edad";

        System.out.println("Introduce el nombre para la segunda persona:");
        String nombre2 = sc.nextLine();
        System.out.println("Introduce los apellidos para la segunda persona:");
        String apellidos2 = sc.nextLine();
        System.out.println("Introduce el dni para la segunda persona:");
        String dni2 = sc.nextLine();
        System.out.println("Introduce la edad para la segunda persona:");
        int edad2 = sc.nextInt();
        sc.nextLine();

        Persona p2 = new Persona(dni2, nombre2, apellidos2, edad2);
        sc.close();

        String mayorp2 = (p2.getEdad() >= 18) ? " es mayor de edad" : " no es mayor de edad";

        System.out.println(
                p1.getNombre() + " " + p1.getApellidos() + ", con DNI " + p1.getDni() + " y con " + p1.getEdad()
                        + " años" + mayorp1);
        System.out.println(
                p2.getNombre() + " " + p2.getApellidos() + ", con DNI " + p2.getDni() + " y con " + p2.getEdad()
                        + " años" + mayorp2);

    }
}
