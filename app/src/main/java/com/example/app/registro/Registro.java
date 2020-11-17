package com.example.app.registro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.app.R;
import com.example.app.data.cadastros.CadastroDoador;
import com.example.app.data.cadastros.CadastroHemocentro;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    //Ao clicar no doador, ir para o perfil.
    public void Doador(View view) {
        Button doador = findViewById(R.id.doador);
        Intent cadastroDoador = new Intent(getApplicationContext(), CadastroDoador.class);
        startActivity(cadastroDoador);
    }

    //Ao clicar no hemocentro, ir para o perfil.
    public void Hemocentro(View view) {
        Button hemocentro = findViewById(R.id.hemocentro);
        Intent cadastroHemocentro = new Intent(getApplicationContext(), CadastroHemocentro.class);
        startActivity(cadastroHemocentro);
    }
}