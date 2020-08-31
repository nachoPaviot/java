/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaejvacunas;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class AulaEjVacunas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*4. Una ONG tiene puntos de reparto de vacunas que se pretende funcionen de la siguiente manera. 
        Cada día, empezar con 1000 vacunas disponibles y a través de un programa que controla las entregas 
        avisar si el inventario baja de 200 unidades. Desarrollar pseudocódigo*/
        int bandera=1, totalV, entregadas, vacunas=1000;
        while (bandera!=0) {
        entregadas=Integer.parseInt(JOptionPane.showInputDialog(null, "Cúantas vacunas se entregaran?"));
        totalV=vacunas-entregadas;
        if (totalV<200) {
          JOptionPane.showMessageDialog(null, "Ojo! Quedan menos de 200 toujeos");
            }
       bandera=Integer.parseInt(JOptionPane.showInputDialog(null, "1 para hacer otro ingreso 0 para salir"));
          }
    }
    }
    

