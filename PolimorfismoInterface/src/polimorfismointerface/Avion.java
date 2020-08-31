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
public class Avion extends Vehiculo{
    int cantPasajeros;

    public Avion() {
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    
    public int getCantPasajeros() {
        return cantPasajeros;
    }
    
    @Override
    public void Arrancar(){
        System.out.println("Presionamos boton de encendido y chequeamos instrumental ");
    }
    
}
