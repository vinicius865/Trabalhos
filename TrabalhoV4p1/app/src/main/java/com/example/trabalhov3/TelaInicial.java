package com.example.trabalhov3;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class TelaInicial extends AppCompatActivity {

    private Button botaoEnviarCC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.config:
                Toast.makeText(getApplicationContext(), "abrir configurações...", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), configuracoes.class);
                startActivity(intent);
                return true;
            case R.id.aulas:
                Toast.makeText(getApplicationContext(), "Acessando menu de aulas...", Toast.LENGTH_LONG).show();
                return true;
            case R.id.simulados:
                Toast.makeText(getApplicationContext(), "Acessando simulados...", Toast.LENGTH_LONG).show();
                return true;
            case R.id.atividades_realizadas:
                Toast.makeText(getApplicationContext(),"Acessando atividades realizadas...",Toast.LENGTH_LONG).show();
                return true;
            case R.id.desempenho:
                Toast.makeText(getApplicationContext(),"Acessando o seu desempenho...",Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onCreateOptionsMenu((Menu) item);


        }
    }
    public void CC(View v) {

        Intent intent = new Intent(getApplicationContext(),CursoActivity.class);

        intent.putExtra("desc", "Ciência da computação é a ciência que estuda as " +
                "técnicas, metodologias, instrumentos computacionais e aplicações tecnológicas, " +
                "que automatizem os processos e desenvolvam soluções de processamento de dados de " +
                "entrada e saída pautado no computador, de forma que se transforme em informação.");

        Toast.makeText(
                getApplicationContext(),
                "Busca realizada com sucesso",
                Toast.LENGTH_SHORT
        ).show();

        startActivity(intent);
    }

    public void ADS(View v) {

        Intent intent = new Intent(getApplicationContext(),CursoActivity.class);

        intent.putExtra("desc", "Análise de sistemas é a atividade que tem como " +
                "finalidade a realização de estudos de processos a fim de encontrar o melhor " +
                "caminho racional para que a informação possa ser processada. Os analistas de " +
                "sistemas estudam os diversos sistemas existentes entre hardwares (equipamentos), " +
                "softwares (programas) e o usuário final.");

        Toast.makeText(
                getApplicationContext(),
                "Busca realizada com sucesso",
                Toast.LENGTH_SHORT
        ).show();

        startActivity(intent);
    }
}
