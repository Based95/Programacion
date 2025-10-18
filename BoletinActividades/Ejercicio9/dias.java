import java.util.Scanner;
public class dias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Pedimos que se introduzca el día, mes y año. Damos instrucciones imprimiendo en pantalla los textos "Introduce la primera fecha" y Introduce la segunda fecha
        System.out.println("---Introduce la primera fecha---");
        System.out.println("Escribe un día");
        int dia1 = scanner.nextInt();
        System.out.println("Escribe un mes");
        int mes1 = scanner.nextInt();
        System.out.println("Escribe un año");
        int anio1 = scanner.nextInt();
        //Pedimos el día, mes yu año de la segunda fecha
        System.out.println("---Introduce la segunda fecha---");
        System.out.println("Escribe un día");
        int dia2 = scanner.nextInt();
        System.out.println("Escribe un mes");
        int mes2 = scanner.nextInt();
        System.out.println("Escribe un año");
        int anio2 = scanner.nextInt();
        //Para calcular el total convertimos meses y años a días
        int totalDias1 = dia1 + (mes1 * 30) + (anio1 * 360); 
        int totalDias2 = dia2 + (mes2 * 30) + (anio2 * 360);
        //Para saber la diferencia restamos a los días de año1 los de año2. Usamos Math.abs  para que siempre nos devuelva un valor positivo.
        System.out.println("La diferencia de dias es de " + Math.abs(totalDias1 - totalDias2));

    }
}
