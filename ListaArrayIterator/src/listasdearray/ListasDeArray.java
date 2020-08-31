/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasdearray;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author florencia
 */
public class ListasDeArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();//Crea ArrayList de strings
        
        //Agrega elementos al ArrayList
        lista.add("Luisi");
        lista.add("Juan");
        lista.add("Flor");
        lista.add("Ramon");
        
        //Método remove para eliminar un elemento
        //lista.remove(1);//Podemos colocar nombre o posición del elemento
       
        //Método size para saber la longitud del ArrayList
        //System.out.println(lista.size());
        
        //Método get para conocer elemento en una posición indicada
        //System.out.println(lista.get(2));
        
        //Método indexOf para saber la posición de un objeto
        //System.out.println(lista.indexOf("Ramon"));
        
        //Método clear para vaciar el ArrayList
        //lista.clear();
        
        //Método isEmpty para saber si el arrayList esta vacío o no
        //System.out.println(lista.isEmpty());
        
        //Método Iterator que recorre el ArrayList
        Iterator<String> it= lista.iterator();
        while (it.hasNext()) {
            String nombre=it.next();
            System.out.println("Nombre: "+nombre);
        }
    } 
}
