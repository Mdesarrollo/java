
package ejerciciios;
import java.util.*;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("Ingrese el valor al que desea hacer el factorial: ");
        int numero = input.nextInt();
        
        int factorial=numero;
        
        if(numero>0){
            System.out.print(numero+"!="+numero);
            
            for(int i=1; i<numero; i++){

                factorial=factorial*i;
                if(i<numero){
                    System.out.print("x"+(numero-i));
                }
            }
            
            System.out.print("="+factorial);
            
        }else if (numero<0){
           
            factorial=factorial*-1;
            numero=numero*-1;
            
            System.out.print(numero+"!="+numero);
            for(int i=1; i<numero; i++){

                factorial=factorial*i;
                if(i<numero){
                    System.out.print("x"+(numero-i));
                }
            }
            
           System.out.print("="+factorial);
            
        }else{
            System.out.println(numero+"!="+numero);
        }
        
        
        
        
    }
}
