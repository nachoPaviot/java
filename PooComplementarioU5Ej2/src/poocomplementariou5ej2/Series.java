
package poocomplementariou5ej2;

public class Series implements Entregable{
    private String titulo, creador, genero; 
    private int nTemporadas;
    private boolean entregado;
    
    private String tituloDef="", creadorDef="", generoDef=""; 
    private int nTemporadasDef=3;
    private boolean entregadoDef=false;
    public static int mayor=1, menor=-1, igual=0;

    public Series() {
        this.titulo=tituloDef;
        this.creador=creadorDef;
        this.genero=generoDef;
        this.nTemporadas=nTemporadasDef;
        this.entregado=entregadoDef;
    }

    public Series(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = generoDef;
        this.nTemporadas = nTemporadasDef;
        this.entregado = entregadoDef;
    }

    public Series(String titulo, String creador, String genero, int nTemporadas) {
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.nTemporadas = nTemporadas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setnTemporadas(int nTemporadas) {
        this.nTemporadas = nTemporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public int getnTemporadas() {
        return nTemporadas;
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
        Series ref=(Series)a;
        if (nTemporadas>ref.getnTemporadas()){
            estado=mayor;
        }else if(nTemporadas<ref.getnTemporadas()){
            estado=menor;
        }
        return estado;
    }
    
    @Override
    public String toString() {
       return "Título: "+titulo+"\nDirector: "+creador+"\nGénero: "+genero+"\n"+"Temporadas: "+nTemporadas;
    }
    }

