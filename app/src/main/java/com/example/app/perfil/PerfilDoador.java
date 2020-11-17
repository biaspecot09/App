package com.example.app.perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app.R;
import com.example.app.data.cadastros.CadastroDoador;

public class PerfilDoador extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_doador);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nome = bundle.getString("nomeUsuario");
        TextView campoUsuario = findViewById(R.id.textDoador);
        campoUsuario.setText(nome);

        String senha = bundle.getString("senhaUsuario");
        TextView textSenha = findViewById(R.id.textSenha);
        textSenha.setText(senha);

        String cep = bundle.getString("cepUsuario");
        TextView textCep = findViewById(R.id.textCep);
        textCep.setText(cep);

        String email = bundle.getString("emailUsuario");
        TextView textEmail = findViewById(R.id.textEmail);
        textEmail.setText(email);

        String telefone = bundle.getString("telefoneUsuario");
        TextView textTelefone = findViewById(R.id.textTelefone);
        textTelefone.setText(telefone);

        String cpf = bundle.getString("cpfUsuario");
        TextView textCpf = findViewById(R.id.textCpf);
        textCpf.setText(cpf);

        String tipo_sanguineo = bundle.getString("tipoSanguineoUsuario");
        TextView textTipoSanguineo = findViewById(R.id.textTipoSanguineo);
        textTipoSanguineo.setText(tipo_sanguineo);

        String sexo = bundle.getString("sexoUsuario");
    }

    public void Instrucoes(View view) {
        Button Instruções = findViewById(R.id.botaoInstrucoes);
        Intent TelaInstrucoes = new Intent(getApplicationContext(), Instrucoes.class);
        startActivity(TelaInstrucoes);
    }

    public void Editar(View view) {
        Button EditarPerfil  = findViewById(R.id.botaoEditarDados);
        Intent cadastroDoador = new Intent(getApplicationContext(), CadastroDoador.class);
        startActivity(cadastroDoador);
    }
}