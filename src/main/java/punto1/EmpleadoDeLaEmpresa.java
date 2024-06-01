package punto1;

import java.util.ArrayList;
import java.util.List;

public abstract class EmpleadoDeLaEmpresa implements IEmpleado {
    protected String nombre;
    protected String apellido;
    protected double sueldo;

    private List<IEmpleado> empleadosACargo = new ArrayList<>();


    public EmpleadoDeLaEmpresa(String nombre, String apellido, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;

    }

    @Override
    public void aCargoDe(IEmpleado empleado) {
        this.empleadosACargo.add(empleado);
    }
}
