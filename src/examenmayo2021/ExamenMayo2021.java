package examenmayo2021;

import policias.JefePolicia;
import policias.Multa;
import policias.PoliciaTransito;

/**
 * @author migue
 */
public class ExamenMayo2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComisariaPolicia comisaria1 = new ComisariaPolicia();
        
        comisaria1.insertarPolicia(new PoliciaTransito("Sergio"));
        comisaria1.insertarPolicia(new PoliciaTransito("Ernesto"));
        comisaria1.insertarPolicia(new PoliciaTransito("Javier"));
        comisaria1.insertarPolicia(new JefePolicia("Andres"));
        
        comisaria1.añadirMulta("T-1", new Multa(150.0));
        comisaria1.añadirMulta("T-1", new Multa(300.0));
        comisaria1.añadirMulta("T-2", new Multa(700.0));
        
        System.out.println(comisaria1.mostrarTodosPoliciasYMultasOrdenadoPorCodigo());
        
        System.out.println("\n\nEl número de multas de la comisaria 1 es " + comisaria1.numMultas());
        
        System.out.println("\nLos policias que han puesto multas son:\n" + comisaria1.mostrarPoliciasPonenMultas());
        
        
        
        
    }
    
}
