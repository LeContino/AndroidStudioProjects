package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Profile extends AppCompatActivity {

    private EditText nome,idade,peso,calorias,proteinas,gorduras,carboidratos;
    Button salvar;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nome = (EditText) findViewById(R.id.editTextName);
        idade = (EditText) findViewById(R.id.editTexIdade);
        peso = (EditText) findViewById(R.id.editTextPeso);
        calorias = (EditText) findViewById(R.id.editTextCalorias);
        proteinas =(EditText) findViewById(R.id.editTextProteinas);
        carboidratos = (EditText) findViewById(R.id.editTextCarboidratos);
        gorduras = (EditText) findViewById(R.id.editTextGorduras);
        salvar = (Button) findViewById(R.id.btSubmit);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Dados salvos", Toast.LENGTH_SHORT).show();
            }
        });
    }
}