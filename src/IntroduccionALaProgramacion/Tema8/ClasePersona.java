
package IntroduccionALaProgramacion.Tema8;


public class ClasePersona {
    
    public static void main(String[] args) {
        
        Persona miPersona = new Persona();
        
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getTelefono());
        System.out.println(miPersona.getNombre());
        
        miPersona.setEdad(33);
        miPersona.setTelefono(633131989);
        miPersona.setNombre("Taylor Swift");        
        
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getTelefono());
        System.out.println(miPersona.getNombre());
        
    }
    
}

class Persona {
    
    private int edad = 41;
    private int telefono = 641291981;
    private String nombre = "Fernando Alonso";
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}