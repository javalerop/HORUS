
package co.edu.unal.horus.clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author montenegro & @author valero
 */
public class Principal {
    
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(20);
        i.add(9);
        i.add(1);
        
        List<Integer> f = new ArrayList<>();
        f.add(3);
        f.add(7);
        
        Proceso a = new Proceso("d");
        
        System.out.println(a.duracion_maxima_casos());
    
        
    }
    
}
