/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejaulapoo;

/**
 *
 * @author florencia
 */
public class EjAulaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Muestra los números del 1 al 100 (ambos incluidos) divisibles entre
        2 y 3. Utiliza el bucle que desees.*/
        int i;
        for (i=1; i<101; i++) {
          if (i%2==0) {
              System.out.println("Divisible por 2: " + i); 
          }
          }
        for (i=1; i<101; i++) {
             if  (i%3==0) {
                 System.out.println("Divisible por 3: " + i); 
             }
          }        
    }
}
