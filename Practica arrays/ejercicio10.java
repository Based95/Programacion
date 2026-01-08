import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas personas vamos a medir? (N): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El número de personas debe ser mayor que 0.");
        } else {
            
            double[] alturas = new double[n];

            System.out.println("Introduce las alturas (en metros)."); 
            System.out.println("Usa coma para los decimales.");
            
            for (int i = 0; i < n; i++) {
                System.out.print("Persona " + (i + 1) + ": ");
                alturas[i] = sc.nextDouble();
            }

            double suma = 0;
            double maximo = alturas[0]; 
            double minimo = alturas[0];

            for (int i = 0; i < n; i++) {

                suma = suma + alturas[i];

                if (alturas[i] > maximo) {
                    maximo = alturas[i];
                }

                if (alturas[i] < minimo) {
                    minimo = alturas[i];
                }
            }

            double media = suma / n;

            int superior = 0;
            int inferior = 0;

            for (int i = 0; i < n; i++) {
                if (alturas[i] > media) {
                    superior++;
                } else if (alturas[i] < media) {
                    inferior++;
                }
            }

            System.out.println("Altura media: " + media);
            System.out.println("Altura máxima: " + maximo);
            System.out.println("Altura mínima: " + minimo);
            System.out.println("Personas por encima de la media: " + superior);
            System.out.println("Personas por debajo de la media: " + inferior);
        }
        sc.close();
    }
}