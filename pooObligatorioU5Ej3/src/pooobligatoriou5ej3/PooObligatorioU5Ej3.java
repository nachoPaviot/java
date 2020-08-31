
package pooobligatoriou5ej3;

public class PooObligatorioU5Ej3 {

    public static void main(String[] args) {
      /*3) Crearemos una supeclase llamada Electrodomesticos con las siguientes características:
Sus atributos son preciobase, color, consumo energético(letras entre A y F) y peso. Indica que se podrán heredar.
Por defecto, el color será blanco, el consumo energético será F, el precioBase es de $10000 y el peso de 5 kg. Usa constantes para ello.
Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
Los constructores que se implementaran serán
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con todos los atributos.

Los métodos que implementara serán:
Métodos get de todos los atributos.
comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. 
Se invocara al crear el objeto y no sera visible.
comprobarColor(String color): comprueba que el color es correcto, sino lo es usa el color por defecto. Se invocara al crear el objeto y no será visible.
precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
 
Tablas de Referencias:

Letra  Precio
A      $10000
B      $8000
C      $7000
D      $5000

A) Creamos una subclase llamada Lavarropas con las siguientes características:
Su atributo es carga, además  de los atributos heredados.
Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
 
Los métodos que se implementara serán:
Método get de carga.
precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio $10000, sino es así no se incrementara el precio. 
Llama al método padre y añade el código necesario. Recuerda que las condiciones que hemos visto en la clase Electrodomesticos también deben afectar al precio.

Tamaño          Precio
0 a 19 Kg       $5000
20 a 49 KG      $10000
50 a 70 KG      $17000
Mayor de 70 kg  $25000

b) Creamos una subclase llamada Television con las siguientes características:
Sus atributos son resolución  (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
Los constructores que se implementaran serán:
Un constructor por defecto.
Un constructor con el precio y peso. El resto por defecto.
Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
Método get de resolución y sintonizador TDT.
precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, 
aumentara  $7000 Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.*/
      Electrodomesticos koinor=new Lavarropas();
      Television tv=new Television(20000, "azul", 'B', 10, 45, true);
      
      //System.out.println(koinor.getColor());
      //System.out.println("El precio es: "+koinor.precioFinal());
      System.out.println(tv.getColor());
      System.out.println("El precio es: "+tv.precioFinal());
     
    }
    
}
