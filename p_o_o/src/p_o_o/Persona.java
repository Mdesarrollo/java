
package p_o_o;


public class Persona {
    public String nombre;
    public int edad;
    public final int mayor = 18;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    public boolean verificarMayorEdad(){
        
        if(this.edad>=mayor){
            return true;
        }else{
            return false;
        }
    }

    
    
    
}
