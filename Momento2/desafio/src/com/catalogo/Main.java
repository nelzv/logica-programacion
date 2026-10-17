package com.catalogo;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Bienvenido al sistema de catalogo/caja registradora" + "\n" +
                           "Desarrollado por; CARLOS NEL SOTO DIAZ");

        Scanner sc = new Scanner(System.in);

        CajaRegistradora caja = new CajaRegistradora();

        int opcion;

        do{
            System.out.println("// MENU DE CAJA //");
            System.out.println("1. Agregar producto PREMIUM" + "\n" +
                               "2. Agregar producto MEDIO" + "\n" +
                               "3. Agregar producto BASICO" + "\n" +
                               ">><<>><<>><<>><<>><<>><<>><<>><<" + "\n" +
                               "POR FAVOR, INGRESA UNA OPCION: ");
                               opcion = sc.nextInt();
            if(opcion == 1) {
                System.out.println("Has agregado un producto PREMIUM.");
                caja.agregarProductoPremium(15000);
            } else if (opcion == 2) {
                System.out.println("Has agregado un producto MEDIO.");
                caja.agregarProducto(6000);
            } else if (opcion == 3) {
                System.out.println("Has agregado un producto BASICO.");
                caja.agregarProducto(2800);
            } else if (opcion == 4) {
                System.out.println("CERRANDO CAJA..." + "\n" + 
                                   "  GENERANDO FACTURA...");
            } else {
                System.out.println("ERROR: Opcion invalida, intentelo nuevamente.");
            }                                                
                               
        } while(opcion != 4);

    }
}