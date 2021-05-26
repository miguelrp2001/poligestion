package policias;

import java.util.Objects;

/**
 * @author migue
 */
public abstract class Policia implements Comparable<Policia>{
    private final String codigo;
    private final String nombre;
    protected double sueldo;
    private static int ultCodigo = 1;

    public Policia(String letraCodigo, String nombre) {
        this.codigo = letraCodigo + "-" + ultCodigo;
        this.sueldo = 1500.0;
        this.nombre = nombre;
        ultCodigo++;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    /**
     *
     * @param obj
     * @return
     */
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
        final Policia other = (Policia) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Policia o) {
        return this.codigo.compareTo(o.codigo);
    }

    @Override
    public String toString() {
        return String.format("--%s\nCódigo: %s\nNombre: %s\nSueldo: %.1f\n", this.getClass().getSimpleName(), this.codigo, this.nombre, this.sueldo);
        
    }
    
    
}
