import java.util.Scanner;

public class nota10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float notaIntroducida = 0;
        int notaDiez = 0;
        int numNotas = 0;

        System.out.println("Introduce las notas, para finalizar introduce -1");

        notaIntroducida = sc.nextFloat();

        while (notaIntroducida != -1) {
            numNotas++;
            if (notaIntroducida == 10) {
                notaDiez++;
            }
        
        System.out.println("Introduce la siguiente nota, para finalizar introduce -1");
        notaIntroducida = sc.nextFloat();
        }

        System.out.println("El número de notas total es " +numNotas +" y el número de dieces en la clase es de: " +notaDiez);
    }


}
