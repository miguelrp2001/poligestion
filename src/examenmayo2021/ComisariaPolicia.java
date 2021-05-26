/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmayo2021;

import java.util.ArrayList;
import java.util.Collections;
import policias.Policia;
import policias.PoliciaTransito;
import policias.Multa;

/**
 * @author migue
 */
public class ComisariaPolicia {

    private ArrayList<Policia> policias;

    public ComisariaPolicia() {
        this.policias = new ArrayList();
    }

    public boolean insertarPolicia(Policia policia) {
        boolean añadido = false;

        if (!this.policias.contains(policia)) {
            this.policias.add(policia);
            añadido = true;
        }

        return añadido;
    }

    public String mostrarTodosPoliciasYMultasOrdenadoPorCodigo() {
        String polis = "";
        ArrayList<Policia> poliOrdenado = (ArrayList<Policia>) this.policias.clone();

        Collections.sort(poliOrdenado);

        for (Policia policia : poliOrdenado) {
            polis += policia.toString();
        }

        return polis;
    }

    public String mostrarPoliciasPonenMultas() {
        String polisMultadores = "";

        for (Policia policia : this.policias) {
            if (policia instanceof PoliciaTransito) {
                if (((PoliciaTransito) policia).numeroMultas() > 0) {
                    polisMultadores += policia.toString();
                }
            }
        }

        return polisMultadores;
    }

    public boolean añadirMulta(String codigoPolicia, Multa multa) {
        boolean multado = false;

        for (Policia policia : this.policias) {
            if (policia.getCodigo().equalsIgnoreCase(codigoPolicia)) {
                if (policia instanceof PoliciaTransito) {
                    if (((PoliciaTransito) policia).guardarMulta(multa)) {
                        ((PoliciaTransito) policia).actualizarSueldos();
                        multado = true;
                    }
                }
            }
        }

        return multado;

    }

    public int numMultas() {
        int numMultasTotal = 0;

        for (Policia policia : this.policias) {
            if (policia instanceof PoliciaTransito) {
                numMultasTotal+=((PoliciaTransito)policia).numeroMultas();
            }
        }

        return numMultasTotal;

    }

}
