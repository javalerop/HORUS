
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
        public void leer_excel(String nombre_archivo){
        try{
            FileInputStream archivo = new FileInputStream(nombre_archivo);
            Workbook libro = new XSSFWorkbook(archivo);
            Sheet hoja = (Sheet) libro.getSheet("Base datos TMC");
            Iterator<Row> iterador_filas = hoja.iterator();
            
            while (iterador_filas.hasNext()) {
                Row siguiente_fila = iterador_filas.next();
                Iterator<Cell> iterador_celdas = siguiente_fila.cellIterator();
                
                while (iterador_celdas.hasNext()) {
                    Cell celda = iterador_celdas.next();
                    
                    switch (celda.getCellType()) {
                        case STRING:
                            System.out.println(celda.getStringCellValue());
                            break;
                        case NUMERIC:
                            System.out.println(celda.getNumericCellValue());
                            break;
                        default:
                            System.out.println(celda.getStringCellValue());
                    }
                    System.out.println(" - ");
                }
                System.out.println("");
            }
            libro.close();
            archivo.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    } 
    } 
    
}
