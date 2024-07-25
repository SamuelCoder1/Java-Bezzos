import Inventarios.Inventario;
import Inventarios.Producto;
import Inventarios.ProductoEspecifico;
import Empleados.EmpleadoPermanente;
import Empleados.EmpleadoTemporal;
import Empleados.GestionEmpleados;

import java.beans.PropertyDescriptor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();

        boolean menu = false;
        while (!menu) {
            System.out.print("Bienvenido, ingrese la opcion que desee:" + "\n" +
                    "1.Añadir producto" + "\n" +
                    "2.Eliminar producto" + "\n" +
                    "3.Listar productos" + "\n" +
                    "4.Buscar producto" + "\n" +
                    "5.Salir" + "\n");

            String opcion = scanner.nextLine();
            switch (opcion){
                case "1":
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el precio del producto: ");
                    Double precio = Double.parseDouble(scanner.nextLine());
                    System.out.println("Ingrese la categoría del producto: ");
                    String categoria = scanner.nextLine();
                    System.out.println("Ingrese la marca del producto: ");
                    String marca = scanner.nextLine();

                    inventario.añadir(nombre, precio, categoria, marca);
                    break;

                case "2":
                    System.out.println("Ingrese el ID del producto a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    inventario.eliminar(idEliminar);
                    break;
                case "3":
                    inventario.listar();
                    break;
                case "4":
                    System.out.println("Ingrese el nombre del producto a buscar: ");
                    String buscarProducto = scanner.nextLine();
                    inventario.buscar(buscarProducto);
                    break;
                case "5":
                    menu = true;
                    break;
            }
        }


       /* GestionEmpleados gestion = new GestionEmpleados();

        EmpleadoPermanente permanente = new EmpleadoPermanente();

        EmpleadoTemporal temporal = new EmpleadoTemporal();

        gestion.addEmpleado(permanente);
        gestion.addEmpleado(temporal);
        gestion.addEmpleado(permanente);
        gestion.addEmpleado(temporal);
        gestion.addEmpleado(permanente);
        gestion.addEmpleado(temporal);

        gestion.deleteEmpleado(permanente);
        gestion.deleteEmpleado(temporal);*/





        /*for (int i = 0; i < gestion.getEmpleados().size(); i++) {
            gestion.getEmpleados().get(i).irTrabajo();
        }

        gestion.getEmpleados().forEach(empleado -> empleado.irTrabajo());


         */
    }


}