package com.example.app.data.cadastros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.app.R;
import com.example.app.perfil.PerfilHemocentro;

public class CadastroHemocentro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_hemocentro2);

        //Enviar dados cadastrais do hemocentro para o perfil
        Bundle pacote = new Bundle();
        EditText editNomeHemo = findViewById(R.id.editNomeHemo);
        String nome = editNomeHemo.getText().toString();
        pacote.putString("nomeHemo", nome);

        EditText editSenha = findViewById(R.id.editSenhaHemo);
        String senhaHemo = editSenha.getText().toString();
        pacote.putString("senhaHemo", senhaHemo);

        EditText editCnpj = findViewById(R.id.editCnpj);
        String cnpj = editCnpj.getText().toString();
        pacote.putString("cnpjHemo", cnpj);

        EditText editLocalizacao = findViewById(R.id.editLocalizacao);
        String localizacao = editLocalizacao.getText().toString();
        pacote.putString("localizacaoHemo", localizacao);

        EditText editTelefoneHemo = findViewById(R.id.editTelefoneHemo);
        String telefoneHemo = editTelefoneHemo.getText().toString();
        pacote.putString("telefoneHemo", telefoneHemo);

        Intent perfilHemocentro = new Intent(getApplicationContext(), PerfilHemocentro.class);
        perfilHemocentro.putExtras(pacote);
        startActivity(perfilHemocentro);
    }
}