package com.example.finaltask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdicionarAlimentos extends AppCompatActivity {
    private Diario d = new Diario();
    private EditText nome;
    private EditText quantidade;
    private EditText carbo;
    private EditText prot;
    private EditText gord;
    private EditText kcal;
    private Button adicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_alimentos);

        nome = (EditText) findViewById(R.id.editTextAlimento);
        quantidade = (EditText) findViewById(R.id.editTextPorcao);
        carbo = (EditText) findViewById(R.id.editTextCarb);
        prot = (EditText) findViewById(R.id.editTextProt);
        gord = (EditText) findViewById(R.id.editTextFat);
        kcal = (EditText) findViewById(R.id.editTextCal);
        adicionar =(Button) findViewById(R.id.Adicionar);


        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //CadastrarLinha();
                MostrarTela();
                OnExit(v); // retorna a tela anterior
            }
        });
    }

    public void MostrarTela(){
        d.alimento.setVisibility(View.VISIBLE);
        d.qnt.setVisibility(View.VISIBLE);
        d.cal.setVisibility(View.VISIBLE);
        d.carb.setVisibility(View.VISIBLE);
        d.proteina.setVisibility(View.VISIBLE);
        d.gordura.setVisibility(View.VISIBLE);
    }

    /*public void CadastrarLinha(){
        d.alimento.setText(data);
        d.qnt.setText(quantidade.getText().toString());
        d.cal.setText(kcal.getText().toString());
        d.carb.setText(carbo.getText().toString());
        d.proteina.setText(prot.getText().toString());
        d.gordura.setText(gord.getText().toString());
    }*/

    public void OnExit(View view)
    {
        Intent i = new Intent(this, Diario.class);
        i.putExtra("alimento", nome.getText().toString());
        i.putExtra("qnt", quantidade.getText().toString());
        i.putExtra("cal", kcal.getText().toString());
        i.putExtra("carb", carbo.getText().toString());
        i.putExtra("proteina", prot.getText().toString());
        i.putExtra("gordura", gord.getText().toString());
        //d.CadastrarLinha();
        startActivity(i);
    }
}

