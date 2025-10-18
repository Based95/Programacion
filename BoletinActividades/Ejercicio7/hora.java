import java.util.Scanner;
    public class hora {
    public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
         //pedimos que se introduzca la hora en números
       System.out.println("Escribe la hora en números");
       int hora = scanner.nextInt();
         //Usamos switch para traducir la hora de números a letras, si escribimos 0 se ejecutará el caso 0, con 1 el caso 1, etc. Si ninguno de estos casos se ejecuta se ejecutará default
       switch (hora) {
        case 0:
            System.out.println("Son las doce");
            break;
        case 1:
            System.out.println("Es la 1");
            break;
         case 2:
            System.out.println("Son las dos");
            break;
         case 3:
            System.out.println("Son las tres");
            break;
         case 4:
            System.out.println("Son las cuatro");
            break;
         case 5:
            System.out.println("Son las cinco");
            break;
         case 6:
            System.out.println("Son las seis");
            break;
         case 7:
            System.out.println("Son las siete");
            break;
         case 8:
            System.out.println("Son las ocho");
            break;
         case 9:
            System.out.println("Son las nueve");
            break;
         case 10:
            System.out.println("Son las diez");
            break;   
        default:
            System.out.println("Hora introducida no válida");
            break;
       }

    }
}