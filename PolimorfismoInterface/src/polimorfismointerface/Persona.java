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
abstract class Persona implements Cantante{
    Scanner teclado=new Scanner(System.in);
    String nombre;
    int edad;
    
public Persona(){
    }

public void Obtener(){
    System.out.println("Ingrese nombre");
    nombre=teclado.next();
    do {        
        System.out.println("Ingrese edad"); 
        edad=teclado.nextInt();
    } while (edad<0);
}

public boolean EsMayor(){
    boolean mayor=false;
    if (edad>=18) {
        mayor=true;
    }
    return mayor;
}

public String getNombre(){
    return nombre;
}

@Override
public abstract void Cantar();

}
