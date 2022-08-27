package com.example.finaltask;

import java.util.*;

public class ListaAlimentos{
    String nome;//NOME DA CLASSE DE ALIMENTOS
    Vector<Alimento> lista;
    public ListaAlimentos(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void addAlimento(Alimento alimento) {
        lista.add(alimento);
    }
    public void addAlimentoParams(String nome, float quantidade,float carb, float prot, float gord, float kcal) {
        Alimento ali = new Alimento(nome,quantidade,carb,prot,gord,kcal);
        lista.add(ali);
    }
    public Alimento getAlimentoByName(String nome) {
        int size = lista.size();
        int i;
        for(i = 0; i < size; i = i + 1) {
            if(lista.elementAt(i).getNome() == nome) {
                return lista.elementAt(i);
            }
        }
        return null;
    }

    public void removeAlimentoByName(String nome) {
        int size = lista.size();
        int i;
        for(i = 0; i < size; i = i + 1) {
            if(lista.elementAt(i).getNome() == nome) {
                lista.removeElementAt(i);
            }
        }
    }
}