/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formejorado;

import java.util.Scanner;

/**
 *
 * @author florencia
 */
public class ForMejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer lista[]=new Integer[5];//Crea array
        Scanner teclado=new Scanner(System.in);
        //for común para cagar array
        for (int i = 0; i <5; i++) {
            System.out.println("Ingrese un numero");
            lista[i]=teclado.nextInt();
        }
        //for each para recorrer array
        for (Integer aux:lista) {
            System.out.println(aux);
        }
    }
}