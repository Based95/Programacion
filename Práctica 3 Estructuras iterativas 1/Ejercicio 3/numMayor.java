import java.util.Scanner;

public class numMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int ultimoAceptado = 0;
        int introducidos = 0;
        int fallados = 0;

        System.out.println("Introduce números, pulsa 0 para terminar");
        System.out.println("Solo se aceptan números si son mayores que el introducido anteriormente");
        System.out.println("Dime un número inicial");
        numero = sc.nextInt();
        sc.nextLine();
        if (numero != 0) {
            ultimoAceptado = numero;
            introducidos++;
            do {
                System.out.println("Dime un número");
                numero = sc.nextInt();
                sc.nextLine();
                if (numero > ultimoAceptado) {
                    introducidos++;
                    ultimoAceptado = numero;
                } else if (numero != 0) {
                    System.out.println("Fallo, es menor");
                    introducidos++;
                    fallados++;
                }

            } while (numero != 0);

        }
        System.out.println("Total de número introducidos: " + introducidos);
        System.out.println("Total de número fallados: " + fallados);
        sc.close();

    }
}
