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
public class Alumno extends Persona{
    Scanner teclado=new Scanner(System.in);
    String matricula;

    @Override
    public void Obtener() {
        super.Obtener();
        System.out.println("Ingrese matricula");
        matricula=teclado.next();   
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }

    @Override
    public void Cantar() {
    System.out.println("Soy un alumno, la la la");
    }
    
    
}
