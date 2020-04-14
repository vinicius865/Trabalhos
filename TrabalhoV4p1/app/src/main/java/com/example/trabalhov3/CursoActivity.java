package com.example.trabalhov3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CursoActivity extends AppCompatActivity {

    private TextView textDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        textDesc = findViewById(R.id.textDesc);

        Bundle desc = getIntent().getExtras();
        String descricao = desc.getString("desc");
        textDesc.setText(descricao);
    }


}
