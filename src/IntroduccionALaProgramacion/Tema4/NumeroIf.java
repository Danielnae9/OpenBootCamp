
package IntroduccionALaProgramacion.Tema4;


import java.util.Scanner;


public class NumeroIf {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numeroIf = sc.nextInt();
        
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es negativo");
        }
        
    } 
    
}