import java.util.Scanner;

public class lados {
    public static void main(String[] args) {
        //creamos el scanner
        Scanner scanner = new Scanner(System.in);
        //pedimos y asiganamos los 3 lados
        System.out.println("---Inserte el primer lado---");
        double priLado = scanner.nextDouble();
        System.out.println("---Inserte el segundo lado---");
        double segLado = scanner.nextDouble();
        System.out.println("---Inserte el tercer lado---");
        double terLado = scanner.nextDouble();
        //Calculamos el semiperímetro, usamos 2.0 en vez de 2 para que calcule con decimales.
        double SP = (priLado + segLado + terLado) / 2.0;
        double area = Math.sqrt(SP * (SP - priLado) * (SP - segLado) * (SP - terLado));

        System.out.println("El valor de SP es " +SP);
        System.out.println("El valor del area es " +area);
        
        scanner.close();
    }
    
}
