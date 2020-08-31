

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Mercado{
    private ArrayList<Articulos> listaArticulos;
 
    public Mercado() {
        this.listaArticulos=new ArrayList<>();
    }
    
    public void cargarLista(){
        Articulos prod1=new Lacteos("Leche Sancor", "Litros", 1, 20);
        Articulos prod2=new Lacteos("Queso Casamcrem", "Gr", 600, 50);
        Articulos prod3=new Electrodomesticos("Notebook Compaq", "und.", 1, 200000, 12);
        Articulos prod4=new Frutas("Manzanas", "Kg", 1, 64, "Neuquén");
        agregarArticulo(prod1);
        agregarArticulo(prod2);
        agregarArticulo(prod3);
        agregarArticulo(prod4);
    }
    
    public void agregarArticulo(Articulos p){
        listaArticulos.add(p);
    }
    
    public void mostrarArticulos() {
       String lista="";
       for(int i=0; i<listaArticulos.size(); i++){
          lista+=i+1+"-";
          lista+=listaArticulos.get(i);
          lista+="\n";
    }
       JOptionPane.showMessageDialog(null, lista, "Lista de artículos", 1);
   } 
    
    public void articuloMasCaro(){
        Articulos masCaro=listaArticulos.get(0);
        for(Articulos aux: listaArticulos){
            if (aux.compareTo(masCaro)>0) {
                masCaro=aux;
            }
        }
        JOptionPane.showMessageDialog(null, "Producto más caro: "+masCaro.getNombre(), "Producto más caro", 1);
    }
    
     public void articuloMasBarato(){
        Articulos masBarato=listaArticulos.get(0);
        for(Articulos aux: listaArticulos){
            if (aux.compareTo(masBarato)<0) {
                masBarato=aux;
            }
        }
         JOptionPane.showMessageDialog(null, "Producto más barato: "+masBarato.getNombre(), "Producto más barato", 1); 
}
     
     public static void main(String[] args) {
        Conexion conn=new Conexion();
        
    }
}
