package punto1;

import java.util.ArrayList;
import java.util.List;

public class LiderDeProyecto extends EmpleadoDeLaEmpresa implements IEmpleado  {

    public LiderDeProyecto(String nombre, String apellido, double sueldo){
        super(nombre, apellido, sueldo);

    }



    @Override
    public double obtenerSueldo() {
        return this.sueldo;
    }


}
