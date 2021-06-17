package com.example.listviewanimalsonido;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvNombre2;
    ImageView imgFoto2;
    TextView tvDescripcion2;
    Button btnSonido;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNombre2 = (TextView) findViewById(R.id.tvNombre2);
        imgFoto2 = (ImageView) findViewById(R.id.imgFoto2);
        tvDescripcion2 = (TextView) findViewById(R.id.tvDescripcion2);
        btnSonido = (Button) findViewById(R.id.btnSonido);

        Animal animal = (Animal) getIntent().getSerializableExtra("animal");

        tvNombre2.setText(animal.getNombre());
        imgFoto2.setImageResource(animal.getFoto());
        tvDescripcion2.setText(animal.getDescripcion());


        btnSonido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sonido = animal.getCodigo();


               mp = MediaPlayer.create(SecondActivity.this, sonido);

               mp.start();
            }
        });
    }
}