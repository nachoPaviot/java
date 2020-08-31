
package pooobligatoriou5ej3;

public class Television extends Electrodomesticos{
    private int pulgadas; 
    private boolean sintonizador;
    
    private int pulgadasDef=20;
    private boolean sintonizadorDef=false;

    public Television() {
        this.precioBase=precioBaseDef;
        this.color=colorDef;
        this.consumoEnergetico=consumoEnergeticoDef;
        this.peso=pesoDef;
        this.pulgadas=pulgadas;
        this.sintonizador=sintonizador;
    }
    
    public Television(double  precioBase, int peso) {
        this.precioBase=precioBase;
        this.color=colorDef;
        this.consumoEnergetico=consumoEnergeticoDef;
        this.peso=peso;
        this.pulgadas=pulgadasDef;
        this.sintonizador=sintonizadorDef;
    }
    
    public Television(double precioBase, String color, char consumoEnergetico, int peso, int pulgadas, boolean sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas=pulgadas;
        this.sintonizador=sintonizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }
    
    public boolean getSintonizador(){
        return sintonizador;
    }

    @Override
    public double precioFinal() {
        double aumento=super.precioFinal();
        if (sintonizador==true) {
            aumento+=7000;
        }
        if (pulgadas>40) {
            aumento+=precioBase*0.3;
        }
        return aumento;
    }
}
