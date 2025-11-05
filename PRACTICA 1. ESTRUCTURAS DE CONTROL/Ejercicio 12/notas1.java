import java.util.Scanner;

public class notas1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //variables que vamos a utilizar

        double nota = 0.0;
        double sumaNotas = 0.0;
        int numNotas = 0;
        int aprobados = 0;
        int suspendidos = 0;

        do {
            System.out.println("---Introduce una nota (0-10), o un número negativo para salir:");
            nota = sc.nextDouble();

            // verificamos que el valor no sea el de salida (negativo)
            if (nota >= 0) {
            // verificamos que la nota esté entre 0 y 10
                if (nota >= 0 && nota <= 10.0) {
                    sumaNotas += nota;
                    numNotas ++;

                    if (nota >= 5.0) {
                        aprobados++;
                    } else {
                        suspendidos++;
                    }
                } else {
                    System.out.println("Error, la nota debe estar entre 0 y 10");
                }
            }
        } while (nota >= 0);

        if (numNotas > 0) {
            double media = sumaNotas / numNotas;

            System.out.println("Total de notas: " +numNotas);
            System.out.println("Aprobados : " +aprobados);
            System.out.println("Suspendidos : " +suspendidos);
            System.out.println("La media es : " +media);
        } else {
            System.out.println("No se ha introducido ninguna nota válida.");
        }
        sc.close();
    }
}
