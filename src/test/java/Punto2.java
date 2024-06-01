

import org.junit.Test;
import punto2.*;

import static org.junit.Assert.assertEquals;

public class Punto2 {
    @Test
    public void main(){
        var proyectoS1 = new ProyectoScrum("Servidor Tiago");
        var historiaU1 = new HistoriaDeUsuario("A", 20.00);
        var spike = new Spike("fghj", 50.00);
        var tarea = new TareaX("crear base de datos", 90.00);

        historiaU1.agregarTareas(tarea);

        proyectoS1.agregarItemsDeTrabajo(historiaU1);
        proyectoS1.agregarItemsDeTrabajo(spike);

        assertEquals(160.00,proyectoS1.tiempoQueTomaHacerlo(),0.001);


    }

}