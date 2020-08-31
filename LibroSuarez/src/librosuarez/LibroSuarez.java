/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librosuarez;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class LibroSuarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int suma=0;
    int i;
    for (i=0; i<3; i++) {
    int num = (int) (Math.random()*6+1);
    System.out.println("El dado " + (i+1) + " fue " + num);
    JOptionPane.showMessageDialog(null, "El dado " + (i+1) + " fue " + num);
    suma=suma+num;
    }
    System.out.println("la suma de los 3 dados es: " + suma);
    JOptionPane.showMessageDialog(null, "La suma de los 3 dados es: " + suma);
    }
    
}
