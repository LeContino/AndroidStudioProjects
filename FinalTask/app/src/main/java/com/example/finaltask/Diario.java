package com.example.finaltask;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public  class Diario extends Fragment {
    private Button incluir;
    public  TextView ref;
    public  TextView alimento;
    public  TextView qnt;
    public  TextView cal;
    public  TextView carb;
    public  TextView proteina;
    public  TextView gordura;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fr_diario, container, false);

        incluir = (Button) view.findViewById(R.id.Add);
        alimento = (TextView) view.findViewById(R.id.ref1);
        alimento = (TextView) view.findViewById(R.id.al1);
        qnt = (TextView) view.findViewById(R.id.qntd1);
        cal = (TextView) view.findViewById(R.id.kcal1);
        carb = (TextView) view.findViewById(R.id.carb1);
        proteina = (TextView) view.findViewById(R.id.prot1);
        gordura = (TextView) view.findViewById(R.id.gord1);

        incluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), AdicionarAlimentos.class);
                startActivity(i);
            }
        });

        return view;
    }

    public void CadastrarLinha(){
        /*String alimento = getActivity().getIntent().getExtras().getString("alimento");
        String qnt = getActivity().getIntent().getExtras().getString("qnt");
        String cal = getActivity().getIntent().getExtras().getString("cal");
        String carb = getActivity().getIntent().getExtras().getString("carb");
        String prot = getActivity().getIntent().getExtras().getString("proteina");
        String gord = getActivity().getIntent().getExtras().getString("gordura");

        alimento.setText(alimento.getText().toString());
        qnt.setText(qnt.getText().toString());
        cal.setText(cal.getText().toString());
        carb.setText(carb.getText().toString());
        //proteina.setText(prot.getText().toString());
        //gordura.setText(gord.getText().toString());*/
    }
}