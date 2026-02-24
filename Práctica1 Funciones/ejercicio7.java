import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // pedimos los datos
        System.out.println("Introduce el ancho del rectangulo: ");
        double ancho = sc.nextDouble();
        System.out.println("Introduce el alto del rectangulo: ");
        double alto = sc.nextDouble();

        // Usamos las funciones y guardamos los resultados
        double a = areaRectangulo(ancho, alto);
        double p = perimetroRectangulo(ancho, alto);

        // Mostramos los resultados
        System.out.println("--Datos del rectángulo--");
        System.out.println("Area :" + a);
        System.out.println("Perímetro :" + p);
        sc.close();
    }

    // función para el perímetro. Suma de los lados * 2
    public static double perimetroRectangulo(double ancho, double alto) {
        return 2 * (ancho + alto);
    }

    // Función para el area. Base * altura
    public static double areaRectangulo(double ancho, double alto) {
        return ancho * alto;
    }
}
