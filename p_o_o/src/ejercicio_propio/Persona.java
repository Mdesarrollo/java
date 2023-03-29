
package ejercicio_propio;

public class Persona {
   
    public String direccion,celular,sexo,id,nombre;
    public int añoDeNacimiento;
    public final int añoActual=2023;

    public Persona(int añoDeNacimiento, String direccion, String celular, String sexo, String id, String nombre) {
        this.añoDeNacimiento = añoDeNacimiento;
        this.direccion = direccion;
        this.celular = celular;
        this.sexo = sexo;
        this.id = id;
        this.nombre = nombre;
    }

    
    public int CalcularEdad(){
        
        return añoActual-añoDeNacimiento;
    }
    
}
