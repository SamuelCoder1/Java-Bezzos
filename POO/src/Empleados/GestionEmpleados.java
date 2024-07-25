package Empleados;
import java.util.ArrayList;

public class GestionEmpleados {

    ArrayList<Empleado> empleados = new ArrayList<>();

    public GestionEmpleados() {
    }

    public void addEmpleado(Empleado emp){
        this.empleados.add(emp);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void deleteEmpleado(Empleado emp){
        this.empleados.remove(emp);
    }
}