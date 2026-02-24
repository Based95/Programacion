import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pedimos la edad

        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();

        //Usamos la función dentro de un if
        if (esMayorEdad(edad)){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("No es mayor de edad");
        }
        sc.close();
    }

    public static boolean esMayorEdad(int a) {
        if (a>=18){
            return true;
        }else{
            return false;
        }
    }
}
