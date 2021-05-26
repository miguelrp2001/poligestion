package policias;

import java.util.ArrayList;

/**
 * @author migue
 */
public class PoliciaTransito extends Policia {

    private ArrayList<Multa> multas;
    private double extraMultas = 0;

    public PoliciaTransito(String nombre) {
        super("T", nombre);
        this.multas = new ArrayList();
    }

    @Override
    public String toString() {
        return super.toString() + "-- MULTAS --\n" + todasMisMultas();
    }

    public String todasMisMultas() {
        String multasString = "";

        for (Object multa : this.multas) {
            multasString += multa.toString();
        }

        return multasString;

    }

    public boolean guardarMulta(Multa multa) {
        boolean multado = false;

        if (!this.multas.contains(multa)) {
            this.multas.add(multa);
            multado = true;
        }

        return multado;
    }

    public void actualizarSueldos() {
        this.sueldo -= this.extraMultas;
        double totalMultas = 0;

        for (Multa multa : this.multas) {
            totalMultas += multa.getImporte();
        }
        extraMultas = totalMultas * 0.10;
        this.sueldo += this.extraMultas;
    }

    public int numeroMultas() {
        return this.multas.size();
    }
    
    
}
