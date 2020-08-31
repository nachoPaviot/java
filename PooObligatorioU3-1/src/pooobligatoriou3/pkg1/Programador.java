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
public class Programador extends Empleados {
    private int lineasCodigo;
    private String lenguajeDominante;
    
public Programador() {
    nombre="Nacho";
    cedula="5000";
    edad=35;
    casado=false;
    salario=24000;
    lineasCodigo=25;
    lenguajeDominante="C++";
}
   
 public Programador(String nombre, String cedula, int edad, boolean casado, double salario, int lineas, String lenguaje) {
    super (nombre, cedula, edad, casado, salario);
    this.nombre=nombre;
    this.cedula=cedula;
    this.edad=edad;
    this.casado=casado;
    this.salario=salario;
    this.lineasCodigo=lineas;
    this.lenguajeDominante=lenguaje;
    }

    @Override
    public void Imprimir() {
        super.Imprimir(); 
        System.out.println("Líneas de código p/hr: "+lineasCodigo+"\nLenguaje dominante: "+lenguajeDominante);
    }
 }
