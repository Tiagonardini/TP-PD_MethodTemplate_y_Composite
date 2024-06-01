package punto1;

import java.util.List;

public class Gerente extends EmpleadoDeLaEmpresa  implements IEmpleado {
    public Gerente(String nombre, String apellido, double sueldo){
        super(nombre, apellido, sueldo);
    }

    @Override
    public double obtenerSueldo() {
        return this.sueldo;
    }

}