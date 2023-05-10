
package p_o_o;

public class jirafa extends Animales{
    
    private String tipoComida; 

    public jirafa(String tipoComida, int cantidadPatas) {
        super(cantidadPatas);
        this.tipoComida = tipoComida;
    }

    
    
    @Override
    public String mostrarDatos(){
       
       return super.mostrarDatos()+"\n"+ "su tipo de comida es: "+tipoComida;
    }
    
    
}
