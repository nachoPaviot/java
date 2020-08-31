package ejerciciosats;

import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import jdk.internal.org.objectweb.asm.commons.GeneratorAdapter;

public class EjerciciosAts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJER VIDEO 14
        /*Scanner teclado = new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        System.out.println("ingrese 3 calificaciones");
        nota1 = teclado.nextFloat();
        nota2= teclado.nextFloat();
        nota3= teclado.nextFloat();
        suma=nota1+nota2+nota3;
        
        System.out.println ("La suma es" +suma);*/
        
        //EJER VIDEO 15
        /*Scanner teclado= new Scanner (System.in);
        float guillermo, luis, juan, total;
        
        System.out.println("ingrese la cantidad de dolares de guillermo");
        guillermo=teclado.nextFloat();
        luis=guillermo/2;
        juan= (guillermo+luis) /2;
        total=guillermo+luis+juan;
        System.out.println("el total es" +total);*/
        
        //Ejer video 16
        
       /* Scanner teclado= new Scanner (System.in);
        float participacion,parcial1,parcial2,examenfinal, notafinal;
        
        System.out.println("ingrese nivel de participacion");
        participacion=teclado.nextFloat();
       System.out.println("ingrese nota parcial 1");
         parcial1=teclado.nextFloat();
         System.out.println("ingrese nota parcial 2");
          parcial2=teclado.nextFloat();      
          System.out.println("ingrese examen final");      
         examenfinal=teclado.nextFloat();  
         
         participacion*=0.1f;
         parcial1*=0.25f;
         parcial2*=0.25f;
         examenfinal*=0.4f;
         notafinal=participacion+parcial1+parcial2+examenfinal;
         
           System.out.println("lanota final es" +notafinal);*/
       
     //Ejer video 17
              /*  Scanner teclado=new Scanner (System.in);
                int horastotales,semanas, dias, horas;
                
                System.out.println("Digite cantidadde horas totales");
                horastotales=teclado.nextInt();
                semanas=horastotales/168;
                dias= horastotales%168/24;
                horas=horastotales%24;
                
                System.out.println("la cantidad de semanas es" +semanas);
                 System.out.println("la cantidad de dias es" +dias);
                 System.out.println("la cantidad de horass es" +horas);*/
              
     //Ejer video 20
     
     /*Scanner teclado= new Scanner (System.in);
     int num1, num2, mayor;
     
        num1=Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("ingrese segundo numero"));
        
        if (num1>num2){
            JOptionPane.showMessageDialog(null,"el mayor num es" +num1);
        }
        if (num2>num1) {
           JOptionPane.showMessageDialog(null,"el mayor num es" +num2); 
        } else {
            JOptionPane.showMessageDialog(null,"los nros son iguales");*/
     
     //Ejer video 22
     
    /* int horastrabajadas;
     float salariototal;
     
     horastrabajadas=Integer.parseInt(JOptionPane.showInputDialog("digite el total de horas trabajadas"));
     if (horastrabajadas<=40){
         salariototal=horastrabajadas*16;
         }
     else{
salariototal=(40*16)- ((horastrabajadas-40)*20);
    }
JOptionPane.showMessageDialog(null, "el salario total es" +salariototal);
    }*/

    

//Ejer video 24
//hacer un programa que tome dos num y diga si ambos  son pares e impares
int dia,mes,año;
            
dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia: "));
mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes: "));
año = Integer.parseInt(JOptionPane.showInputDialog("digite el año: "));

if(dia>=1 && dia=<30){
    if((mes>=1) && (mes<=12)){
        if (año!=0){
            JOptionPane.showMessageDialog(null,"fecha correcta");  
    } else {
        JOptionPane.showMessageDialog(null,"fecha incorrecta");
}
    }
} 

















     