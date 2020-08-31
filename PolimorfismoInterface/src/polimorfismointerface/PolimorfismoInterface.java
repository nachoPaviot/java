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
public class PolimorfismoInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Canario piolin= new Canario();
        Alumno nacho=new Alumno();
        Artista leo=new Artista();
        Auto miAuto=new Auto();
        Avion miAvion=new Avion();
        //piolin.Cantar();
        //nacho.Obtener();
        //nacho.Cantar();
        //leo.Obtener();
        //leo.Cantar();
        miAuto.Arrancar();
        miAvion.Arrancar();
    }
    
}
