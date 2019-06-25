
package co.edu.unal.horus.clases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;


/**
 * @author montenegro & @author valero
 */

public class ConstructorClases {
    
    public void leer_excel(String nombre_archivo){
        try{
            FileInputStream archivo = new FileInputStream(nombre_archivo);
            Workbook libro = new Workbook(archivo);
            Sheet hoja = (Sheet) libro.getSheet("Base datos TMC");
            Iterator<Row> iterador_filas = hoja.iterator();
            
            while (iterador_filas.hasNext()) {
                Row siguiente_fila = iterador_filas.next();
                Iterator<Cell> iterador_celdas = siguiente_fila.cellIterator();
                
                while (iterador_celdas.hasNext()) {
                    Cell celda = 
                }
            }
            
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
