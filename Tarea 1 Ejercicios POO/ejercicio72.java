import java.util.Scanner;

public class ejercicio72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre para la primera persona:");
        Persona p1 = new Persona();
        p1.nombre = sc.nextLine();
        System.out.println("Introduce los apellidos para la primera persona:");
        p1.apellidos = sc.nextLine();
        System.out.println("Introduce el dni para la primera persona:");
        p1.dni = sc.nextLine();
        System.out.println("Introduce la edad para la primera persona:");
        p1.edad = sc.nextInt();
        sc.nextLine();
        // usamos un operador ternario para saber si es mayor de eada
        String mayorp1 = (p1.edad >= 18) ? " es mayor de edad" : " no es mayor de edad";

        System.out.println("Introduce el nombre para la segunda persona:");
        Persona p2 = new Persona();
        p2.nombre = sc.nextLine();
        System.out.println("Introduce los apellidos para la segunda persona:");
        p2.apellidos = sc.nextLine();
        System.out.println("Introduce el dni para la segunda persona:");
        p2.dni = sc.nextLine();
        System.out.println("Introduce la edad para la segunda persona:");
        p2.edad = sc.nextInt();
        sc.nextLine();

        sc.close();

        String mayorp2 = (p2.edad >= 18) ? " es mayor de edad" : " no es mayor de edad";

        System.out.println(
                p1.nombre + " " + p1.apellidos + ", con DNI " + p1.dni + " y con " + p1.edad + " años" + mayorp1);
        System.out.println(
                p2.nombre + " " + p2.apellidos + ", con DNI " + p2.dni + " y con " + p2.edad + " años" + mayorp2);

    }
}
