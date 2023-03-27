package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListaView();
    }

    public void generarListaView(){
        ArrayAdapter<Inmueble> adapter=new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView lv = findViewById(R.id.miLista);
        lv.setAdapter(adapter);
    }

    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.imageinm1,"juana koslay",123));
        lista.add(new Inmueble(R.drawable.imagesinm2,"juana koslay2",1232));
        lista.add(new Inmueble(R.drawable.imagesinm3,"juana koslay3",1233));
    }
}