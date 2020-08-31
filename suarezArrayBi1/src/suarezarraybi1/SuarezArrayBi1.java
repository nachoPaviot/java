/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suarezarraybi1;

/**
 *
 * @author florencia
 */
public class SuarezArrayBi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*1. Define un array de números enteros de 3 filas por 6 columnas con
     nombre "num" y asigna los valores según la siguiente tabla:
     num:
            Columna 0   Columna 1   Columna 2   Columna 3   Columna 4   Columna 5
     Fila 0     0          30           2                                   5
     Fila 1    75                                               0
     Fila 2                            -2           9                      11
  
     Muestra el contenido de todos los elementos del array dispuestos en
     forma de tabla como se muestra en la figura.*/ 
       int[][]num=new int[3][6];
       num[0][0]=0;
       num[1][0]=75;
       num[0][1]=30;
       num[0][2]=2;
       num[0][5]=5;
       num[1][4]=0;
       num[2][2]=-2;
       num[2][3]=9;
       num[2][5]=11;
       int fila, columna;
       for (fila = 0; fila<3; fila++) {
           System.out.println();
           for (columna=0; columna<6; columna++) {
               System.out.print(num[fila][columna]);
               System.out.print(" ");
           }
        }
        }
    }
    
