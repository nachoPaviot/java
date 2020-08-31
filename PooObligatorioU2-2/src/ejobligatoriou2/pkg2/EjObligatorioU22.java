/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejobligatoriou2.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class EjObligatorioU22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*2. Realizar un algoritmo que lea un número por teclado. En caso de que ese número sea 0 o menor que 0, 
        se saldrá del programa imprimiendo antes un mensaje de error. 
        Si es mayor que 0, se deberá calcular su cuadrado y la raíz cuadrada del mismo, 
        visualizando el número que ha tecleado el usuario y su resultado (“Del numero X, su potencia es X y su raíz X” ). 
        Para calcular la raíz cuadrada se puede usar la función interna RAIZ(X) que es SQR , 
        y para potencia de POW Nota: para este ejercicio usar la opción gráfica de javax.swing.optionpane , de la teoría dada.*/
        double n, raiz=0, pot=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese un num"));
        if (n>0) {
           raiz=Math.sqrt(n);
           pot=Math.pow(n, 2);
           JOptionPane.showMessageDialog(null, "Del numero "+n+" su raiz es "+raiz+" y su potencia es "+pot);
        } else {
            JOptionPane.showMessageDialog(null, "Ingreso invalido");
        }
    }
    
}
