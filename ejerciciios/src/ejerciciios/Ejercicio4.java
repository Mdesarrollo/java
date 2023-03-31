
package ejerciciios;
import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner mers = new Scanner (System.in);
        
        System.out.println("Digite la opcion deseada");
        System.out.println("1-convertir a segundos\n2-convertir en formato HH:MM:SS\n3-salir");
        System.out.print("Opcion: ");
        int opcion=mers.nextInt();
        
        
        switch(opcion){
            case 1:
                System.out.println("Digite las horas minutos y segundo que desea convertir ");
                int hora=mers.nextInt();
                int minutos=mers.nextInt();
                int segundos=mers.nextInt();
                
                int segundo1=hora*3600;
                int segundo2=minutos*60;
                
                int totalSegundos=segundo1+segundo2+segundos;
                
                System.out.println("La cantida de segundos en "+hora+":"+minutos+":"+segundos+" es de : "+totalSegundos);
                
                break;
            case 2:
                System.out.println("Ingrese la cantidad de segundos deseadas a convertir");
                totalSegundos=mers.nextInt();
                
                hora=totalSegundos/3600;
                minutos=(totalSegundos%3600)/60;
                segundos=(totalSegundos%3600)%60;
                
                System.out.println("En "+totalSegundos+" segundos existen "+hora+":"+minutos+":"+segundos);
                
                break;
                
            default :
              
                System.out.println("hasta la proxima 😀");
                      
                
        }
    }
}
