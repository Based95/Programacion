import java.util.Scanner;

public class menu {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;
        
        System.out.println("---CALCULADORA---");

        do {
            System.out.println("--- Menú Principal ---");
            System.out.println("1.- Operaciones básicas (Suma, Resta, etc.).");
            System.out.println("2.- Operaciones complejas (Potencia, Raíz).");
            System.out.println("3.- Salir.");
            System.out.print("Elige una opción (1-3): ");

            while (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Introduce un número entero.");
                System.out.print("Elige una opción (1-3): ");
                sc.next();
            }
            
            opcionPrincipal = sc.nextInt();
            sc.nextLine(); 

            switch (opcionPrincipal) {
                case 1:
                    int opcionBasica;
                    
                    do {
                        System.out.println("--- Submenú Básicas ---");
                        System.out.println("1. Suma.  2. Resta.  3. Producto.  4. División.");
                        System.out.println("5. Volver al menú principal.");
                        System.out.print("Elige una operación (1-5): ");

                        while (!sc.hasNextInt()) {
                            System.out.println("Entrada inválida. Introduce un número entero (1-5).");
                            System.out.print("Elige una operación (1-5): ");
                            sc.next();
                        }
                        opcionBasica = sc.nextInt();
                        sc.nextLine();

                        if (opcionBasica >= 1 && opcionBasica <= 4) {
                            double num1, num2;
                            double resultado = 0;
                            
                            System.out.print("Introduce el primer número : ");
                            num1 = sc.nextDouble();
                            sc.nextLine(); 

                            System.out.print("Introduce el segundo número : ");
                            num2 = sc.nextDouble();
                            sc.nextLine(); 
                            
                            switch (opcionBasica) {
                                case 1:
                                    resultado = num1 + num2;
                                    System.out.println("Resultado Suma: " + num1 + " + " + num2 + " = " + resultado);
                                    break;
                                case 2:
                                    resultado = num1 - num2;
                                    System.out.println("Resultado Resta: " + num1 + " - " + num2 + " = " + resultado);
                                    break;
                                case 3:
                                    resultado = num1 * num2;
                                    System.out.println("Resultado Producto: " + num1 + " * " + num2 + " = " + resultado);
                                    break;
                                case 4:
                                    if (num2 != 0) {
                                        resultado = num1 / num2;
                                        System.out.println("Resultado División: " + num1 + " / " + num2 + " = " + resultado);
                                    } else {
                                        System.out.println("Error: No se puede dividir por cero.");
                                    }
                                    break;
                            }
                            System.out.println("--- Presiona Enter para continuar en Básicas ---");
                            sc.nextLine();

                        } else if (opcionBasica != 5) {
                            System.out.println("Opción de operación no válida.");
                            System.out.println("--- Presiona Enter para continuar ---");
                            sc.nextLine();
                        }

                    } while (opcionBasica != 5);
                    
                    break;
                
                case 2:
                    int opcionCompleja;
                    
                    do {
                        System.out.println("--- Submenú Complejas ---");
                        System.out.println("1. Potencia.  2. Raíz cuadrada.");
                        System.out.println("3. Volver al menú principal.");
                        System.out.print("Elige una operación (1-3): ");
                        
                        while (!sc.hasNextInt()) {
                            System.out.println("Entrada inválida. Introduce un número entero (1-3).");
                            System.out.print("Elige una operación (1-3): ");
                            sc.next();
                        }
                        opcionCompleja = sc.nextInt();
                        sc.nextLine();
                        
                        if (opcionCompleja >= 1 && opcionCompleja <= 2) {
                            double num1, num2;
                            double resultado = 0;
                            
                            switch (opcionCompleja) {
                                case 1:
                                    System.out.print("Introduce la Base: ");
                                    num1 = sc.nextDouble();
                                    sc.nextLine(); 

                                    System.out.print("Introduce el Exponente: ");
                                    num2 = sc.nextDouble();
                                    sc.nextLine(); 

                                    resultado = Math.pow(num1, num2);
                                    System.out.println("Resultado Potencia: " + num1 + " ^ " + num2 + " = " + resultado);
                                    break;
                                
                                case 2:
                                    System.out.print("Introduce el número para la Raíz Cuadrada: ");
                                    num1 = sc.nextDouble();
                                    sc.nextLine(); 
                                    
                                    if (num1 >= 0) {
                                        resultado = Math.sqrt(num1);
                                        System.out.println("Resultado Raíz Cuadrada de " + num1 + " es " + resultado);
                                    } else {
                                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                                    }
                                    break;
                            }
                            System.out.println("--- Presiona Enter para continuar en Complejas ---");
                            sc.nextLine();
                            
                        } else if (opcionCompleja != 3) {
                            System.out.println(" Opción no reconocida en el menú de operaciones complejas.");
                            System.out.println("--- Presiona Enter para continuar ---");
                            sc.nextLine();
                        }

                    } while (opcionCompleja != 3);

                    break; 

                case 3:
                    System.out.println("Gracias por usar la calculadora. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
                    break;
            }

            if (opcionPrincipal != 3) {
                System.out.println("--- Volviendo al menú principal ---");
            }

        } while (opcionPrincipal != 3); 
        
        sc.close();
    } 
}