/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5aula;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class Ej5Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5) Algoritmo que lea 10 números, calculando su promedio y escribiendo el valor de su suma, y el promedio .*/
       Scanner entrada =new Scanner(System.in);
        int i, suma, num;
        double prom;
        suma=0;
        prom=0;
        for (i=0; i<10; i++) {
        System.out.println("Ingrese un numero");
        num=entrada.nextInt();
        suma=suma+num;
     }  
        prom=suma/10;
        System.out.println ("la suma de los numeros es: " + suma + " el promedio es: " + prom);
        JOptionPane.showMessageDialog(null, "la suma de los numeros es: " +suma+ " El prom " + prom);
       }
    }
