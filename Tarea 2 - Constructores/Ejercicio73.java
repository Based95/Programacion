public class Ejercicio73 {
    public static void main(String[] args) {
        System.out.println("--- INTENTO 1: Rectángulo Bueno ---");
        // Le pasamos 0,0 (esquina abajo-izquierda) y 5,5 (esquina arriba-derecha).
        // Como 0 es menor que 5, el 'if' nos deja pasar.
        Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
        System.out.println("El rectángulo r1 se ha creado bien. x2 vale: " + r1.x2);

        System.out.println("--- INTENTO 2: Rectángulo Malo ---");
        // Le pasamos 10,10 y luego 5,5. 
        // Como 10 NO es menor que 5, el 'if' falla y salta el 'else'.
        Rectangulo r2 = new Rectangulo(10, 10, 5, 5);
        
        // error al imprimir r2
        System.out.println("Las coordenadas de r2 se han quedado en: " + r2.x1 + ", " + r2.y1);
    }
}
