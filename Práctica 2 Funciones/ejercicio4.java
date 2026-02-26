public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("---TABLAS DE MULTIPLICAR DEL 1 AL 10---");

        for (int i = 1; i <= 10; i++) {
            imprimirTabla(i);
        }
        System.out.println("Todas las tablas impresas");
    }

    public static void imprimirTabla(int numero) {
        System.out.println("---Tabla del " + numero + "---");

        for (int j = 0; j < 10; j++) {
            int resultado = numero * j;
            System.out.println(numero + " x " + j + " = " + resultado);

        }
    }
}
