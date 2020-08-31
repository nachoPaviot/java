

import java.sql.Date;

public class Lacteos extends Articulos{
    //private Date vencimiento;
    
    public Lacteos(String nombre, String unidadDeMedida, double cantidad, double precio){
        super(nombre, unidadDeMedida, cantidad, precio);
    }

    /*public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }*/

    @Override
    public String toString(){
            return "Artículo: "+getNombre()+" /// "+getCantidad()+" "+getUnidadDeMedida()+" /// " +"Precio: $"+getPrecio();
    }
}