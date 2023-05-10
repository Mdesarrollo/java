
package p_o_o;

public class Animales {
    protected int cantidadPatas;

    public Animales(int cantidadPatas) {
        this.cantidadPatas = cantidadPatas;
    }
    
    public String mostrarDatos(){
        
        return "la cantidad de patas es de: "+cantidadPatas;
    }
    
    
    
}
