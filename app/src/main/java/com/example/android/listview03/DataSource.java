package com.example.android.listview03;

import java.util.ArrayList;
import java.util.List;

public class DataSource {
    static List TAREAS = new ArrayList<Tarea>();

    static{

        TAREAS.add(new Tarea("Tarea 1","09:30"));
        TAREAS.add(new Tarea("Tarea 2","10:00"));
        TAREAS.add(new Tarea("Tarea 3","10:30"));
        TAREAS.add(new Tarea("Tarea 4","12:40"));
        TAREAS.add(new Tarea("Tarea 5","18:00"));

    }

}
