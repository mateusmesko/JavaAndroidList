package com.example.viewres.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.viewres.R;
import com.example.viewres.activity.adapter.Adapter;
import com.example.viewres.activity.model.Filme;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView reciclador;
    private List<Filme> listaFilmes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        reciclador = findViewById(R.id.recyclerView);

        //listagem de filmes
        this.criarFilmes();

        //adapter
        Adapter adapter = new Adapter(listaFilmes);
        //recicle view
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        reciclador.setLayoutManager(layoutManager);
        reciclador.setHasFixedSize(true);
        reciclador.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        reciclador.setAdapter( adapter );

    }

    public void criarFilmes(){
        Filme filme = new Filme("Alto da compadecida","comedia","1987");
        this.listaFilmes.add(filme);
    }

}
