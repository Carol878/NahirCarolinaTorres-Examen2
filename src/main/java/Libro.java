package main.java;

/**
 * La clase {@code Libro} tiene atributos de los libros que está en la biblioteca.
 * @author Nahir Carolina Torres
 * @version Version 1.0
 */
public class Libro {

    /**
     * @param titulo de libro.
     * @param autor del libro.
     * @param anioPublicacion del libro.
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Constructor de la clase libro que recibe parámetros.
     * @param titulo de libro.
     * @param autor del libro.
     * @param anioPublicacion del libro.
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Esta función devuelve el autor del libro.
     * @return autor del libro como un String.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Esta función devuelve el año de publicación del libro.
     * @return el año de publicación del libro como un entero.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
