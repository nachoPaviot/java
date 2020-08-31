
package poocomplementariou5ej2;

public class Videojuegos implements Entregable{
    private String titulo, genero, compañia;
    private int horasEstimadas;
    private boolean entregado;
    
    private String tituloDef="", generoDef="", compañiaDef="";
    private int horasEstimadasDef=10;
    private boolean entregadoDef=false;
    public static int mayor=1, menor=-1, igual=0;

    public Videojuegos() {
        this.titulo=tituloDef;
        this.genero=generoDef;
        this.compañia=compañiaDef;
        this.horasEstimadas=horasEstimadasDef;
        this.entregado=entregadoDef;
    }

    public Videojuegos(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = generoDef;
        this.compañia = compañiaDef;
        this.horasEstimadas = horasEstimadas;
        this.entregado = entregadoDef;
    }

    public Videojuegos(String titulo, String genero, String compañia, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
        this.horasEstimadas = horasEstimadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    @Override
    public void entregar() {
        entregado=true;
    }

    @Override
    public void devolver() {
        entregado=false;
    }

    @Override
    public boolean isEntregado() {
        return entregado;
    }

    @Override
    public int compareTo(Object a) {
        int estado=igual;
        //Hacemos un casting de objetos para usar el metodo get
        Videojuegos ref=(Videojuegos)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=mayor;
        }else if(horasEstimadas<ref.getHorasEstimadas()){
            estado=menor;
        }
        return estado;
       }
    
    @Override
    public String toString() {
        return "Título: "+titulo+"\n"+"Género: "+genero+"\n"+"Desarrolladora: "+compañia+"\n"+"Horas estimadas: "+horasEstimadas;
    }      
}
