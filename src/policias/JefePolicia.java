package policias;

/**
 * @author migue
 */
public class JefePolicia extends Policia {

    public JefePolicia(String nombre) {
        super("J", nombre);
        this.sueldo += 1000.00;
    }
    
}
