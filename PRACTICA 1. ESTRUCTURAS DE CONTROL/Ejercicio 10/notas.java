import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
// Pedimos la nota por pantalla
        System.out.println("---Ingresa la nota---");
// Usaremos double por si la nota tiene decimales
        double nota = sc.nextDouble();
        sc.close();
// Excluimos las notas menores de 0 y mayores de 10 y creamos las condiciones para cada calificación
        if (nota > 10 || nota <0) {
            System.out.println("Error, nota no válida");
        }
        else if (nota >= 9) {
            System.out.println("SOBRESALIENTE!");
        }
        else if (nota >= 6) {
            System.out.println("Notable");
        }
        else if (nota >= 5) {
            System.out.println("Bien");
        }
        else if (nota >= 3) {
            System.out.println("Insuficiente");
        }
        else {
            System.out.println("Muy deficiente :c");
        }
    }
}
