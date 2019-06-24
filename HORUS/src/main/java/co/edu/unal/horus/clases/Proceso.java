
package co.edu.unal.horus.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author montenegro & @author valero
 */
public class Proceso {
    
    private String nombre;
    private List<Integer> tiempo_duracion;
    private List<Integer> tiempo_drop;

    public Proceso(String nombre) {
        this.nombre = nombre;
        tiempo_duracion = new ArrayList<>();
        tiempo_drop = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(List<Integer> tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }

    public List<Integer> getTiempo_drop() {
        return tiempo_drop;
    }

    public void setTiempo_drop(List<Integer> tiempo_drop) {
        this.tiempo_drop = tiempo_drop;
    }
    
    public int suma_tiempo_duracion(){
        int suma = 0;
        Iterator i =tiempo_duracion.iterator();
        while(i.hasNext()){
            suma += (int) i.next();
        }
        return suma;
    }
    
    public int suma_tiempo_drop(){
        int suma = 0;
        Iterator i =tiempo_drop.iterator();
        while(i.hasNext()){
            suma += (int) i.next();
        }
        return suma;
    }
    
    public int duracion_minima_casos(){
        int minimo = 0;
        if (!tiempo_duracion.isEmpty()) {
            minimo = tiempo_duracion.get(0);
            for (int i = 1; i < tiempo_duracion.size(); i++) {
                if (minimo > tiempo_duracion.get(i)) {
                    minimo = tiempo_duracion.get(i);
                }
            }
        }
        return minimo;
    }
    
    public int duracion_minima_drop(){
        int minimo = 0;
        if (!tiempo_drop.isEmpty()) {
            minimo = tiempo_drop.get(0);
            for (int i = 1; i < tiempo_drop.size(); i++) {
                if (minimo > tiempo_drop.get(i)) {
                    minimo = tiempo_drop.get(i);
                }
            }
        }
        return minimo;
    }
    
    public int duracion_maxima_casos(){
        int maximo = 0;
        if (!tiempo_duracion.isEmpty()) {
            maximo = tiempo_duracion.get(0);
            for (int i = 1; i < tiempo_duracion.size(); i++) {
                if (maximo < tiempo_duracion.get(i)) {
                    maximo = tiempo_duracion.get(i);
                }
            }
        }
        return maximo;
    }
    
    public int duracion_maxima_drop(){
        int maximo = 0;
        if (!tiempo_drop.isEmpty()) {
            maximo = tiempo_drop.get(0);
            for (int i = 1; i < tiempo_drop.size(); i++) {
                if (maximo < tiempo_drop.get(i)) {
                    maximo = tiempo_drop.get(i);
                }
            }
        }
        return maximo;
    }
    
    public double porcentaje_casos_drop(){
        try{
            return (double) tiempo_drop.size() / (tiempo_drop.size() + tiempo_duracion.size())* 100; 
        }catch(Exception e){
            return 0;
        }
    }
    
    public double porcentaje_tiempo_drop(){
        try{
            return (double) suma_tiempo_drop() / (suma_tiempo_duracion() + suma_tiempo_drop())*100;
        }catch(Exception e){
            return 0;
        }
    }
    
}
