package com.catalogo;

public class CajaRegistradora {

/*   ATRIBUTOS */
    private double totalBrutoAcumulado;
    private int articulosComprados;
    private int articulosPremium;


/*CONSTRUCTOR */
public CajaRegistradora() {
    this.totalBrutoAcumulado = 0.0;
    this.articulosComprados = 0;
    this.articulosPremium = 0;
    }

    /* METODOS */

    public void agregarProducto(double precio) {
        this.articulosComprados++;
        this.totalBrutoAcumulado = this.totalBrutoAcumulado + precio;

    }

    public void agregarProductoPremium(double precio) {
        this.articulosComprados++;
        this.articulosPremium++;
        this.totalBrutoAcumulado = this.totalBrutoAcumulado + precio;
    }
}
