import java.util.Scanner;

public class contadorBilletes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int totalDinero;
        int numBill500 = 0, numBill200 = 0, numBill100 = 0, numBill50 = 0, numBill20 = 0, numBill10 = 0, numBill5 = 0;

        System.out.println("Introduce el valor total para saber en cuantos billetes se puede dividir");
        totalDinero = sc.nextInt();
        sc.close();

        numBill500 = totalDinero / 500;
        totalDinero = totalDinero % 500;
            if (numBill500 > 0) {
                System.out.println(numBill500 +" billetes de 500 euros");
            }
        
        numBill200 = totalDinero / 200;
        totalDinero = totalDinero % 200;
            if (numBill200 > 0) {
                System.out.println(numBill200 +" billetes de 200 euros");
            }

        numBill100 = totalDinero / 100;
        totalDinero = totalDinero % 100;
            if (numBill100 > 0) {
                System.out.println(numBill100 +" billetes de 100 euros");
            }

        numBill50 = totalDinero / 50;
        totalDinero = totalDinero % 50;
            if (numBill50 > 0) {
                System.out.println(numBill50 +" billetes de 50 euros");
            }

        numBill20 = totalDinero / 20;
        totalDinero = totalDinero % 20;
            if (numBill20 > 0) {
                System.out.println(numBill20 +" billetes de 20 euros");
            }

        numBill10 = totalDinero / 10;
        totalDinero = totalDinero % 10;
            if (numBill10 > 0) {
                System.out.println(numBill10 +" billetes de 10 euros");
            }

        numBill5 = totalDinero / 5;
        totalDinero = totalDinero % 5;
            if (numBill5 > 0) {
                System.out.println(numBill5 +" billetes de 5 euros");
            }


    }
}
