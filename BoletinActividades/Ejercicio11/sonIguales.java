import java.util.Scanner;

public class sonIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedimos por pantalla que se ingresen los datos de la primera yy segunda frase
        System.out.println("Escribe la primera frase");
        String frase1 = scanner.nextLine();
        System.out.println("Escribe la segunda frase");
        String frase2 = scanner.nextLine();

        /*Creamos una condición para el caso de que sea igual o no. Usamos el método equals que compara si dos strings son iguales. Si lo son se imprime por pantalla que son iguales, 
        si no lo son imprime que son diferentes*/

        if (frase1.equals(frase2)) {
            System.out.println("La frase es igual");
        } else {
            System.out.println("La frase es diferente");
        }
    }
}
