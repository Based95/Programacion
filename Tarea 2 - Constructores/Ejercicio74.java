public class Ejercicio74 {
    public static void main(String[] args) {
        System.out.println("---Prueba de artículo correcto---");
        Articulo art1 = new Articulo("Camisa", 15, 1.21, 10);
        System.out.println("Artículo: " +art1.nombre + " Precio sin IVA: " +art1.precio + " Euros. " +
        "Precio con IVA: " +(art1.precio*art1.iva) + " Euros." + " En almacén: "+ art1.cuantosQuedan +" Unidades");
        
        System.out.println("---Prueba de artículo incorrecto---");
        Articulo art2 = new Articulo("", 0, 0, 0);
        System.out.println("Artículo: " +art2.nombre + " Precio sin IVA: " +art2.precio + " Euros. " +
        "Precio con IVA: " +(art2.precio*art2.iva) + " Euros." + " En almacén: "+ art2.cuantosQuedan +" Unidades");
        

    }
}
