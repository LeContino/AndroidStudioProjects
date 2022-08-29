package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AdicionarAlimentos extends AppCompatActivity {

    private EditText nome;
    private EditText quantidade;
    private EditText carb;
    private EditText prot;
    private EditText gord;
    private EditText kcal;
    private Button adicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_alimentos);

        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nome = (EditText) findViewById(R.id.editTextAlimento);
                quantidade = (EditText) findViewById(R.id.editTextPorcao);
                carb = (EditText) findViewById(R.id.editTextCarb);
                prot = (EditText) findViewById(R.id.editTextProt);
                gord = (EditText) findViewById(R.id.editTextFat);
                kcal = (EditText) findViewById(R.id.editTextCal);

                OnExit(v);
            }
        });
    }

    public String getAlimento() {
        return nome.toString();
    }

    public  EditText getQuantidade() {
        return quantidade;
    }

    public  EditText getCarb() {

        return carb;
    }

    public  EditText getProt() {

        return prot;
    }

    public  EditText getGord() {

        return gord;
    }

    public  EditText getKcal() {

        return kcal;
    }

    public void OnExit(View view)
    {
        Intent i = new Intent(this, Diario.class);
        startActivity(i);
    }
}

