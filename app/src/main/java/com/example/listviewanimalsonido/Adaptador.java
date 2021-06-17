package com.example.listviewanimalsonido;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    Context miContexto;
    ArrayList<Animal> miLista;

    public Adaptador(Context miContexto, ArrayList miLista) {
        this.miContexto = miContexto;
        this.miLista = miLista;
    }


    @Override
    public int getCount() {
        return miLista.size();
    }

    @Override
    public Object getItem(int position) {
        return miLista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(miContexto);
        view = inflater.inflate(R.layout.item, null);

        ImageView imgFoto = (ImageView)view.findViewById(R.id.imgFoto);
        TextView tvNombre = (TextView)view.findViewById(R.id.tvNombre);
        TextView tvDescripcion = (TextView)view.findViewById(R.id.tvDescripcion);

        tvNombre.setText(miLista.get(position).getNombre());
        tvDescripcion.setText(miLista.get(position).getDescripcion());
        imgFoto.setImageResource(miLista.get(position).getFoto());

        return view;
    }
}
