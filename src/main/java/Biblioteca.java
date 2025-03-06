package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Biblioteca} funciona como una biblioteca y te permite añadir, eliminar y encontrar libros
 * mediante diferentes métodos.
 * @author Nahir Carolina Torres
 * @version Version 1.0
 */
public class Biblioteca {

    /**
     * Variable que va a contener la lista de libros.
     */
    private final List<Libro> libros;

    /**
     * Constructor de la clase biblioteca que crea una lista vacía.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor con parámetro de la clase biblioteca.
     * @param libros, lista de libros para crear la biblioteca.
     */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Devuelve todos los libros de la biblioteca.
     * @return lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Encuentra un libro que coincide con el título en la biblioteca.
     * @param titulo parámetro para realizar búsqueda de libro.
     * @return el libro que coincide con el título o null en caso de no encontrarlo.
     */
    // todo Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated función obsoleta.
     * {@link #encuentraLibrosPorAutor(String)}
     * Encuentra un libro que coincide con el título en la biblioteca.
     * @param autor parámetro para realizar búsqueda de libro.
     * @return el libro que coincide con el autor o null en caso de no encontrarlo.
     */
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Encuentra los libros que coinciden con el autor en la biblioteca.
     * @param autor parámetro para realizar búsqueda de libro.
     * @return los libros que coinciden con el autor o null en caso de no encontrarlo.
     */
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
