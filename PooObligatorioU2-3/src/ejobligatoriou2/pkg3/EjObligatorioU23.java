/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejobligatoriou2.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class EjObligatorioU23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*3. Leer tres números que denoten una fecha (día, mes, año). Comprobar que es una fecha válida. 
        Si no es válida escribir un mensaje de error. Si es válida escribir la fecha cambiando el número del mes por su nombre. 
        Ej. si se introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe ser mayor que 0. 
        (Recuerda la estructura según sea para java ).*/
        int dia, mes, año;
        dia=Integer.parseInt(JOptionPane.showInputDialog("ingrese un dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("ingrese un mes"));
        año=Integer.parseInt(JOptionPane.showInputDialog("ingrese año"));
        if (dia>0&&dia<31&&mes>0&&mes<13&&año>0) {
          switch (mes) {
              case 1: JOptionPane.showMessageDialog(null, dia+" de febrero de "+año);
              break;
              case 2: JOptionPane.showMessageDialog(null, dia+" de enero de "+año);
              break;
              case 3: JOptionPane.showMessageDialog(null, dia+" de marzo de "+año);
              break;
              case 4: JOptionPane.showMessageDialog(null, dia+" de abril de "+año);
              break;
              case 5: JOptionPane.showMessageDialog(null, dia+" de mayo de "+año);
              break;
              case 6: JOptionPane.showMessageDialog(null, dia+" de junio de "+año);
              break;
              case 7: JOptionPane.showMessageDialog(null, dia+" de julio de "+año);
              break;
              case 8: JOptionPane.showMessageDialog(null, dia+" de agosto de "+año);
              break;
              case 9: JOptionPane.showMessageDialog(null, dia+" de septiembre de "+año);
              break;
              case 10: JOptionPane.showMessageDialog(null, dia+" de octubre de "+año);
              break;
              case 11: JOptionPane.showMessageDialog(null, dia+" de noviembre de "+año);
              break;
              case 12: JOptionPane.showMessageDialog(null, dia+" de diciembre de "+año);
              break;
          }
        } else {
            JOptionPane.showMessageDialog(null, "Error. Ingreso fecha invalida");
        }
    }
    
}
