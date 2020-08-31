/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooobligatoriou4_1b;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author florencia
 */
public class Ventana extends JFrame{
    private JPanel panel=new JPanel();
    private JLabel etiq=new JLabel();
    private JButton boton=new JButton();
    private JComboBox listaDes;
    
    public Ventana() {
        setSize(550, 450);
        setLocationRelativeTo(null);
        setTitle("Flores");
        IniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     }   
        
    private void IniciarComponentes(){
        Paneles();
        Etiquetas();
        Botones();
        ListasDesplegables();
        Eventos();
    }
    private void Paneles(){
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    
    private void Etiquetas(){
        etiq.setBounds(250, 20, 100, 30);
        etiq.setText("Nombre de flor");
        panel.add(etiq);
    }
         
   private void Botones(){
        boton.setBounds(250, 150, 80, 30);
        boton.setText("Aceptar");
        boton.setFont(new Font("Arial", 0, 10));
        panel.add(boton);
   }
      
   private void ListasDesplegables(){
       String[] flores=new String[5];
        flores[0]="Margarita";
        flores[1]="Rosa";
        flores[2]="Lirio";
        flores[3]="Fresia";
        flores[4]="Azucena";
        listaDes=new JComboBox(flores);
        listaDes.setBounds(250, 50, 90, 20);
        panel.add(listaDes);
   }
        
   private void Eventos(){
       ActionListener evento=new ActionListener() {
      @Override
        public void actionPerformed(ActionEvent e) {
          setTitle((String)listaDes.getSelectedItem());
      }
  };
        boton.addActionListener(evento);
 }
}
    
    
    
