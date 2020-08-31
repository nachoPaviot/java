
package pooobligatoriou5ej3;

public class Electrodomesticos {
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;
    
    protected double precioBaseDef=10000;
    protected String colorDef="blanco";
    protected char consumoEnergeticoDef='F';
    protected int pesoDef=5;
    
    public Electrodomesticos(){
      this.precioBase=precioBaseDef;
      this.color=colorDef;
      this.consumoEnergetico=consumoEnergeticoDef;
      this.peso=pesoDef;
    }
    
    public Electrodomesticos(double precioBase, int peso){
      this.precioBase=precioBase;
      this.color=colorDef;
      this.consumoEnergetico=consumoEnergeticoDef;
      this.peso=peso;
    }
    
    public Electrodomesticos(double  precioBase, String color, char consumoEnergetico, int peso){
      this.precioBase=precioBase;
      comprobarColor(color);
      comprobarConsumoEnergetico(consumoEnergetico);
      this.peso=peso;
    }
    
    public double getPrecioBase(){
        return precioBase;
    }
    
    public String getColor(){
        return color;
    }
    
    public char getConsumoEnergetico(){
        return consumoEnergetico;
    }
    
    public int getPeso(){
        return peso;
    }
    
    private void comprobarConsumoEnergetico(char consumoEnergetico){
        if(!(consumoEnergetico=='A'||consumoEnergetico=='B'||consumoEnergetico=='C'||consumoEnergetico=='D'||consumoEnergetico=='E'||consumoEnergetico=='F')){
        this.consumoEnergetico=consumoEnergeticoDef;
    }else{
        this.consumoEnergetico=consumoEnergetico;    
        }
    }
    
    private void comprobarColor(String color){
        if (color.equals("blanco")||color.equals("negro")||color.equals("rojo")||color.equals("azul")||color.equals("gris")) {
            this.color=color;
        }else{
            this.color=colorDef;
        }
    }
    
    public double precioFinal(){
        int aumentoE=0, aumentoP=0;
        switch (consumoEnergetico) {
          case 'A': 
            aumentoE=10000;
            break;
          case 'B': 
            aumentoE=8000;
            break;
          case 'C':
            aumentoE=7000;
            break;
          case 'D':
            aumentoE=5000;
            break;
          case 'E':
            aumentoE=4000;
            break;
          case 'F':
            aumentoE=2000;
            break;
        }
          if (peso>=0&&peso<=19) {
            aumentoP=5000;
            } if (peso>=20&&peso<=49) {
            aumentoP=10000;
            } if (peso>=50&&peso<=70) {
            aumentoP=17000;
            } if (peso>70) {
            aumentoP=25000;
        }  
        return precioBase+aumentoE+aumentoP;
    }
    
}
