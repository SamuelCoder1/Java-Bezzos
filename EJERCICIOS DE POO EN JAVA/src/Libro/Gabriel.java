package Libro;

public class Gabriel extends Libro{

    public Gabriel(String titulo, String autor, String fecha, boolean prestado){
        super(titulo, autor, fecha, prestado);
    }

    @Override
    public boolean getPrestado() {
        return super.getPrestado();
    }
}
