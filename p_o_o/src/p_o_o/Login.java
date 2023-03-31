
package p_o_o;

class Login {
    
    private String usuario;
    private String clave;
    private boolean activo;
    
    public void mostrarDatos(){
        System.out.println("El ususario es: "+this.usuario+" y su clave es: "+this.clave);
    }
    
    public void modificarDatos(String user){
        this.usuario=user;
    }

    public Login(String usuario, String clave, boolean activo) {
        this.usuario = usuario;
        this.clave = clave;
        this.activo = activo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
    

}

class Main{
    public static void main(String[] args) {
        Login login1 = new Login("luis21", "123456", true);
        
        // enviar datos sin constructor
        //        login1.usuario="luis21";
        //        login1.clave="123456";
        //        login1.activo=true;
        
        //mostrar datos originales
        login1.mostrarDatos();
        //modificar nombre de datos primarios
        //login1.modificarDatos("carlos");
        //mostrar datos modificados
        login1.mostrarDatos();
        //esto no le presetes atencion ajjajaja
        System.out.println(" 😀\n-👙-\n ||");
        //cambiar contraseña de la clase login
        login1.setClave("hola");
        //tarer dato de la clave desde la clase login
        String claveNueva=login1.getClave();
        
        System.out.println("La contraseña es: "+claveNueva);
        
        login1.mostrarDatos();
    }
}