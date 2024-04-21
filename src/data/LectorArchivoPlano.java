package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 *
 * @author Samuel David López Sarabia
 */
public class LectorArchivoPlano implements Lector{
    
    private ArrayList<String> lineasArchivo;
    private final Charset charset = Charset.forName("UTF-8");

    public LectorArchivoPlano() {
        this.lineasArchivo = new ArrayList<>();
    }
    
    @Override
    public ArrayList<String> leer(String rutaArchivo) throws IOException {
        this.lineasArchivo.clear();
        File file =  null;
        FileReader reader = null;
        BufferedReader buffer = null;
        
        file = new File(rutaArchivo);
        reader = new FileReader(file);
        buffer = new BufferedReader(reader);
        
        String linea;
        while ((linea= buffer.readLine())!=null ) { 
            this.lineasArchivo.add(linea);
        }
        
        reader.close();
        return this.lineasArchivo;
    }
    
}
