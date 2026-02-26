public class ejercicio71 {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        p1.x = 5;
        p1.y = 0;

        Punto p2 = new Punto();
        p2.x = 10;
        p2.y = 10;

        Punto p3 = new Punto();
        p3.x = -3;
        p3.y = 7;

        System.out.println("Punto 1: (" + p1.x + "," + p1.y + ")");
        System.out.println("Punto 2: (" + p2.x + "," + p2.y + ")");
        System.out.println("Punto 3: (" + p3.x + "," + p3.y + ")");

        // sumando 3
        System.out.println("Prueba sumando");
        p1.x += 3;
        p1.y += 3;
        System.out.println("Punto 1: (" + p1.x + "," + p1.y + ")");

        // restando dos al doble

        System.out.println("Prueba restando dos al doble");
        p2.x = p2.x * 2 - 2;
        p2.y = p2.y * 2 - 2;
        System.out.println("Punto 2: (" + p2.x + "," + p2.y + ")");

        // multiplicando por 3
        System.out.println("Prueba multiplicando por 3");
        p3.x *= 3;
        p3.y *= 3;
        System.out.println("Punto 3: (" + p3.x + "," + p3.y + ")");

    }
}
