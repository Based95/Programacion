import java.util.Scanner;

public class millas {
    
    public static void main(String[] args) {
        //creamos el scanner
        Scanner scanner = new Scanner(System.in);
        //pedimos por pantalla la distancia en millas
        System.out.println("---Escribe la distancia en millas---");
        //declaramos la variable millas
        double millas = scanner.nextDouble();
        //cerramos el scanner
        scanner.close();

        //calculamos la distancia en metros. 
        double metros = millas * 1852;
        //imprimimos el resultado en pantalla
        System.out.println("La distancia en metros es " +metros);
        
    }
}
