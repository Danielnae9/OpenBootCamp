
package IntroduccionALaProgramacion.Tema3;


public class ClaseCoche {
    
    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        System.out.println(miCoche.getPuertas());
        
        miCoche.aumentarPuertas();
        System.out.println(miCoche.getPuertas());
    }
    
}

class Coche {
    
    private int puertas = 4;
    
    public String getPuertas() {
        return "El coche tiene " + this.puertas + " puertas.";
    }
    
    public void aumentarPuertas() {
        this.puertas++;
    }
    
}