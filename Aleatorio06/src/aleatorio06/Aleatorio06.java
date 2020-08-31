/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio06;

import javax.swing.JOptionPane;
/**
 *
 * @author marciano
 */
public class Aleatorio06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("Hola. Como te llamas?");
        
         int ganoUsuario=0;
         int ganoMaquina=0;
        for (int i = 0; i < 3; i++) {           
            String[] partida=new String[3];
            int manoMatic = (int)(Math.random()*3); // genera un número al azar
            // entre 0 y 2 ambos incluido      
            System.out.println("Se genera al azar piedra, papel o tijera:");
            int manoUsuario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su opción de mano. 1-Piedra, 2-Papel o 3-Tijera"));
            opcionDeMano("Maquina", manoMatic);
            opcionDeMano(nombre, manoUsuario-1);
            partida[i]=quienGanaMano(nombre, manoMatic, manoUsuario-1);
            if (partida[i].equals("Nadie")) {
                i--;
            } else {
                if (partida[i].equals(nombre)) {
                    ganoUsuario++;
                } else {
                    ganoMaquina++;
                }
            }
            if (ganoMaquina==2||ganoUsuario==2) {
                break;
            }
        }
            if (ganoMaquina==2) {
                JOptionPane.showMessageDialog(null, nombre + " PERDISTE el partido!!!!!");
            }
            else{
                if (ganoUsuario==2) {
                    JOptionPane.showMessageDialog(null, nombre + " GANASTE el partido!!!!!");
                } 
            }
    }    
    private static void opcionDeMano(String nombre, int mano){
        System.out.print(nombre + " ");
        switch(mano) {
        case 0:
        System.out.println("piedra");
        break;
        case 1:
        System.out.println("papel");
        break;
        case 2:
        System.out.println("tijera");
        break;
        default:
            //JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }   
    public static String quienGanaMano(String nombre, int manoMatic, int manoUsuario){
        /*0 0 Empate
          0 1 Usuario
          0 2 Maquina
          1 0 M
          1 1 E
          1 2 U
          2 0 U
          2 1 M
          2 2 E*/
        String ganador=nombre;
        if (manoMatic==manoUsuario) {
            System.out.println(nombre + " empataste esta mano!");
            JOptionPane.showMessageDialog(null, nombre + " empataste esta mano!");            
            ganador="Nadie";
        }
        if ((manoMatic==0 && manoUsuario==1)||(manoMatic==1 && manoUsuario==2)||(manoMatic==2 && manoUsuario==0)) {
            System.out.println(nombre + " GANASTE esta mano!!!!!");
            JOptionPane.showMessageDialog(null, nombre + " GANASTE esta mano!!!!!");            
        }
        if ((manoMatic==0&&manoUsuario==2)||(manoMatic==1&&manoUsuario==0)||(manoMatic==2&&manoUsuario==1)) {
            System.out.println(nombre + " PERDISTE esta mano!!!!!");
            JOptionPane.showMessageDialog(null, nombre + " PERDISTE esta mano!!!!!");
            ganador="Maquina";
        }
        return ganador;
    }    
}