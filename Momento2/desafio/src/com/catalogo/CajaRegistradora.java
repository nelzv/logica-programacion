package com.catalogo;

public class CajaRegistradora {

/*   ATRIBUTOS */
    private double totalBrutoAcumulado;
    private int productosComprados;
    private int productosPremium;


/*CONSTRUCTOR */
public CajaRegistradora() {
    this.totalBrutoAcumulado = 0.0;
    this.productosComprados = 0;
    this.productosPremium = 0;
    }

    /* METODOS */

    public void agregarProducto(double precio) {
        this.productosComprados++;
        this.totalBrutoAcumulado = this.totalBrutoAcumulado + precio;

    }

    public void agregarProductoPremium(double precio) {
        this.productosComprados++;
        this.productosPremium++;
        this.totalBrutoAcumulado = this.totalBrutoAcumulado + precio;
    }

    public void factura(){
     System.out.println(">>>>>>>>><<<<<<<<<" + "\n" +
                        "FACTURA DE COMPRA" + "\n" +
                        ">>>>>>>>><<<<<<<<<"
     );
     
     if(this.productosComprados == 0) {
        System.out.println("ERROR : No se registro ningun producto, transaccion cancelada." + "\n" +
                           "CERRANDO CAJA ... "
        );
        return;
        }

        double descuento = 0.0;
        if (this.totalBrutoAcumulado > 100000) {
            descuento = this.totalBrutoAcumulado * 0.10;
        }

        double valorConDescuento = this.totalBrutoAcumulado - descuento;
        double iva = valorConDescuento * 0.19;

        double totalFinal = valorConDescuento + iva;

        double porcentajePremium = ((double) this.productosPremium / this.productosComprados) * 100;
      
        /*IMPRESION D CALCULOS */
        System.out.println("Total de Productos: " + this.productosComprados);
        System.out.println("Total Bruto: $" + this.totalBrutoAcumulado);
        System.out.println("Descuento aplicado: -$" + descuento);
        System.out.println("Subtotal: $" + valorConDescuento);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("TOTAL A PAGAR: $" + totalFinal);
        System.out.println("----------------------------------");
        System.out.println("% de productos PREMIUM: " + porcentajePremium + "%");
        System.out.println("##################################");
            }
        }
