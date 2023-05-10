
package p_o_o;

public class Leon extends Animales{
    private String tipoComida;

    public Leon(String tipoComida, int cantidadPatas) {
        super(cantidadPatas);
        this.tipoComida = tipoComida;
    }
    
    @Override
    public String mostrarDatos (){
        
        return super.mostrarDatos()+"\n"+ "su tipo de comida es de: "+tipoComida;
        
    }
    
    
}
