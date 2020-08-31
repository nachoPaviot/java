/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejobligatoriou2.pkg4;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class EjObligatorioU24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*4. Suponga un array que contiene N notas de 0 a 10 generados
        aleatoriamente y mostradas en pantalla, de acuerdo a la nota contenida, indicar cuántos estudiantes perteneces al grupo:
        • Bajo de conocimientos de 0-4
        • Regulares de mayor de 4 hasta 5
        • Buenos mayor a 5 hasta 7
        • Muy buenos mayor de 7 a 9
        • Excelentes mayor a 9*/
        int n, i, contBajo=0, contReg=0, contB=0, contMB=0, contE=0;
        n=Integer.parseInt(JOptionPane.showInputDialog("Cuantas notas va ingresar"));
        int notas[]=new int[n];
        for (i = 0; i < n; i++) {
            notas[i]=(int)(Math.random()*11);
           JOptionPane.showMessageDialog(null, notas[i]);
           if (notas[i]>9) {
            contE=contE+1;
            } 
            if (notas[i]>7&&notas[i]<10) {
                contMB=contMB+1;
            } 
            if (notas[i]>5&&notas[i]<8) {
                contB=contB+1;
            }
            if (notas[i]>4&&notas[i]<6) {
                contReg=contReg+1;
            }
            if (notas[i]>=0&&notas[i]<5) {
                contBajo=contBajo+1;
            }
       }
       JOptionPane.showMessageDialog(null, "Alumnos de bajo conocimiento: "+contBajo);
       JOptionPane.showMessageDialog(null, "Alumnos regulares: "+contReg);
       JOptionPane.showMessageDialog(null, "Alumnos buenos : "+contB);
       JOptionPane.showMessageDialog(null, "Alumnos muy buenos: "+contMB);
       JOptionPane.showMessageDialog(null, "Alumnos excelentes: "+contE);
    }
  }
