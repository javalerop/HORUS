
package co.edu.unal.horus.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author montenegro & @author valero
 */
public class Skill {
    
    private String nombre;
    private List<Representante> representantes;

    public Skill(String nombre) {
        this.nombre = nombre;
        representantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Representante> getRepresentantes() {
        return representantes;
    }

    public void setRepresentantes(List<Representante> representantes) {
        this.representantes = representantes;
    }
    
}
