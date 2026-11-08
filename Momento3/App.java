import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String[] marcas = {"Naf Naf", "Americanino", "Esprit", null, null};
        Scanner lector = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n---#### GCO VENTA DIRECTA ###/n");
            System.out.println("1. Ver marcas");
            System.out.println("2. Validar la disponibilidad de una marca");
            System.out.println("3. Registrar una nueva marca");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: .../n ");
            
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
}