package com.catalogo;

public class CajaRegistradora {

/*   ATRIBUTOS */
    public double totalBrutoAcumulado;
    public int articulosComprados;
    public int articulosPremium;
}

/*CONSTRUCTOR */
public CajaRegistradora(double totalBrutoAcumulado, int articulosComprados, int articulosPremium) {
    this.totalBrutoAcumulado = totalBrutoAcumulado;
    this.articulosComprados = articulosComprados;
    this.articulosPremium = articulosPremium;
}
