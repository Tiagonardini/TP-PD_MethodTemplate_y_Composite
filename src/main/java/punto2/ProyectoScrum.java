package punto2;

import java.util.ArrayList;
import java.util.List;

public class ProyectoScrum {
    private String nombreDeProyecto;
    private List<Item> itemsDeTrabajo;


    public ProyectoScrum (String nombreDeProyecto){
        this.nombreDeProyecto = nombreDeProyecto;
        this.itemsDeTrabajo = new ArrayList<>();
    }

    public void agregarItemsDeTrabajo(Item itemDeTrabajo){
        this.itemsDeTrabajo.add(itemDeTrabajo);
    }

    public double tiempoQueTomaHacerlo(){
        var tiempo = 0;
        for (Item item: itemsDeTrabajo){
            tiempo += item.calcularTiempo();
        }
        return tiempo;
    }




}