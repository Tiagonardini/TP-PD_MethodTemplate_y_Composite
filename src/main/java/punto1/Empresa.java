package punto1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<IEmpleado> empleados;

    public Empresa (String nombre){
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado (EmpleadoDeLaEmpresa empleado){
        this.empleados.add(empleado);
    }
    public double totalDeSueldosDeLaEmpresa(){
        var total = 0;
        for (IEmpleado empleado: empleados){
            total += empleado.obtenerSueldo();
        }
        return total;
    }


}