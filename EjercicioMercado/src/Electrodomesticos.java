

public class Electrodomesticos extends Articulos{
    private int mesesGarantia;

    public Electrodomesticos(String nombre, String unidadDeMedida, double cantidad, double precio, int mesesGarantia) {
        super(nombre, unidadDeMedida, cantidad, precio);
        this.mesesGarantia=mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }
    
    @Override
    public String toString() {
        return "Artículo: "+getNombre()+" /// "+(int)getCantidad()+" "+getUnidadDeMedida()+" /// " +"Precio: $"+getPrecio()+" /// " +"Garantía: "+getMesesGarantia()+" meses";
    }
}