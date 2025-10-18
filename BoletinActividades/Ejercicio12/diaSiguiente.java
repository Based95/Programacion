import java.util.Scanner;

public class diaSiguiente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Escribe la fecha---");
        System.out.println("Escribe el día");
        int dia = scanner.nextInt();
        System.out.println("Escribe el mes");
        int mes = scanner.nextInt();
        System.out.println("Escribe el año");
        int anio = scanner.nextInt();

        if (dia == 30 && mes == 12) {
            dia = 1;
            mes = 1;            
            anio++;
        }   else if (dia == 30) {
            dia = 1;
            mes++;
        }
            else {
            dia++;
            }

        System.out.println("Mañana será " + dia + "/" + mes + "/" + anio);
    }

    
}
