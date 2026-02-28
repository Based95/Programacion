public class Ejercicio71 {
    public static void main(String[] args) {
        Punto p1 = new Punto(2, 3);
        // Leemos los datos con los getters
        System.out.println("Coordenada de X: " + p1.getX());
        System.out.println("Coordenada de Y: " + p1.getY());

        System.out.println("---Cambiando datos---");

        // Usamos los setters para cambiar el punto
        p1.setX(4);
        p1.setY(6);

        // Comprobamos que han cambiado
        System.out.println("Nuevas coordenadas: ");
        System.out.println("Coordenada de X: " + p1.getX());
        System.out.println("Coordenada de Y: " + p1.getY());
    }
}
