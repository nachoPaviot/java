/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejguia6flor;


import java.util.Scanner;

/**
 *
 * @author florencia
 */
public class EjGuia6Flor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);//Creamos Scanner para tomar dato por teclado
		double cuadrada;
		double incremento;
		double mitad;
		int num;
		double potencia;
		double reduccion;
		System.out.println("ingrese un numero");
		num = teclado.nextInt();//Guardamos el entero ingresado por el usuario
		mitad = num/2;
		incremento = num+(num*0.5);
		reduccion = num-(num*0.1);
		cuadrada = Math.sqrt(num);
		potencia = Math.pow(num,5);
		System.out.println("mitad: "+mitad+" incremento: "+incremento+" reduccion: "+reduccion+" cuadrada: "+cuadrada+" potencia: "+potencia);
    }
    
}
