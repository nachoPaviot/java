
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author florencia
 */
public class Ventanas extends JFrame {
  
  public Ventanas() {
        setSize(300, 300);//Tamaño de ventana
        setTitle("Primera ventana");
        //setLocation(400, 200); //Colocamos ubicación (x, y) de la ventana
        //setBounds(400, 300, 300, 300);//Engloba setLocation y setSize
        setLocationRelativeTo(null);//Centra la venta sin importar el tamaño de pantalla
        setLayout(null);
        IniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//El programa finaliza al cerrar la ventana
    } 
    
  private void IniciarComponentes()  {
       //Etiquetas();
       //CajaDeTexto();
       //Botones();
       //AreaDeTexto();
       //ListaDesplegable();
       Evento();
    }
    
  private void Etiquetas() {
        //Etiqueta con texto
        JLabel etiqueta1=new JLabel();//Crea objeto etiqueta
        etiqueta1.setBounds(100, 20, 50, 20);
        etiqueta1.setText("Hola");//Agrega texto a la etiqueta. Tambien puede ir por parámetro en el objeto
        this.getContentPane().add(etiqueta1);//Coloca etiqueta en la ventana
       
        //Etiqueta con imagen
        /*ImageIcon imagen=new ImageIcon("bayonetta.jpg");//Crea la imagen
        JLabel etiqueta2=new JLabel();//Crea objeto etiqueta
        etiqueta2.setBounds(100, 100, 120, 120);
        //Se coloca la imagen en la etiqueta respetando el tamaño de esta última
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
        this.getContentPane().add(etiqueta2);*/
    }
    
 private void Botones()  {
        //Boton de texto
        JButton boton1=new JButton();//Crea objeto boton
        boton1.setBounds(20, 50, 80, 30);
        boton1.setText("Aceptar");//Agrega texto al boton. Tambien puede ir por parámetro en el objeto
        boton1.setFont(new Font("Arial", 0, 10));//Establece tipo de letra, estilo y tamaño del texto
        boton1.setEnabled(true);//Habilita o desahabilita el boton
        boton1.setMnemonic('p');//Permite presionar el boton con el teclado(alt+letra)
        this.getContentPane().add(boton1);// Coloca boton en la ventana
        
        //Boton de imagen
        /*JButton boton2=new JButton();
        boton2.setBounds(20, 50, 80, 30);
        ImageIcon aceptar=new ImageIcon("images.jpg");//Creamos la imagen
        //Se coloca la imagen en el boton respetando el tamaño de este último
        boton2.setIcon(new ImageIcon(aceptar.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        this.getContentPane().add(boton2);*/
       }
    
private void Evento() {
         //Etiqueta para usar en este método
        JLabel mostrar=new JLabel();
        mostrar.setBounds(20, 200, 200, 20);
        mostrar.setFont(new Font("Arial", 0, 20));
        this.getContentPane().add(mostrar);
        //Caja de texto para este método
         JTextField cajaTexto=new JTextField();
        cajaTexto.setBounds(10, 20, 100, 20);
        cajaTexto.setText("Escriba aquí...");
        this.getContentPane().add(cajaTexto);
        
        JButton boton1=new JButton();//Crea objeto boton
        boton1.setBounds(20, 50, 80, 30);
        boton1.setText("Aceptar");//Agrega texto al boton. Tambien puede ir por parámetro en el objeto
        boton1.setFont(new Font("Arial", 0, 10));//Establece tipo de letra, estilo y tamaño del texto
        boton1.setEnabled(true);//Habilita o desahabilita el boton
        boton1.setMnemonic('p');//Permite presionar el boton con el teclado(alt+letra)
        this.getContentPane().add(boton1);// Coloca boton en la ventana
        
        //Crea evento para mostrar texto ingresado al hacer clic en "Aceptar"
        ActionListener evento=new ActionListener() {
      @Override
        public void actionPerformed(ActionEvent e) {
        mostrar.setText(cajaTexto.getText());
      }
  };
        boton1.addActionListener(evento);
    }
    
    
 private void CajaDeTexto() {
        JTextField cajaTexto=new JTextField();
        cajaTexto.setBounds(10, 20, 100, 20);
        //cajaTexto.setText("Nombre...");
        this.getContentPane().add(cajaTexto);
        //System.out.println(cajaTexto.getText());//Toma el texto de la caja y lo muestra
    }
    
 private void AreaDeTexto() {
        JTextArea areaTexto=new JTextArea();
        areaTexto.setBounds(10, 20, 150, 150);
        areaTexto.setText("Comente aquí");
        areaTexto.append(" gato...");//Anexa mas texto al anterior
        areaTexto.setEditable(true);//Permite al usuario editar el texto preestablecido
        this.getContentPane().add(areaTexto);
        System.out.println(areaTexto.getText());
    }
    
 private void ListaDesplegable() {
        String[] dias=new String[5];//Crea array para establecer contenido de la lista
        dias[0]="lunes";
        dias[1]="martes";
        dias[2]="miércoles";
        dias[3]="jueves";
        dias[4]="viernes";
        JComboBox listaDes=new JComboBox(dias);//Crea la lista desplegable. Se pasa array como parámetro
        listaDes.setBounds(10, 10, 90, 20);
        listaDes.addItem("sabado");//Agrega otro item a la lista
        this.getContentPane().add(listaDes);
    }
}

  