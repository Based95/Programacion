import java.util.Scanner;

public class enumerado {
    public static void main(String[] args) {
        
        MES m = MES.MARZO;

        System.out.println("EL MES ES " +m);
    }
    //Creamos una nueva clase fuera del método main. se utiliza enum para definir un conjunto fijo de constantes, cuando declaremos otro MES solo aceptará los valores declarados en la clase MES.
    public enum MES {
        ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
    }
}
