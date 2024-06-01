package punto1;

public class Director extends EmpleadoDeLaEmpresa implements IEmpleado{
    public Director(String nombre, String apellido, double sueldo){
        super(nombre, apellido, sueldo);
    }

    @Override
    public double obtenerSueldo() {
        return this.sueldo;
    }


}