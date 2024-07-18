import Libro.Libro;
import Libro.Gabriel;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("100 años de soledad", "Gabriel","12/07/2006", true);

        libro.getPrestado();
        libro.setPrestado();


    }

}