
package p_o_o;

import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /*
        //crear un progrma para identificar si es par o impar
        Par_Impar numero = new Par_Impar();
        numero.numero=2;
        numero.IdentificarParImpar();
        */
        
        /*
        calcualr conversion de monedas
        Moneda valor = new Moneda();
        
        valor.cantidad = 345;
        
        valor.conversion();
        */
        
        
        /*
        Determinar si una persona es mayor de edad o no
        
        System.out.print("ingrese nombre: ");
        String nombre =input.nextLine();
        System.out.print("ingrese edad: ");
        int edad = input.nextInt();
        
        Persona persona1 = new Persona(nombre,edad);
        
        boolean verificacion=persona1.verificarMayorEdad();
        
        if(verificacion){
            System.out.println(persona1.nombre+" Es mayor de edad y su edad es: "+persona1.edad);
        }else{
            System.out.println(persona1.nombre+" NO es mayor de edad y su edad es: "+persona1.edad);
        }
        */
        
        /*
        Productos producto1 = new Productos ("pera",1000);
        Productos producto2 = new Productos ("escoba",3000);
        Productos producto3 = new Productos ("jabon",1000);
        
        DecimalFormat redondear = new DecimalFormat("0.##"); 
        
        double promedio=(producto1.precio+producto2.precio+producto3.precio)/3;
        
        System.out.println("El promedio de ventas de los productos es de: "+ redondear.format(promedio));
        */
        
        Producto2 producto1 = new Producto2("Pudin",4000);
        Producto2 producto2= new Producto2("Galletas",5000);
        Producto2 producto3 = new Producto2("Chocolate",8000);
        Producto2 producto4 = new Producto2("Pan",1000);
        Producto2 producto5 = new Producto2("aceite",7000);
        Producto2 venta[]={producto1,producto5};
        
        Cliente cliente1 = new Cliente("juancho","1092176364");
        
        Venta venta1 = new Venta (cliente1,venta);
//        Venta venta2 = new Venta (producto4,cliente1);
        System.out.println("venta"+venta1);
        System.out.println("cantidad de ventas "+venta1.getCantidad());
        System.out.println("Promedio"+Producto2.promedio());
        
        
        
        
        
        
        
        
    }
    
}
