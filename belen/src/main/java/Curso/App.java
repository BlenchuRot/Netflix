package Curso;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Pelicula peli = new Pelicula ("Ghost", "Zucker", 1990);

        System.out.println("Hello World!");
    }
}

/*
 * 2.- En el catálogo de Netflix existen películas y series, ambos son
 * contenido, es decir, tienen título, descripción, fecha de publicación,
 * director, productora, etc… A diferencia de las películas, las series no se
 * pueden reproducir directamente, sino que se reproducen sus capítulos, es
 * decir, tanto los capítulos de una serie como las películas son reproducibles,
 * se pueden iniciar, pausar, adelantar y retroceder. Define (indicando
 * propiedades y relaciones pero sin implementar los métodos) la jerarquía de
 * clases e interfaces necesaria para representar el catálogo de Netflix.
 */

interface IReproducible {
    public void iniciar();

    public void pausar();

    public void adelantar();

    public void retroceder();

}

abstract class Contenido {
    String titulo;
    String director;
    int año;
}

class Pelicula extends Contenido implements IReproducible {

    @Override
    public void iniciar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void adelantar() {
    }

    @Override
    public void retroceder() {
    }

}

class Serie extends Contenido {

}

class Capitulo implements IReproducible {

    @Override
    public void iniciar() {
    }

    @Override
    public void pausar() {
    }

    @Override
    public void adelantar() {
    }

    @Override
    public void retroceder() {
    }
}