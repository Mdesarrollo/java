
package p_o_o;


public class Venta {
    
    public Cliente cliente;
    public Producto2 venta[];
    

    public Venta(Cliente cliente, Producto2 venta[]) {
        
        this.cliente = cliente;
        this.venta = venta;
        
    }
    
    public int cantidad(){
        return venta.length;
    }
    
    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", venta=" + venta + '}';
    }
    
    

    

   

    
    
    
    
}
