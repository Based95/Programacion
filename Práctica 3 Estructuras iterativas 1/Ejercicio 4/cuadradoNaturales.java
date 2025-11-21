public class cuadradoNaturales {
    public static void main(String[] args) {
        System.out.println("--Suma de los primeros 5 numeros naturales (empezando por 1)--");
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            int cuadrado = i * i;
            suma += cuadrado;
        }
        System.out.println("La suma total es: " + suma);
    }
}
