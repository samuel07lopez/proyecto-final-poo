package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Samuel David López Sarabia
 * @version 1.0.0
 */
public class Biblioteca {
    
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }
    
    public String mostrarLibros() {
        String result = "";
        for (Libro libro : libros) {
            result = "Nombre: "+libro.getNombre()+"\nAutor: "+libro.getAutor()+"\n\n--------------------\n\n";
        }
        return result;
    }
    
    public boolean agregarLibro(Libro l) {
        if(l != null){
            libros.add(l);
            return true;
        }
        return false;
    }
    
    public Libro buscarLibro(long idLibro) {
        for (Libro libro : libros) {
            if(libro.getId() == idLibro){
                return libro;
            }
        }
        return null;
    }
    
    public int buscarIndexLibro(Libro libro){
        int index = -1;
        for (int i = 0; i < libros.size(); i++) {
            Libro get = libros.get(i);
            if(get == libro) index = i;
        }
        return index;
    }
    
    public boolean actualizarLibro(long id, Libro libro){
        Libro viejo = buscarLibro(id);
        int indice = buscarIndexLibro(viejo);
        if(indice != -1){
            libros.set(indice, libro);
            return true;
        }
        return false;
    }
    
    public boolean eliminarLibro(long id){
        Libro toDelete = buscarLibro(id);
        int index = buscarIndexLibro(toDelete);
        if(index != -1){
            libros.remove(index);
            return true;
        }
        return false;
    }
    public ArrayList<Libro> obtenerLibrosAlfabeticamente(){
        ArrayList<Libro> librosOrdenados = this.libros;
        Collections.sort(librosOrdenados, new Comparator<Libro>() {
            @Override
            public int compare(Libro libro1, Libro libro2) {
                return libro1.getNombre().compareTo(libro2.getNombre());
            }
        });
        return librosOrdenados;
    }
}
