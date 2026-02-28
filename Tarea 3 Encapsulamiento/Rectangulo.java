public class Rectangulo {
    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        if ((x1 < x2) && (y1 < y2)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectángulo (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
        }
    }

    // GETTERS

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    // SETTERS (validan antes de guardar)

    public void setX1(int x1) {
        if (x1 < this.x2) {
            this.x1 = x1;
        } else {
            System.err.println("Error: x1 debe ser menor que x2 (" + x2 + ")");
        }
    }

    public void setY1(int y1) {
        if (y1 < this.y2) {
            this.y1 = y1;
        } else {
            System.err.println("Error: y1 debe ser menor que y2 (" + y2 + ")");
        }
    }

    public void setX2(int x2) {
        if (x2 > this.x1) {
            this.x2 = x2;
        } else {
            System.err.println("Error: x2 debe ser mayor que x1 (" + x1 + ")");
        }
    }

    public void setY2(int y2) {
        if (y2 > this.y1) {
            this.y2 = y2;
        } else {
            System.err.println("Error: y2 debe ser mayor que y1 (" + y1 + ")");
        }
    }

}