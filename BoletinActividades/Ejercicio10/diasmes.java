import java.util.Scanner;
public class diasmes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Pedimos que se introduzca el día, mes y año. Damos instrucciones imprimiendo en pantalla el textos "Introduce la primera fecha" 
        System.out.println("---Introduce la primera fecha---");
        System.out.println("Escribe un día");
        int dia1 = scanner.nextInt();
        System.out.println("Escribe un mes");
        int mes1 = scanner.nextInt();
        System.out.println("Escribe un año");
        int anio1 = scanner.nextInt();
        //Pedimos el día, mes y año de la segunda fecha
        System.out.println("---Introduce la segunda fecha---");
        System.out.println("Escribe un día");
        int dia2 = scanner.nextInt();
        System.out.println("Escribe un mes");
        int mes2 = scanner.nextInt();
        System.out.println("Escribe un año");
        int anio2 = scanner.nextInt();
        
        /* He intentado usar switch para que dependiendo del mes nos de valor 28, 30 ó 31 (obviamos los años bisiestos), pero al escribirlo para mes1 he empezado a buscar si hay alguna forma de poder reutilizar
         * ese código para calcular los días en mes2 y he visto que se puede hacer una función, ha sido más complicado de entender y aplicar pero así no habría que estar copiando y pegando todo el switch varias
         * veces
         */

        // Empezamos a calcular los días totales, escribimos el -1 porque aunque estemos en 2025 el año no ha pasado entero, sumaremos a 2024 los meses y días que han pasado
        int totalDias1 = (anio1 - 1) * 365;
        int totalDias2 = (anio2 - 1) * 365;

        /*Creamos un bucle con for, iniciamos el contador en 1 (enero), preguntamos si el contador es menor que el número de mes introducido, si lo es se le agrega 1 y se repite. Cuando el contador ya no es menor
        que el mes dejará de ejecutarse, no tendremos que restarle los días transcurridos porque el bucle ha parado justo antes de que eso ocurra (ej, si estamos en abril, se ejecutará para 1, 2 y 3, parará justo antes 
        del 4 y solo contará los días transcurridos antes de que empiece abril). Despues llamamos al método diasDelMes, que dependiendo de la cifra introducida cuando pide el mes, nos devolverá los valores 28, 30 ó 31 
        y los irá sumando cada vez que se ejecute el bucle.
        */ 

        for (int i = 1; i < mes1; i++) {
            totalDias1 = totalDias1 + diasDelMes(i);
        }
        for (int i = 1; i < mes2; i++) {
            totalDias2 = totalDias2 + diasDelMes(i);
        }
        
        //Finalmente sumamos totalDias, que ya ha sumado los días de los años y los meses y le añadimos los días introducidos.

        totalDias1 = totalDias1 + dia1;
        totalDias2 = totalDias2 + dia2;

        //Escribimos por pantalla el resultado restando los días totales de ambas fechas. Usamos Math.abs para que nos devuelva sólo números positivos.

        System.out.println("la diferencia de días es " +Math.abs(totalDias1 - totalDias2));
    }
    public static int diasDelMes(int mes) {
            int diasDelMes = 0;
            switch (mes) {
            case 1: //Enero
            case 3: //Marzo
            case 5: //Mayo
            case 7: //Julio
            case 8: //Agosto
            case 10: // Octubre
            case 12: // Diciembre
                diasDelMes = 31;    
                break;
            case 4: //Abril
            case 6: //Junio
            case 9: // Septiembre
            case 11: // Noviembre
                diasDelMes = 30;
                break;
            case 2: //Febrero  
                diasDelMes = 28;           
                break;
        
            default:
            System.out.println("Mes no valido");
                break;
        } 
            return diasDelMes;
        
    }
    
}
