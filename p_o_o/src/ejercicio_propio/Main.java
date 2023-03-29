
package ejercicio_propio;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        Persona persona1 = new Persona(2004,"juan23","3142987642","masculino","1092175796","raul");
        Persona persona2 = new Persona(2004,"landia","3142985555","femenino","1092175796","Karla");
        Persona persona3 = new Persona(2004,"santaclara","3142985345","masculino","1092175796","carlos");
        Cancha cancha1=new Cancha("marabel","play","1-8:am-12:pm--2-2pm-5pm",persona1,5000,2);
        Alquiler alquiler1= new Alquiler(cancha1,persona2,persona3);
        
        System.out.println("__Factura de Alquiler__");
        System.out.println("");
        System.out.println("_______Cancha_______");
        System.out.println("Direccion: "+alquiler1.cancha.direccion);
        System.out.println("Nombre: "+alquiler1.cancha.nombre);
        System.out.println("Horarios: "+alquiler1.cancha.horarios);
        System.out.println("Adminitrador: "+alquiler1.cancha.administrador.nombre);
        System.out.println("Precio: "+alquiler1.cancha.precio);
        System.out.println("Tiempo de Uso: "+alquiler1.cancha.tiempoDeUso);
        System.out.println("_______arbitro______");
        System.out.println(alquiler1.arbitro.nombre);
        System.out.println("Edad: "+alquiler1.arbitro.CalcularEdad());
        System.out.println("_______Cliente______");
        System.out.println(alquiler1.cliente.nombre);
        System.out.println("Pago Total : "+cancha1.calcularAlquiler());
         
        
        
    }
}
