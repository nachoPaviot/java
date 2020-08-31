/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismointerface;

/**
 *
 * @author florencia
 */
abstract class Vehiculo{
    String fabricante, matricula;
    int añoFabricacion;

    public Vehiculo() {
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public abstract void Arrancar();
}
