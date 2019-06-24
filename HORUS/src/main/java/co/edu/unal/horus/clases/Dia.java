
package co.edu.unal.horus.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author montenegro & @author valero
 */
public class Dia {
    
    private String nombre;
    private List<UnidadNegocio> unidades_negocio;
    
    public Dia(String nombre) {
        this.nombre = nombre;
        unidades_negocio = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<UnidadNegocio> getUnidades_negocio() {
        return unidades_negocio;
    }

    public void setUnidades_negocio(List<UnidadNegocio> unidades_negocio) {
        this.unidades_negocio = unidades_negocio;
    }
    
}
