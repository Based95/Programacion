public class paresImpares {
    public static void main(String[] args) {
        

        int sumaPares = 0;
        int sumaImpares = 0;

        for (int num = 100; num <= 200; num++) {

            if (num % 2 == 0) {
                sumaPares += num;
            }else {
                sumaImpares += num;
            }
        }
        
        System.out.println("El total de las suma de los números impares es " +sumaImpares);
        System.out.println("El total de las suma de los números pares es " +sumaPares);
        
        
    }
}
