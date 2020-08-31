/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejobligatoriou2.pkg1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class EjObligatorioU21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*1. Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor 
        (recuerda usar la estructura condicional y los operadores lógicos). Usar Scanner.*/
        Scanner teclado=new Scanner(System.in);
        int n1, n2, n3, mayor;
            System.out.println("ingrese el numero");
            n1=teclado.nextInt();
            System.out.println("ingrese el numero");
            n2=teclado.nextInt();
            System.out.println("ingrese el numero");
            n3=teclado.nextInt();
            if (n1>n2&&n1>n3) {
                mayor=n1;
            }
             else {
                if (n2>n1&&n2>n3) {
            mayor=n2;
        }
                else {
                    mayor=n3;
                }
            }
            System.out.println("El mayor es "+mayor);
    }
}
