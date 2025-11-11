import java.util.Scanner;

public class elevarCuadrado {
    public static void main(String[] args) {
        
        long resultado = 1;
        int contador = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor que quieres elevar");
        int num = sc.nextInt();
        System.out.println("Introduce el valor al que se va a elevar");
        int elevado = sc.nextInt();

        for(contador = 1; contador<=elevado; contador++) {
            resultado = num*resultado;
        }
        System.out.println("El resultado es: " +resultado);
        sc.close();
    }
}