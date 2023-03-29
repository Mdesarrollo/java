
package p_o_o;

public class Cliente {
    public String nombre;
    public String id;

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", id=" + id + '}';
    }
    
    
}
