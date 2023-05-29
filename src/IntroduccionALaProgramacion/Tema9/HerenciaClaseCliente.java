
package IntroduccionALaProgramacion.Tema9;


public class HerenciaClaseCliente {
    
    public static void main (String[] args) {
        
        Cliente miCliente = new Cliente(52, 652141971, "Manny Khoshbin", 60000);
        System.out.println(miCliente.getEdad());
        System.out.println(miCliente.getTelefono());
        System.out.println(miCliente.getNombre());
        System.out.println(miCliente.getCredito());
        
        System.out.println();
        
        Trabajador miTrabajador = new Trabajador (57, 657291965, "Ben Mallah", 2800);
        System.out.println(miTrabajador.getEdad());
        System.out.println(miTrabajador.getTelefono());
        System.out.println(miTrabajador.getNombre());
        System.out.println(miTrabajador.getSalario());
    }
    
}

class Persona {
    
    private int edad;
    private int telefono;
    private String nombre;
    
    public Persona() {
        
    }
    
    public Persona (int edad, int telefono, String nombre) {
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    
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

class Cliente extends Persona {
    
    private int credito = 50000;
    
    public Cliente (int edad, int telefono, String nombre, int credito) {
        super(edad, telefono, nombre);
        this.credito = credito;
    }
    
    public int getCredito() {
        return credito;
    }
    
    public void setCredito(int credito) {
        this.credito = credito;
    }
    
}

class Trabajador extends Persona {
    
    private int salario = 1800;
    
    public Trabajador (int edad, int telefono, String nombre, int salario) {
        super(edad, telefono, nombre);
        this.salario = salario;
    }
    
    public int getSalario() {
        return salario;
    }
    
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}