import java.util.Scanner;

public class noNulo2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean negativo = false;
        int contador = 1;
        int numIntroducido = 0;
        int contadorNeg = 0;

        for (contador=1; contador <=10; contador++) {
            System.out.println("---Escribe el número " +contador +" de 10: ");
            numIntroducido = sc.nextInt();
            if (numIntroducido < 0) {
                    negativo = true;
                    contadorNeg++;
                }
            }
                

        if (negativo) {
            System.out.println("Se han encontrado números negativos y son " +contadorNeg +" números");
        } else {System.out.println("No se han encontrado números negativos");}
        
        }

}

