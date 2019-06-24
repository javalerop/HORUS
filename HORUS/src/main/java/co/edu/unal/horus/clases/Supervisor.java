
package co.edu.unal.horus.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author montenegro & @author valero
 */
public class Supervisor {
    
    private String nombre;
    private List<Lider> lideres;

    public Supervisor(String nombre) {
        this.nombre = nombre;
        lideres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Lider> getLideres() {
        return lideres;
    }

    public void setLideres(List<Lider> lideres) {
        this.lideres = lideres;
    }
    
}
