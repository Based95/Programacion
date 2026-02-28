public class Ejercicio73 {
    public static void main(String[] args) {
        // creamos un rectangulo válido

        Rectangulo r = new Rectangulo(0, 0, 10, 10);
        System.out.println(
                "Rectángulo creado: (" + r.getX1() + "," + r.getY1() + ") a (" + r.getX2() + "," + r.getY2() + ")");

        // intentamos hacer un cambio válido
        r.setX1(5);
        System.out.println("Nuevo x1: " + r.getX1());

        // intentamos hacer un cambio erróneo
        System.out.println("Intentando poner x1 en 20 (siendo x2 = 10)");
        r.setX1(20);

        System.out.println("Valor de x1 tras el error: " + r.getX1() + " Sigue siendo 5");
    }
}
