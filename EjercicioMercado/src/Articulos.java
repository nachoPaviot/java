

public class Articulos implements Comparable<Articulos>{
  protected String nombre, unidadDeMedida;
    protected double cantidad, precio;

    public Articulos(){
    }

    public Articulos(String nombre, String unidadDeMedida, double cantidad, double precio){
        this.nombre=nombre;
        this.unidadDeMedida=unidadDeMedida;
        this.cantidad=cantidad;
        this.precio=precio;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String tipoContenido) {
        this.unidadDeMedida = tipoContenido;
    }
    
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int compareTo(Articulos p) {
        int resultado=0;
        if (this.getPrecio()>p.getPrecio()){
            resultado=1;
        }
            if (this.getPrecio()<p.getPrecio()) {
            resultado=-1;
        }
        return resultado;
    }  
}
