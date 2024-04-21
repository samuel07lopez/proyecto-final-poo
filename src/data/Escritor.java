package data;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Samuel David López Sarabia
 */
public interface Escritor {
    
    public abstract void escribir(ArrayList<String> rutaArchivo) throws IOException;
    
}
