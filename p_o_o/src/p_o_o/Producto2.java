
package p_o_o;

public class Producto2 {
    
    public String nombreProducto;
    public double precioProducto;
    public static int contador;
    public static double promedio;

    public Producto2(String nombreProducto, double precioProducto) {
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        contador++;
        this.promedio =promedio+precioProducto;
    }
    
    public static double promedio(){
        
        return promedio/contador;
    }

    @Override
    public String toString() {
        return "Producto2{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
    }
    
    
    
}
