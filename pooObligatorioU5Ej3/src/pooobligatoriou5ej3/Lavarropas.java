
package pooobligatoriou5ej3;

public class Lavarropas extends Electrodomesticos{
    private int carga;
    
    private int cargaDef=5;
    
    public Lavarropas(){
        this.precioBase=precioBaseDef;
        this.color=colorDef;
        this.consumoEnergetico=consumoEnergeticoDef;
        this.peso=pesoDef;
        this.carga=cargaDef;
    }
    
    public Lavarropas(double precioBase, int peso){
        this.precioBase=precioBase;
        this.color=colorDef;
        this.consumoEnergetico=consumoEnergeticoDef;
        this.peso=peso;
        this.carga=cargaDef;
    }
    
    public Lavarropas(double precioBase, String color, char consumoEnergetico, int peso, int carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga=carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double aumento=super.precioFinal();
        if (carga>30) {
          aumento+=10000;
        }
        return aumento;
    }
}
