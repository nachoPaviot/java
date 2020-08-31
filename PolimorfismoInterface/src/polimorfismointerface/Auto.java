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
public class Auto extends Vehiculo{
    int cantPuertas;
    
    public Auto(){
        
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    @Override
    public void Arrancar() {
        System.out.println("Colocamos la llave y la giramos");
    }
    
    
}
