package com.example.android.listview03;

/**
 * Created by ANDROID on 27/08/2016.
 */
public class Tarea {
    private String nombre;
    private String hora;

    public Tarea(String nombre, String hora) {
        this.nombre = nombre;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
