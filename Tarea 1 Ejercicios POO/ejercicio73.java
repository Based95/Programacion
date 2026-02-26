public class ejercicio73 {
    public static void main(String[] args) {

        Rectangulo r1 = new Rectangulo();
        r1.x1 = 0;
        r1.y1 = 0;
        r1.x2 = 5;
        r1.y2 = 5;

        Rectangulo r2 = new Rectangulo();
        r2.x1 = 7;
        r2.y1 = 9;
        r2.x2 = 2;
        r2.y2 = 3;

        System.out.println("--Coordenadas--");
        System.out
                .println("Rectángulo 1: x1 = " + r1.x1 + " , y1 = " + r1.y1 + " || x2 = " + r1.x2 + " , y2 = " + r1.y2);
        System.out
                .println("Rectángulo 2: x1 = " + r2.x1 + " , y1 = " + r2.y1 + " || x2 = " + r2.x2 + " , y2 = " + r2.y2);

        // Ancho: restamos las X (5 - 0 = 5)
        int ancho1 = Math.abs(r1.x2 - r1.x1);
        // Alto: restamos las Y (5 - 0 = 5)
        int alto1 = Math.abs(r1.y2 - r1.y1);

        int area1 = ancho1 * alto1;
        int perimetro1 = 2 * ancho1 + 2 * alto1;

        // Ancho: restamos las X (2 - 7 = -5, el Math.abs lo convierte en 5)
        int ancho2 = Math.abs(r2.x2 - r2.x1);
        // Alto: restamos las Y (3 - 9 = -6, el Math.abs lo convierte en 6)
        int alto2 = Math.abs(r2.y2 - r2.y1);

        int area2 = ancho2 * alto2;
        int perimetro2 = 2 * ancho2 + 2 * alto2;

        System.out.println("-- Áreas y Perímetros --");
        System.out.println("Rectángulo 1: Área = " + area1 + " , Perímetro = " + perimetro1);
        System.out.println("Rectángulo 2: Área = " + area2 + " , Perímetro = " + perimetro2);
    }
}
