import java.util.Scanner;

public class notas {
    public static void main(String[] args) {    
     Scanner entrada = new Scanner(System.in);
 
         int nota;
         System.out.println("Ingrese la nota del alumno entre 0 y 10: ");
         nota = entrada.nextInt();

         if (nota<0 || nota>10) {
             System.out.println("Error, la nota debe estar entre 0 y 10");
         } else if (nota<5) {
             System.out.println("Insuficiente");
         } else if (nota==5) {
             System.out.println("Suficiente");
         } else if (nota==6) {
             System.out.println("Bien");
         } else if (nota==7 || nota==8) {
             System.out.println("Notable");
         } else {
             System.out.println("Sobresaliente");
         }
    }
}