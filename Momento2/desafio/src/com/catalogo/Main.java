package com.catalogo;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        System.out.println("\n" + "BIENVENIDO AL SISTEMA DE CAJA REGISTRADORA" + "\n" +
                           "Desarrollado por; CARLOS NEL SOTO DIAZ" + "\n");

        Scanner sc = new Scanner(System.in);

        CajaRegistradora caja = new CajaRegistradora();

        int opcion;

        do{
            System.out.println("// MENU DE CAJA //" + "\n");
            System.out.println("1. Agregar producto PREMIUM" + "\n" +
                               "2. Agregar producto MEDIO" + "\n" +
                               "3. Agregar producto BASICO" + "\n" + "\n" +
                               "4. Finalizar la compra." + "\n" +
                               ">><<>><<>><<>><<>><<>><<>><<>><<" + "\n" +
                               "POR FAVOR, INGRESA UNA OPCION: " + "\n");
                               opcion = sc.nextInt();

            if(opcion == 1) {
                System.out.println("Has agregado un producto PREMIUM.");
                caja.agregarProductoPremium(50000);

            } else if (opcion == 2) {
                System.out.println("Has agregado un producto MEDIO.");
                caja.agregarProducto(20000);

            } else if (opcion == 3) {
                System.out.println("Has agregado un producto BASICO.");
                caja.agregarProducto(10800);

            } else if (opcion == 4) {
                System.out.println("\n" + "CERRANDO CAJA..." + "\n" + 
                                   "  GENERANDO FACTURA..." + "\n");
            } else {
                System.out.println("\n" + "ERROR: Opcion invalida, intentelo nuevamente.");
            }                                                
                               
        } while(opcion != 4);

        caja.factura();

        sc.close();
    }
}