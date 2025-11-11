import java.util.Scanner;

public class adivinarNum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float limiteInferior = 0;
        float limiteSuperior = 100;
        float intentoActual;
        boolean adivinado = false;
        String respuesta;

        System.out.println("Piensa en un número, indica si el número es mayor o menor y el ordenador intentará adivinarlo");

        while(!adivinado) {
            intentoActual = (limiteInferior + limiteSuperior) / 2;
            System.out.println("El número es " +intentoActual +"?");
            System.out.println("Pulsa + o - para indicar si tu número es mayor o menor, si lo adivina pulsa =");
            respuesta = sc.nextLine();
                if (respuesta.equals("-")) {
                    limiteSuperior = intentoActual;
                    System.out.println("Ajustando el rango de números de " +limiteInferior +" a " +limiteSuperior);
                }else if (respuesta.equals("+")) {
                    limiteInferior = intentoActual;
                    System.out.println("Ajustando el rango de números de " +limiteInferior +" a " +limiteSuperior);
                } else if (respuesta.equals("=")) {
                    adivinado = true;
                    System.out.println("Número adivinado!");
                    System.out.println("El número en el que estabas pensando era: " +intentoActual);
                }
                sc.close();
        }
        
    }
}
