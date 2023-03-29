
package p_o_o;

import java.text.DecimalFormat;

public class Moneda {
    public double cantidad;
    private final double  valorDolar=4777.74;
    
    public void conversion(){
        
        DecimalFormat reduccion = new DecimalFormat("0.#");
        double pesosColombianos=cantidad*valorDolar;
        
        System.out.println("la candidad de pesos colombianos es de--"+" $"+reduccion.format(pesosColombianos));
        
    }

    

    

    
    
    
    
}
    

