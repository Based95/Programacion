import java.util.Scanner;

public class noNulo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean negativo = false;
        int contador = 1;
        int numIntroducido = 1;
        int contadorNeg = 0;
        int contadorPos = 0;

        for (contador=1; numIntroducido !=0; contador++) {
            System.out.println("---Escribe números positivos o negativos, cuando pulses 0 verás cuantos hay de cada---: ");
            numIntroducido = sc.nextInt();
            if (numIntroducido < 0) {
                    negativo = true;
                    contadorNeg++;
                } else {contadorPos++;}
            }
                
            System.out.println("Hay " +contadorPos +" números positivos y " +contadorNeg +" números negativos");
        
        }

}