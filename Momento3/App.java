import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        /*
         * CREADO POR EL MUY MUY!!
         * CARLOS NEL SOTO DIAZ
         * CESDE / GCO GRUPO URIBE
         * PARA EL PROFESOR
         * SANTIAGO YOSA
         * 
         * SALUDOS PROFE!
         */

        String[] marcas = { "Naf Naf", "Americanino", "Esprit", null, null };
        Scanner lector = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n\n::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("::          GCO VENTA DIRECTA           ::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.println();
            System.out.println("   1. Ver marcas");
            System.out.println("   2. Validar la disponibilidad de una marca");
            System.out.println("   3. Registrar una nueva marca");
            System.out.println("   4. Salir");
            System.out.println();
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("   Seleccione una opcion: ");

            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n::::::::::: MARCAS VIGENTES :::::::::::\n");
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] != null) {
                            System.out.println("   - " + marcas[i]);
                        }
                    }
                    System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
                    break;
                case 2:
                    System.out.println("\n::::::: VALIDAR DISPONIBILIDAD :::::::\n");
                    System.out.print("   Ingrese el nombre de la marca: ");
                    String nombreBuscado = lector.nextLine();
                    boolean disponible = nombreFuncion(marcas, nombreBuscado);
                    System.out.println();
                    if (disponible) {
                        System.out.println("   >> La marca SI esta disponible.");
                    } else {
                        System.out.println("   >> La marca NO esta disponible.");
                    }
                    System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
                    break;
                case 3:
                    System.out.println("\n::::::: REGISTRAR NUEVA MARCA :::::::\n");
                    System.out.print("   Ingrese nombre de la nueva marca: ");
                    String nuevaMarca = lector.nextLine();
                    boolean registrada = false;
                    System.out.println();
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] == null) {
                            marcas[i] = nuevaMarca;
                            System.out.println("   >> Marca asignada correctamente.");
                            registrada = true;
                            break;
                        }
                    }
                    if (!registrada) {
                        System.out.println("   >> NO HAY ESPACIOS DISPONIBLES PARA AGREGAR MARCAS.");
                    }
                    System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
                    break;
                case 4:
                    System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("::       SALIENDO DEL PROGRAMA ...      ::");
                    System.out.println("::::::::::::::::::::::::::::::::::::::::::\n");
                    break;
                default:
                    System.out.println("\n   >> ERROR: OPCION INVALIDA.");
                    System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
            }
        } while (opcion != 4);

        lector.close();
    }

    public static boolean nombreFuncion(String[] marcas, String nombreBuscado) {
        for (int i = 0; i < marcas.length; i++) {
            if (marcas[i] != null && marcas[i].equalsIgnoreCase(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }
}