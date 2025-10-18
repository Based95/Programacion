import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        //definimos las variables
        int num1;
        int num2;
        int total;

        //Usamos la libreria Scanner para leer datos
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();  

        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        total = num1 + num2;
        System.out.println("La suma es: " + total);
    }
}
