

public class Frutas extends Articulos{
    private String origen;
    
    public Frutas(String nombre, String unidadDeMedida, double cantidad, double precio, String origen){
        super(nombre, unidadDeMedida, cantidad, precio);
        this.origen=origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return  "Artículo: "+getNombre()+" /// "+getCantidad()+" "+getUnidadDeMedida()+" /// "+"Precio: $"+getPrecio()+" /// "+"Origen: "+getOrigen();
    }       
}