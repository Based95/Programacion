import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
// Declaramos el precio mínimo para aplicar el descuento, y el porcentaje de descuento (10%, usamos 0.1 para luego multiplicarlo y averiguar el monto total del descuento a aplicar)
        Scanner sc = new Scanner(System.in);
        double minimoDescuento = 100;
        double tasaDescuento = .1;
// Pedimos los datos
        System.out.println("---Escribe el precio del producto");
        double precioProd = sc.nextDouble();
        sc.close();
// Si el precio supera el umbral de 100 (mínimo para aplicar el descuento), multiplicaremos el precio del producto por 0.1 para averiguar el 10%.
//  Finalmente restamos el monto del descuento al precio del producto aplicando así el descuento
        if (precioProd >= minimoDescuento) {
            double descuentoAplicado = precioProd * tasaDescuento;
            double precioReal = precioProd - descuentoAplicado;
            System.out.println("Enhorabuena, se ha aplicado el descuento, el precio del producto queda en:" +precioReal);
        }
// Si el precio no llega a 100 no se le aplcicará ningún descuento
        else {
            System.out.println("El precio del producto es de: " +precioProd);
        }
    }
}
