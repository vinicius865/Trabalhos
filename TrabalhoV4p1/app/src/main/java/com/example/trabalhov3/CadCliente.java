package com.example.trabalhov3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadCliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad);
    }

    public void toastCadastrar(View view){
        Toast.makeText(
                getApplicationContext(),
                "Cadastrado com sucesso",
                Toast.LENGTH_LONG
        ).show();
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }

    public void toastVoltar(View view){
        Toast.makeText(
                getApplicationContext(),
                "Voltando para a tela inicial...",
                Toast.LENGTH_LONG
        ).show();
    }
}
