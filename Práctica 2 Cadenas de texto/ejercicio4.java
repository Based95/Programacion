import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        // Convertimos todo a minúsculas
        // Así 'A' se convierte en 'a' y nos ahorramos comprobaciones
        frase = frase.toLowerCase();

        // Inicializamos los contadores
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;

        // Recorremos la frase letra por letra
        // .length() nos dice cuántas letras tiene la frase
        for (int i = 0; i < frase.length(); i++) {

            // Obtenemos el carácter en la posición actual 'i'
            char letra = frase.charAt(i);

            // Comprobamos si es una vocal y sumamos al contador correspondiente
            switch (letra) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
            }
        }
        // Mostramos los resultados
        System.out.println("--- Resultados ---");
        System.out.println("Nº de A's: " + contadorA);
        System.out.println("Nº de E's: " + contadorE);
        System.out.println("Nº de I's: " + contadorI);
        System.out.println("Nº de O's: " + contadorO);
        System.out.println("Nº de U's: " + contadorU);

        sc.close();
    }
}