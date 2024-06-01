package punto2;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements Item {
    private String descripcion;
    private double tiempo;
    private List<Item> tareas;

    public HistoriaDeUsuario (String descripcion, double tiempo){
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.tareas = new ArrayList<>();
    }

    public void agregarTareas(Item tarea){
        this.tareas.add(tarea);
    }
    @Override
    public double calcularTiempo( ) {
        for (Item tarea: tareas){
            tiempo += tarea.calcularTiempo();
        }
        return tiempo;
    }
}