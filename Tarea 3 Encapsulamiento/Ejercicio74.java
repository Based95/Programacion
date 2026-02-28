public class Ejercicio74 {
    public static void main(String[] args) {
        System.out.println("---Prueba de artículo correcto---");
        Articulo art1 = new Articulo("Camisa", 15, 1.21, 10);
        System.out.println("Artículo: " + art1.getNombre() + " Precio sin IVA: " + art1.getPrecio() + " Euros. " +
                "Precio con IVA: " + (art1.getPrecio() * art1.getIva()) + " Euros." + " En almacén: "
                + art1.getCuantosQuedan() + " Unidades");

        System.out.println("---Prueba de artículo incorrecto---");
        Articulo art2 = new Articulo("", 0, 0, 0);
        System.out.println("Artículo: " + art2.getNombre() + " Precio sin IVA: " + art2.getPrecio() + " Euros. " +
                "Precio con IVA: " + (art2.getPrecio() * art2.getIva()) + " Euros." + " En almacén: "
                + art2.getCuantosQuedan() + " Unidades");

    }
}
