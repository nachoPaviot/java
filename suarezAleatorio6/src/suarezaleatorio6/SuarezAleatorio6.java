/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suarezaleatorio6;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class SuarezAleatorio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int adivinado, i;
       int num=(int) (Math.random()*101);
       //System.out.println(num);
       for (i = 1; i < 6; i++) {
         adivinado=Integer.parseInt(JOptionPane.showInputDialog("Adivina el número secreto entre 0 y 100"));
           if (adivinado==num) {
               JOptionPane.showMessageDialog(null, "Felicidades. Acertaste!!!");
               break;
           } if (adivinado>num) {
               JOptionPane.showMessageDialog(null, "Fallaste. El numero secreto es menor. Te quedan " +(5-i)+" intentos");
           } else {
               JOptionPane.showMessageDialog(null, "Fallaste. El numero secreto es mayor. Te quedan " +(5-i)+" intentos");
               }
        }
        if (i==6) {
            JOptionPane.showMessageDialog(null, "Perdiste la partida");
        }
    }   
}
