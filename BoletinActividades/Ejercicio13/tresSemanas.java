import java.util.Scanner;

public class tresSemanas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Pedimos que se ingrese la fecha

        System.out.println("Escribe el día");
        int dia = scanner.nextInt();
        System.out.println("Escribe el mes");
        int mes = scanner.nextInt();
        System.out.println("Escribe el año");
        int anio = scanner.nextInt();

        //Sumamos los 21 días. Puede que el valor se pase de 31

        dia = dia + 21;
        int diasDelMes;

        /*Llamamos a la función ObtenerDiasDelMes. Le dice cuantos días tiene el mes que ingresamos. También le enviamos la variable anio y con el operador módulo comprobamos si el año es bisiesto, es decir,
         * si dividimos entre 4 y el resto es 0 será un año bisiesto y devuelve 29, si no devuelve 28
        */

        diasDelMes = obtenerDiasDelMes(mes, anio);

        //Para que el valor de día sea siempre correcto y no 35, 40, etc, restamos a la variable día (a la que le hemos sumado 21)la cantidad de días del mes ya introducido, y sumamos 1 a mes.

        while (dia > diasDelMes) {
            dia = dia - diasDelMes;
            mes++;
            //Si el mes es mayor que 12 (diciembre) mes vuelve a ser 1 (enero) y se suma 1 al año.
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        /*Al ejecutarse una solo vez no hace falta hacerlo, pero si sumaramos por ejemplo, 40 días, se saltaría un mes y al volver a hacer el calculo por segunda vez estaría tomando los datos del mes que introducimos
        por primera vez. Así garantizamos que se sume la cantidad que se sume se pueda seguir calculando
        /* */
            diasDelMes = obtenerDiasDelMes(mes, anio);            
        }

        System.out.println("Dentro de 3 semanas será " + dia + "/" + mes + "/" + anio);
    }

    public static int obtenerDiasDelMes (int mes, int anio) {
    
        switch (mes) {
            case 1: //Enero
            case 3: //Marzo
            case 5: //Mayo
            case 7: //Julio
            case 8: //Agosto
            case 10: //Octubre
            case 12: //Diciembre
                return 31;    
            case 4: //Abril
            case 6: //Junio
            case 9: //Septiembre
            case 11: //Noviembre
                return 30;
                /*Aqui decimos que si el resto de la division de anio entre 4 es 0, y que también el resto del anio entre 100 NO es 0 (Los años divisibles enteros entre 100 no lo son )
                 * O que el año se pueda dividir entero entre 400 (si son bisiestos) serán bisiestos y devolverá 29, si no devolverá 28
                */
            case 2: //Febrero
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    return  29;
                }   else {    
                    return  28;}         
        
            default:
                    return 0;
        }
        
    }
}
