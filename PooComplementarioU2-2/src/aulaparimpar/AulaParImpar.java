/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaparimpar;

import java.util.Scanner;

/**
 *
 * @author florencia
 */
public class AulaParImpar {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*2. Dados 10 números enteros que se ingresan por teclado, calcular cuántos de ellos son pares, 
     cuánto suman ellos y el promedio de los impares.*/
     Scanner entrada=new Scanner(System.in);
      int i, num, contP=0, contI=0, sumP=0, sumI=0;
      double promI;
      for (i=0; i<10; i++) {
          System.out.println("Ingrese un número");
          num=entrada.nextInt();
          if (num%2==0) {
              contP=contP+1;
              sumP=sumP+num;
          }
          else {
        sumI=sumI+num;
        contI=contI+1;
      }
    }
        System.out.println("La cantidad pares: " + contP + " y la suma de ellos es: " + sumP);
      promI=sumI/contI;
        System.out.println("El promedio impar es: " + promI);
   }  
}
