package com.example.trabalhov3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void toastLogar(View view){
        Toast.makeText(
                getApplicationContext(),
                "Logado com sucesso",
                Toast.LENGTH_LONG
        ).show();
        Intent intent = new Intent(getApplicationContext(),TelaInicial.class);
        startActivity(intent);
    }

    public void toastIndoCriarConta(View view){
        Toast.makeText(
                getApplicationContext(),
                "Indo para tela de cadastro...",
                Toast.LENGTH_LONG
        ).show();
        Intent intent = new Intent(getApplicationContext(),CadCliente.class);
        startActivity(intent);
    }

}
