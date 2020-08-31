/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanchezarraybi2;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class SanchezArrayBi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*2. Escribe un programa que pida 20 números enteros.
    Estos números se deben introducir en un array de 4 filas por 5 columnas.
    El programa mostrará las sumas parciales de filas y columnas igual que
    si de una hoja de cálculo se tratara.
    La suma total debe aparecer en la esquina inferior derecha.*/
    int[][]num=new int[4][5];
    int fila, columna, sumFila=0, sumCol=0, sumTotal=0;
    //Lleno el array
    for (fila=0; fila<4; fila++) {
        for (columna=0; columna<5; columna++) {
           num[fila][columna]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero"));
        }
      } 
    //Mostrar valores del array y la suma de cada fila
    for(fila = 0; fila < 4; fila++) {
      sumFila = 0;
      for(columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumFila += num[fila][columna];
      }
      System.out.printf("|%7d\n", sumFila);
}
    //Mostrar valores de cada columnas y suma total de la hoja de calculo
     for (columna=0; columna<5; columna++) {
            sumCol=0;
        for (fila=0; fila<4; fila++) {
           sumCol=sumCol+num[fila][columna];
           sumTotal=sumTotal+num[fila][columna];
            }
         System.out.println("Total columna "+(columna+1)+": "+sumCol);
        }
        System.out.println("Total: "+sumTotal);
    }
}
