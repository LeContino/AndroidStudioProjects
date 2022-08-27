package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.R.drawable;
import android.view.View;
import android.widget.EditText;

public class AdicionarAlimentos extends AppCompatActivity {

    private EditText refeicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_alimentos);

        refeicao = (EditText) findViewById(R.id.editTextRefeicao);
    }

    public void OnExit(View view)
    {
        Intent i = new Intent(this, Fragment3.class);
        startActivity(i);
    }
}

