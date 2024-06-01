package punto1;

public class EmpleadoRegular extends EmpleadoDeLaEmpresa  implements IEmpleado{

    public EmpleadoRegular(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);
    }

    @Override
    public double obtenerSueldo() {
        return this.sueldo;
    }

    @Override
    public void aCargoDe(IEmpleado empleado) {

    }

}