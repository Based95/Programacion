public class ejercicio74 {
    public static void main(String[] args) {

        Articulo a1 = new Articulo();
        a1.nombre = "Camisa";
        a1.precio = 10;
        a1.iva = 1.21;
        a1.cuantosQuedan= 23;

        System.out.println(a1.nombre + " - Precio: " + a1.precio +" Euros - con IVA " +(a1.precio*a1.iva) +" Euros.");
    }

}
