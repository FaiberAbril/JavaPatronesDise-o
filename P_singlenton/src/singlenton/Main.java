
package singlenton;

import com.controllers.Conexion;

public class Main {

    public static void main(String[] args) {
        Conexion c = Conexion.getInstancia();
        c.conectar();
        c.desconectar();       
    }
    
    
    
    
}
