import java.util.Scanner;

public class SimulacroExamen {

    static Vehiculo[] flota = new Vehiculo[10];
    static int contadorVehiculos = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionMenu;

        do {
            System.out.println("---MENU---");
            System.out.println("Elige una opción:");
            System.out.println("1. Registrar Vehículo.");
            System.out.println("2. Ver Flota Completa.");
            System.out.println("3. Buscar Vehículo.");
            System.out.println("4. Salir.");

            if (sc.hasNextInt()) {
                opcionMenu = sc.nextInt();
                sc.nextLine();

                switch (opcionMenu) {
                    case 1:
                        registrarVehiculo(sc);
                        break;
                    case 2:
                        listarFlota();
                        break;
                    case 3:
                        buscarPorMatricula(sc);
                        break;
                    case 4:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("ERROR. Introduce un número entre 1 y 4");
                }

            } else {
                System.out.println("ERROR. Introduce solo números");
                sc.nextLine();
                opcionMenu = 0;
            }
        } while (opcionMenu != 4);
    }

    public static void registrarVehiculo(Scanner sc) {
        if (contadorVehiculos < flota.length) {
            System.out.println("---Regristar vehículo---");
            System.out.println("Introduce la matrícula del vehículo:");
            String matricula = sc.nextLine();
            System.out.println("Introduce el modelo del vehículo:");
            String modelo = sc.nextLine();

            int porcentajeBateria = -1;
            boolean datoValido = false;

            do {
                System.out.println("Introduce el porcentaje de batería (0-100):");
                if (sc.hasNextInt()) {
                    porcentajeBateria = sc.nextInt();
                    sc.nextLine();

                    if (porcentajeBateria >= 0 && porcentajeBateria <= 100) {
                        datoValido = true;
                    } else {
                        System.out.println("ERROR. Introduce un valor entre 0 y 100");
                    }
                } else {
                    System.out.println("ERROR. Introduce solo números.");
                    sc.nextLine();
                }
            } while (!datoValido);

            System.out.println("¿Está disponible? (si/no)");
            String respuesta = sc.nextLine().toLowerCase();
            boolean estaDisponible = respuesta.equals("si");

            flota[contadorVehiculos] = new Vehiculo(matricula, modelo, porcentajeBateria, estaDisponible);
            contadorVehiculos++;

            System.out.println("Vehiculo registrado correctamente");
        } else {
            System.out.println("ERROR. La flota de vehículos está llena");
        }
    }

    public static void listarFlota() {
        if (contadorVehiculos == 0) {
            System.out.println("No hay vehículos registrados. Registra el primero (Opción 1)");
            return;
        }
        System.out.println("---Vehículos registrados---");
        for (int i = 0; i < contadorVehiculos; i++) {
            flota[i].mostrarInfo();
        }
    }

    public static void buscarPorMatricula(Scanner sc) {
        if (contadorVehiculos == 0) {
            System.out.println("No hay vehículos registrados. Registra el primero (Opción 1)");
            return;
        }
        System.out.println("---Buscar vehículo por matrícula---");
        System.out.println("Introduce la matrícula que buscas:");

        String matriculaBuscada = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < contadorVehiculos; i++) {
            if (flota[i].getMatricula().equalsIgnoreCase(matriculaBuscada)) {
                System.out.println("¡Matricula encontrada!");
                flota[i].mostrarInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("ERROR. La matrícula con el valor: " + matriculaBuscada + " no existe en la flota");
        }
    }
}
