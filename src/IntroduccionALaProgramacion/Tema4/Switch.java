
package IntroduccionALaProgramacion.Tema4;


public class Switch {
    
    public static void main(String[] args) {
        
    String estacion = "Primavera";
    
        switch (estacion) {
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            default:
                System.out.println("La estacion es erronea");

        }
    
    }
}