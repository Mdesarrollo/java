
package ejercicio_propio;

public class Cancha {
    
    public String direccion,nombre,horarios;
    public Persona administrador;
    public int precio,tiempoDeUso;

    public Cancha(String direccion, String nombre, String horarios, Persona administrador, int precio, int tiempoDeUso) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.horarios = horarios;
        this.administrador = administrador;
        this.precio = precio;
        this.tiempoDeUso = tiempoDeUso;
    }
    
    public double calcularAlquiler(){
        
        return precio*tiempoDeUso;
    }
}
