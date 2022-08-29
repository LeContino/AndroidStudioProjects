package com.example.finaltask;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import java.util.Vector;

public class Cardapios extends Fragment {
    private int numbers ;
    public ListaAlimentos listFoodLacteo;
    public ListaAlimentos listFoodFrutas;
    public ListaAlimentos listFoodCarnes;
    public ListaAlimentos listFoodCarb;
    public Alimento Lacteo;
    public Alimento Fruta;
    public Alimento Carne;
    public Alimento Carb;
    private Button Proposicao;
    private Vector<TextView> cardapiosFixo = new Vector<TextView>();
    private int i =0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        SubstituicoesDoUsuario sub = new SubstituicoesDoUsuario();
        listFoodLacteo = sub.getLacteo();
        listFoodFrutas = sub.getFrutas();
        listFoodCarnes = sub.getCarne();
        listFoodCarb = sub.getCarbo();
        cardapiosFixo.add((TextView) getView().findViewById(R.id.CardapioFixo1));
        cardapiosFixo.add((TextView) getView().findViewById(R.id.CardapioFixo2));
        cardapiosFixo.add((TextView) getView().findViewById(R.id.CardapioFixo3));
        cardapiosFixo.add((TextView) getView().findViewById(R.id.CardapioFixo4));
        cardapiosFixo.add((TextView) getView().findViewById(R.id.CardapioFixo5));
        Proposicao = (Button) getView().findViewById(R.id.GeradorDeCardapio);

        Proposicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                geraCardapio();
            }
        });

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fr_cardapios, container, false);
    }

    public void geraCardapio(){
        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();

        //Gera sequência de números inteiros aleatórios
        numbers = gerador.nextInt();
        Lacteo = listFoodLacteo.lista.elementAt(numbers);
        numbers = gerador.nextInt();
        Fruta = listFoodFrutas.lista.elementAt(numbers);
        numbers = gerador.nextInt();
        Carne = listFoodCarnes.lista.elementAt(numbers);
        numbers = gerador.nextInt();
        Carb = listFoodCarb.lista.elementAt(numbers);
        Incluir();
    }

    public void Incluir(){
        cardapiosFixo.elementAt(i).setVisibility(View.VISIBLE);
        cardapiosFixo.elementAt(i).setText("Novo Cardápio");
        i++;
        Cardapio();
    }

    public void Cardapio(){
        Intent i = new Intent(this, MostrarCardapios.class);
        startActivity(i);
    }
}