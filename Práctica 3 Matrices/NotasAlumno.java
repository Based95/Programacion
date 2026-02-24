import java.util.Scanner;

public class NotasAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Definimos 4 alumnos (filas) y 5 asignaturas (columnas)
        double[][] notas = new double[4][5];

        // Introducimos las notas por teclado
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce la nota para el alumno " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.println("Asignatura" + (j + 1) + ":");
                notas[i][j] = sc.nextDouble();
            }
        }
        //Procesamos los datos para hayar min, max y media.
        for (int i = 0; i <4; i++){
            double suma = 0;
            double max = notas[i][0]; //empezamos asumiendo que la primera es la mayor
            double min = notas[i][0]; //empezamos asumiendo que la primera es la menor

            for (int j = 0; j < 5; j++){
                double notaActual = notas[i][j];
                suma += notaActual;

                //comprobamos si la nota actual es la nueva máxima
                if(notaActual > max){
                    max = notaActual;
                }

                if (notaActual < min){
                    min = notaActual;
                }
            }
            double media = suma / 5;

            //mostramos los resultados por alumno

            System.out.println("Alumno" + (i + 1) + ":");
            System.out.println("Nota máxima: " +max);
            System.out.println("Nota mínima: " +min);
            System.out.println("Nota media: " +media);

            sc.close();
        }
    }
}
