/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5clase;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class Aula5Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5. .En un fichero tenemos las notas de 35 alumnos de una clase en un array Nota(1), Nota(2), ..., Nota(35), 
        establecidas entre cero y 10. Se desea desarrollar el pseudocódigo para un programa 
        que determine la nota media o promedio.*/
        double[]notas=new double[35];
        double sumaN=0;
        int i;
        for (i = 0; i <=34; i++) {
           notas[i]=Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota número " + (i+1)));
            sumaN=sumaN+notas[i];
        }
        JOptionPane.showMessageDialog(null, "el promedio es: " + (sumaN/35));
    }
}
