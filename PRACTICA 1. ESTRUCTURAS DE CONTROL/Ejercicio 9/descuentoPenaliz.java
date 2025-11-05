import java.util.Scanner;

public class descuentoPenaliz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Definimos la penalización (2) y el precio mínimo que se tiene que superar para que no se aplique (30)
        double penalizacion = 2;
        double limitePenalizacion = 30;
// Pedimos el precio del producto
        System.out.println("---Escribe el precio del producto");
        double precioProd = sc.nextDouble();
        sc.close();
// Creamos la condición, si el precio es menor que 30 se le suma la penalización.
        if (precioProd < limitePenalizacion) {
            double precioFinal = precioProd + penalizacion;
            System.out.println("El precio final es: " +precioFinal);
// Si se supera el umbral de 30, no se aplica ninguna penalización, el precio final será el mismo que el del producto
        }
        else {
            System.out.println("El precio del producto es: " +precioProd);
        }
    }
}

