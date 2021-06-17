package com.example.listviewanimalsonido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvAnimales;
    Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAnimales=(ListView)findViewById(R.id.lvAnimales);

        ArrayList<Animal> listaAnimales = new ArrayList<>();

        Animal animal1 = new Animal("Gallina", "La más feliz del Corral", R.drawable.animal1, R.raw.animal1);
        Animal animal2 = new Animal ("Vaca", "Me da leche merengada... Ay, pero qué salada", R.drawable.animal2, R.raw.animal2);
        Animal animal3 = new Animal ("Perro", "Chindawn, Manolito", R.drawable.animal3, R.raw.animal3);
        Animal animal4= new Animal ("Burro", "Pero qué guapo eres!", R.drawable.animal4, R.raw.animal4);

        listaAnimales.add(animal1);
        listaAnimales.add(animal2);
        listaAnimales.add(animal3);
        listaAnimales.add(animal4);

        adaptador = new Adaptador(this, listaAnimales);
        lvAnimales.setAdapter(adaptador);

        lvAnimales.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Animal animal = (Animal)adaptador.getItem(position);
                Intent i = new Intent(getApplicationContext(), SecondActivity.class);
                i.putExtra("animal", animal);
                startActivity(i);
            }
        });



    }
}