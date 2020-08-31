/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejobligatoriou2.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author florencia
 */
public class EjObligatorioU25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*5. Realizar un algoritmo con el siguiente proceso:
       a. Llenar Vector A de manera aleatoria. 
       b. Llenar Vector B de manera aleatoria. 
       c. Realizar C=A+B
       d. Realizar D=B-A 
       e. Mostrar por pantalla los contenidos de los dos Vectores A, B, y los totales de C y D. 
       f. Salir. NOTA. El rango de los números aleatorios para los Vectores será de [-100 a 100]. 
       Validar opción c, d es decir que el rango de los datos sea el correcto. 
       La longitud de los Vectores es la misma, por lo tanto solo se solicitará una vez.*/
      int n, totalC=0, totalD=0;
      n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números va ingresar?"));
      int vectorA[]=new int[n];
      int vectorB[]=new int[n];
      for (int i=0; i<n; i++) {
      vectorA[i]=(int)(Math.random()*(202)-100);
      vectorB[i]=(int)(Math.random()*(202)-100);
        }
      for (int i = 0; i < n; i++) {
      JOptionPane.showMessageDialog(null, "Contenido vector A en la posición "+(i+1)+" es "+vectorA[i]);
        }
      for (int i = 0; i < n; i++) {
      JOptionPane.showMessageDialog(null, "Contenido vector B en la posición "+(i+1)+" es "+vectorB[i]);
      totalC=(vectorA[i])+(vectorB[i]);
      totalD=(vectorB[i])-(vectorA[i]); 
        }
      JOptionPane.showMessageDialog(null, "El total de C es: "+totalC+" El total de D es: "+totalD);
    }
  }
