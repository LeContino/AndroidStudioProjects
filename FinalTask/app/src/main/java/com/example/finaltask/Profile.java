package com.example.finaltask;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Profile extends Fragment {

    private EditText nome,idade,peso,calorias,proteinas,gorduras,carboidratos;
    Button salvar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fr_profile, container, false);

        nome = (EditText) view.findViewById(R.id.editTextName);
        idade = (EditText) view.findViewById(R.id.editTexIdade);
        peso = (EditText) view.findViewById(R.id.editTextPeso);
        calorias = (EditText) view.findViewById(R.id.editTextCalorias);
        proteinas =(EditText) view.findViewById(R.id.editTextProteinas);
        carboidratos = (EditText) view.findViewById(R.id.editTextCarboidratos);
        gorduras = (EditText) view.findViewById(R.id.editTextGorduras);
        salvar = (Button) view.findViewById(R.id.btSubmit);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(), "Dados salvos", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}