
package co.edu.unal.horus.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author montenegro & @author valero
 */
public class Mes {
    
    private String nombre;
    private List<Dia> dias;
    
    public Mes(String nombre) {
        this.nombre = nombre;
        dias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Dia> getDias() {
        return dias;
    }

    public void setDias(List<Dia> dias) {
        this.dias = dias;
    }
    
}
