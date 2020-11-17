package com.example.app.perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.app.R;
import com.example.app.localizacao.Localizacao;

public class Instrucoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucoes);
    }

    public void Doar(View view) {
        Intent Instrucao = new Intent(getApplicationContext(), Localizacao.class);
        startActivity(Instrucao);
    }
}