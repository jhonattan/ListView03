package com.example.android.listview03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class TareaArrayAdapter<T> extends ArrayAdapter<Tarea> {

    public TareaArrayAdapter(Context context, List<Tarea> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        //Obteniendo una instancia del inflater - Esta parte siempre se debe colocar
        LayoutInflater inflater = (LayoutInflater)getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Salvando la referencia del View de la fila - tampoco varía esta parte
        View listItemView = convertView;

        //Comprobando si el View no existe
        if (null == convertView) {
            //Si no existe, entonces inflarlo con two_list_view.xml
            listItemView = inflater.inflate(
                    R.layout.two_list_item,// Aquí nombramos al xml que hemos creado
                    parent,
                    false);
        }

        //Obteniendo instancias de los elementos - Acá también se puede cambian
        TextView titulo = (TextView)listItemView.findViewById(R.id.text1);
        TextView subtitulo = (TextView)listItemView.findViewById(R.id.text2);


        //Obteniendo instancia de la Tarea en la posición actual - Se debe cambiar a la clase creada (Tarea) y se llaman a sus métodos
        Tarea item = getItem(position);

        titulo.setText(item.getNombre());
        subtitulo.setText(item.getHora());

        //Devolver al ListView la fila creada
        return listItemView;

    }
}
