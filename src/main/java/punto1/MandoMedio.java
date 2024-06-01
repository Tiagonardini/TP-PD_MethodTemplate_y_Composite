package punto1;
import java.util.ArrayList;
import java.util.List;

public class MandoMedio extends EmpleadoDeLaEmpresa  implements IEmpleado {

    public MandoMedio(String nombre, String apellido, double sueldo) {
        super(nombre, apellido, sueldo);

    }


    @Override
    public double obtenerSueldo() {
        return this.sueldo;
    }

}