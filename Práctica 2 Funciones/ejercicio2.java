import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu número de DIN sin letra:");
        int dni = sc.nextInt();

        char letras = calcularLetra(dni);

        System.out.println("La letra de tu DNI es: " + letras);

        sc.close();

        
    }
    public static char calcularLetra(int dni){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int resto = dni % 23;

        return letras.charAt(resto);
    }
}
