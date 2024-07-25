package Empleados;

public class Empleado extends Persona {

    private Integer idEmpleado;

    private Double salario;

    public Empleado() {
    }

    public Empleado(String nombre, Integer edad, Integer idEmpleado, Double salario) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }


    public void irTrabajo(){
        System.out.println("");
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}