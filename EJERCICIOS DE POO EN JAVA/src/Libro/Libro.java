package Libro;

import java.time.LocalDate;
import java.util.Scanner;

public class Libro {

    private String titulo;

    private String autor;

    private String fecha;

    private boolean prestado;

    public Libro(String titulo, String autor, String fecha, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.prestado = prestado;
    }

    public boolean getPrestado(){
        if (!this.prestado){
            System.out.println("Esta libre");
        }else{
            System.out.println("Esta prestado");
        }

        return prestado;
    }

    public void setPrestado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el estado del libro: 0.Prestado y 1.Libre");
        String option = scanner.nextLine();
        if (option.equals("0")){
            this.prestado = true;
            System.out.println("Este libro esta prestado");
        }else if (option.equals("1")){
            this.prestado = false;
            System.out.println("Este libro esta libre");
        }
    }


}
