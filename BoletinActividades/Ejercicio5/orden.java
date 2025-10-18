import java.util.Scanner;

public class orden {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3;

        //pedimos que se ingresen los numeros

        System.out.println("Ingrese el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = entrada.nextInt();

        /*comparamos quien es mayor con el condicional ternario: x>y ? x:y. En este caso si num1 es mayor que num 2, hace la primera operacion despues de los dos puntos. 
        si num1 es mayor que num3 devuelve num1, si no lo es devuelve num3*/

        int mayor = (num1 > num2 ? (num1 > num3 ? num1 : num3 ) : (num2 > num3 ? num2 : num3));
        int menor = (num1 < num2 ? (num1 < num3 ? num1 : num3 ) : (num2 < num3 ? num2 : num3));
        int medio = (num1 + num2 + num3) - (mayor + menor);
        System.out.println("el mayor es:" +mayor);
        System.out.println("el menor es:" +menor);
        System.out.println("el medio es:" +medio);
    }


}