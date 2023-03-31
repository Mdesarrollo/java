
package p_o_o;


public class Venta {
    
    public Cliente cliente;
    public Producto2 venta[];
    private int cantidad;
    

    public Venta(Cliente cliente, Producto2 venta[]) {
        
        this.cliente = cliente;
        this.venta = venta;
        this.cantidad=venta.length;
        
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
    
    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", venta=" + venta + '}';
    }
    
    

    

   

    
    
    
    
}
