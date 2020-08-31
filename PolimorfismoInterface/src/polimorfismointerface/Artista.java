/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismointerface;

import java.util.Scanner;

/**
 *
 * @author florencia
 */
public class Artista extends Persona{
    Scanner teclado=new Scanner(System.in);
    String tipoArtista;
    
    @Override
    public void Obtener(){
        super.Obtener();
        System.out.println("Ingrese tipo de artista");
        tipoArtista=teclado.next();
    }
    
    public void setTipoArtista(String tipoArtista){
        this.tipoArtista=tipoArtista;
    }
    
    public String getTipoArtista(){
        return tipoArtista;
    }

    @Override
    public void Cantar() {
        System.out.println("Soy un artista que canta, la laaa");
    }
    
    
}
