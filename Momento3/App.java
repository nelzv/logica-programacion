import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        Scanner lector = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n---#### GCO VENTA DIRECTA ###\n");
            System.out.println("1. Ver marcas");
            System.out.println("2. Validar la disponibilidad de una marca");
            System.out.println("3. Registrar una nueva marca");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ... \n");
            
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Marcas vigentes:");
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] != null) {
                            System.out.println("- " + marcas[i]);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre de la marca: ");
                    String nombreBuscado = lector.nextLine();
                    boolean disponible = nombreFuncion(marcas, nombreBuscado);
                    if (disponible) {
                        System.out.println("La marca SI esta disponible.");
                    } else {
                        System.out.println("La marca NO esta disponible.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nombre de la nueva marca: ");
                    String nuevaMarca = lector.nextLine();
                    boolean registrada = false;
                    for (int i = 0; i < marcas.length; i++) {
                        if (marcas[i] == null) {
                            marcas[i] = nuevaMarca;
                            System.out.println("Marca asignada correctamente.");
                            registrada = true;
                            break;
                        }
                    }
                    if (!registrada) {
                        System.out.println("No hay posiciones libres (null) en el arreglo.");
                    }
                    break;
                case 4:
                    System.out.println("SALIENDO DEL PROGRAMA ..../n" + ".....");
                    break;
                default:
                    System.out.println("ERRORRRR: OPCION INVALIDA.");
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