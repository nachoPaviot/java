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
public class PooObligatorioU31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Enunciado: La empresa informática “IPM Tech” necesita llevar un registro de todos sus empleados 
     que se encuentran en la oficina central, para eso ha creado un diagrama de clases que debe incluir lo siguiente:
      1. Empleado
      Atributos: - nombre: tipo cadena (Debe ser nombre y apellido) 
      - cedula: tipo cadena 
      - edad : entero (Rango entre 18 y 45 años) 
       - casado: boolean - salario: tipo numérico doble Métodos: 
      - Constructor con y sin parámetros de entrada 
      - Método que permita mostrar la clasificación según la edad de acuerdo al siguiente algoritmo: 
        Si edad es menor o igual a 21, Principiante Si edad es >=22 y <=35, Intermedio Si edad es >35, Senior. 
      - Imprimir los datos del empleado por pantalla (utilizar salto de línea \n para separar los atributos.
      - Un método que permita aumentar el salario en un porcentaje que sería pasado como parámetro al método.
      2. Programador (Especialización de Empleado). Clase que hereda de Empleado todos los atributos y métodos.
      Atributos:
      lineasDeCodigoPorHora : tipo entero
      lenguajeDominante: tipo cadena
      Metodos: Constructor con y sin parámetos de entrada.*/
    Empleados a = new Empleados("Juan Pérez", "7000", 21, false, 22000);
    Empleados b = new Empleados();
    Programador c = new Programador("John Doe", "6000", 45, true, 40000, 20, "Java");
    Programador d=new Programador();
    //d.AumentoSalario(50);
    c.Imprimir();
    }
}
