import java.util.Scanner;

/*Pedimos los datos nombre, horas trabajadas y tarifa por hora. inicializamos las variables salarioBruto e impuestoTotal, declaramos salarioBase para utilizarla más adelante, 
la asignamos después del cálculo de salarioBruto para que el valor sea correcto (salarioBase = salarioBruto)
En el primer if calculamos la paga, si las horas semanales superan las 35. Primero calcula las 35 primeras horas con la tarifa normal, calculamos las horas extra restándole a las 
totales 35, calculamos el pago extra, que se calcula multiplicando las horas extra por 1.5, y el salario bruto viene dado por el pago normal más el pago extra.
Si no son más de 35, salta al else, que calcula el salario bruto, que son las horas trabajadas por la tarifa hora.
Igualamos salario base a salario bruto para que podamos modificarlo sin alterar el valor original del bruto. se va reduciendo progresivamente en cada tramo de impuesto para llevar
un control del dinero restante al que todavía se le pueden aplicar impuestos.
Usamos bloques if separados para asegurar que el programa pase por todos los tramos aplicables.
si el salarioBase excede 900, se calcula el impuesto solo sobre la cantidad que excede (salarioBase - 900), la cantidad se suma a impuesto total. se establece de neuvo en 900 
para que el dinero al que se le ha aplicado el 45% no se considere para el siguiente cálculo de impuestos.
En el siguiente tramo si el salario es mayor de 500 se le aplica el 25% de impuestos.
Finalmente calculamos el salario neto, restándole al salario bruto el impuesto total.
 */

public class salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Pedimos el nombre
        System.out.println("---Cálculo de salario neto semanal---");
        System.out.println("-Nombre del trabajador");
        String nombre = sc.nextLine();
// Pedimos las horas trabajadas
        System.out.println("-Horas trabajadas a la semana-");
        int horasTrabajadas = sc.nextInt();
// Definimos la tarifa normal (no dada por el ejercicio)
        System.out.println("-Tarifa normal por hora-");
        double tarifaHora = sc.nextDouble();
        double salarioBruto = 0.0;
        sc.close();

        double impuestoTotal = 0.0;
        double salarioBase;

        if (horasTrabajadas > 35) {
            double pagoNormal = tarifaHora * 35;
            int horasExtra = horasTrabajadas - 35;
            double pagoExtra = horasExtra * tarifaHora * 1.5;
            salarioBruto = pagoNormal + pagoExtra;
        }
        else {
            salarioBruto = horasTrabajadas * tarifaHora;
        }

        salarioBase = salarioBruto;

        if (salarioBase > 900) {
            double exceso45 = salarioBase - 900;
            impuestoTotal += exceso45 * 0.45;
            salarioBase = 900;
        }

        if (salarioBase > 500) {
            double exceso25 = salarioBase - 500;
            impuestoTotal += exceso25 * 0.25;
            salarioBase = 500;
        }

        double salarioNeto = salarioBruto - impuestoTotal;
        System.out.println("Trabajador: " +nombre);
        System.out.println("Salario bruto: " +salarioBruto +"euros");
        System.out.println("Tasas: " +impuestoTotal +"euros");
        System.out.println("Salario neto: " +salarioNeto +"euros");

    }
}
