import java.util.Scanner;
public class ecuacion {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    //despejamos la ecuación C1X + C2 = 0, C1x = -C2, x = -(C2/C1)
    System.out.println("---Ingrese C1---");
    double C1 = scanner.nextDouble();

    System.out.println("---Ingrese C2---");
    double C2 = scanner.nextDouble();
    /*En el caso en el que C1 fuera "0" daría un error (no se puede dividir entre "0", creamos el caso con if para C1=0. Se puede dar el caso de que si C2 es también 0  daría lugar a
     * infinitas soluciones 0=0, añadimos también la condición */ 
    if (C1==0){
        System.out.println("---Error, dividiendo entre 0---");
        if (C2==0) {
            System.out.println("---Error, infinitas soluciones---");
        }
    }  else {
        double x = -(C2/C1);
    System.out.println("El valor de x es " +x);
    }
    }
}
