
package ejerciciios;
import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite la cantidad de asteriscos deseados para la imagen");
        int cantidadAsteriscos=input.nextInt();
        System.out.println("ingrese la cantidad de veces que desea que se repita ");
        int repeticion=input.nextInt();

        for(int m=0; m<repeticion; m++){
            for(int i=0; i<cantidadAsteriscos; i++){
            
                for(int j=i; j<cantidadAsteriscos; j++ ){

                    if(j!=0 || j==0){
                        System.out.print("*");
                    }
                }
                System.out.println(" ");
            }
            
        }
    }
    
}
