
package poocomplementariou5ej1;

public class Password {
   private int longitud;
   String contraseña;
   
   private int longitudDef=8;

   public Password() {
        this.longitud=longitudDef;
        generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }
   
    public boolean esFuerte(){
        boolean fuerte;
        int contMinus=0, contMayus=0, contNum=0;
        for (int i=0; i<contraseña.length(); i++) {
            if (contraseña.charAt(i)>=48&&contraseña.charAt(i)<=57) {
                contNum++;
            } else {if (contraseña.charAt(i)>=65&&contraseña.charAt(i)<=90) {
                    contMayus++;
                } else {
                contMinus++;
                }
            }
        }
        if (contMayus>2&&contMinus>1&&contNum>5) {
            fuerte=true;
        } else {
            fuerte=false;
        }
        return fuerte;
    }
   
    public String generarPassword(){
        contraseña="";
        for (int i=0; i<longitud; i++) {
            int eleccion=(int)(Math.random()*3+1);
            switch (eleccion) {
                case 1: contraseña+=(char)(Math.random()*9+48);
                break;
                case 2: contraseña+=(char)(Math.random()*25+65);
                break;
                case 3: contraseña+=(char)(Math.random()*25+97);
                break;
            }  
        }
        return contraseña;
    }
}
