
package ejercicio_propio;

public class Alquiler {
    
    public Cancha cancha;
    public Persona arbitro;
    public Persona cliente;

    public Alquiler(Cancha cancha, Persona arbitro, Persona cliente) {
        this.cancha = cancha;
        this.arbitro = arbitro;
        this.cliente = cliente;
    }
}
