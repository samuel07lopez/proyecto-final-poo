package data;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Samuel David López Sarabia
 */
public interface Lector {
    
    public abstract ArrayList<String> leer(String rutaArchivo) throws IOException;
    
}
