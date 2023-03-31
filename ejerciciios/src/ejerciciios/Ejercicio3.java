
package ejerciciios;
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner mers = new Scanner (System.in);
        
        System.out.println("Ingrese la nota del primer parcial: ");
        double nota1=mers.nextDouble();
        System.out.println("Ingrese la nota del segundo previo: ");
        double nota2=mers.nextDouble();
        
        double sumador=0;
        int opcion=0;
        int contador=0;
        
        System.out.println("Digite la cantidad que corresponden a la tercera nota del curso");
        opcion=mers.nextInt();
        
        
        
        do{
            System.out.println("Ingrese las notas de la tercera nota");
            double nota3=mers.nextDouble();
            
            sumador+=nota3;
            
            
            contador++;
            
            
            
        }while(contador<opcion);
        
        double nota3=sumador/contador;
        
        System.out.println("Digite la nota del examen final: ");
        double examen=mers.nextDouble();
        
        nota(nota1,nota2,nota3,examen);
        
        
        
    }
    
   static void nota(double nota1,double nota2,double nota3,double examen){
        
        final double  porcentaje1=0.23;
        final double porcentaje2=0.24;
        final double porcentaje3=0.3;
        
       
        nota1=nota1*porcentaje1;
        nota2=nota2*porcentaje1;
        nota3=nota3*porcentaje2;
        examen=examen*porcentaje3;
        
        System.out.println("La nota parcial del primer previo es de: "+Math.round(nota1));
        System.out.println("La nota parcial del seguindo previo es de: "+Math.round(nota2));
        System.out.println("La nota parcial del tercera nota es de: "+Math.round(nota3));
        System.out.println("La nota parcial del examen final es de: "+Math.round(examen));
        
        double notaFinal=nota1+nota2+nota3+examen;
        
        System.out.println("La nota final del curso es de: "+Math.round(notaFinal));
      
    }
}
