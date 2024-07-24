import Inventarios.Inventario;
import Inventarios.ProductoEspecifico;
import Empleados.EmpleadoPermanente;
import Empleados.EmpleadoTemporal;
import Empleados.GestionEmpleados;

public class Main {
    public static void main(String[] args) {

        /*ProductoEspecifico producto = new ProductoEspecifico();

        Inventario inventario = new Inventario();

        inventario.añadir(producto);

        inventario.listar();*/

        GestionEmpleados gestion = new GestionEmpleados();

        EmpleadoPermanente permanente = new EmpleadoPermanente();

        EmpleadoTemporal temporal = new EmpleadoTemporal();

        gestion.addEmpleado(permanente);
        gestion.addEmpleado(temporal);
        gestion.addEmpleado(permanente);
        gestion.addEmpleado(temporal);
        gestion.addEmpleado(permanente);
        gestion.addEmpleado(temporal);

        gestion.deleteEmpleado(permanente);
        gestion.deleteEmpleado(temporal);





        /*for (int i = 0; i < gestion.getEmpleados().size(); i++) {
            gestion.getEmpleados().get(i).irTrabajo();
        }*/

        gestion.getEmpleados().forEach(empleado -> empleado.irTrabajo());

    }
}