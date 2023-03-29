
package p_o_o;

public class Productos {
    
    public String nombreProducto;
    public double precio;

    public Productos(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }
    
    public double calcularPromedio(){
        
       return this.precio;
       
    }
}
