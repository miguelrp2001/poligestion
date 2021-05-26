package policias;

/**
 * @author migue
 */
public class Multa {

    private String codigo;
    private double importe;
    private static int numMulta = 100;

    public Multa(double importe) {
        this.codigo = String.format("M-%d", numMulta);
        if (importe > 0) {
            this.importe = importe;
        } else {
            this.importe = 0;
        }
        numMulta++;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getImporte() {
        return importe;
    }

    @Override
    public String toString() {
        return String.format("\tCódigo: %s\n\tImporte: %.1f\n", this.codigo, this.importe);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return this.codigo.equalsIgnoreCase(((Multa)obj).codigo);
    }

    
    
}
