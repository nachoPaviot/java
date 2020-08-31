/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooobligatoriou3.pkg1;

/**
 *
 * @author florencia
 */
public class Empleados {
    String nombre;
    String cedula;
    int edad;
    boolean casado;
    double salario;
 
public Empleados() {
    nombre="Nacho";
    cedula="5000";
    edad=35;
    casado=false;
    salario=24000;
    }
   
 public Empleados(String nombre, String cedula, int edad, boolean casado, double salario) {
    this.nombre=nombre;
    this.cedula=cedula;
    this.edad=edad;
    this.casado=casado;
    this.salario=salario;
    }
 
 public String Clasificacion(){
    String clasif="";
    if (edad<=21) {
        clasif="Principiante";
    }  
    if (edad>21 && edad<=35) {
        clasif="Intermedio";
    }
    if (edad>35) {
        clasif="Senior";
    }
    return clasif;
 }
 
public String EstadoCivil(){
    String estadoCivil;
    if (casado==true) {
        estadoCivil="Casado/a";
    }  else {
        estadoCivil="Soltero/a";
        }
   return estadoCivil;
}

public void AumentoSalario(double porcentajeAumento) {
    salario=salario+((salario*porcentajeAumento)/100);
}

public void Imprimir(){
    System.out.println("Nombre: "+nombre+"\nCédula: "+cedula+"\nEdad: "+edad+"\nEstado civil: "+EstadoCivil()+"\nTipo de empleado: "+Clasificacion()+"\nSalario: $"+salario);
}
}
