/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suarezaleatorios12;

/**
 *
 * @author florencia
 */
public class SuarezAleatorios12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
    /*12. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
    código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
    entero en un carácter.*/
    int linea=0;
    for(int i=0; i<8000; i++) {
      System.out.print("\033[32m"); // color verde
      System.out.print((char)(Math.random()*95+32));
      if (linea++==60) {
        linea=0;
        Thread.sleep(150);
        System.out.println();
        }
      }
    }   
}
