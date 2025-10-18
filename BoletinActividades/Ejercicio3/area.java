import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        //definimos las variables
        //Usaremos double para que admita decimales, con Int no da el resultado exacto
        double num1;
        double total;

        //Usamos la libreria Scanner para leer datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        num1 = entrada.nextInt();

        total = num1 * num1 * (double)Math.PI;
        System.out.println("La area es: " + total);
    }
}
