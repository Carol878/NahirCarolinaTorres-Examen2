package test.java;

import main.java.Biblioteca;
import main.java.Libro;
import org.junit.Test;

public class TestBiblioteca {

    @Test
    public void testAgregarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El señor de los anillos", "Tolkien", 1954 );
        biblioteca.agregarLibro(libro);
        assert (biblioteca.getLibros().contains(libro)); //Compruebo que el libro está en la biblio
    }

    @Test
    public void testEliminarLibro() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El señor de los anillos", "Tolkien", 1954 );
        biblioteca.agregarLibro(libro);
        biblioteca.eliminarLibro(libro);
        assert (!biblioteca.getLibros().contains(libro)); //Compruebo que el libro no está en la biblio
    }
}
