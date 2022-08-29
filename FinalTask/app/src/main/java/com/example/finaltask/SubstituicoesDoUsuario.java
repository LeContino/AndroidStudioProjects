package com.example.finaltask;

import java.util.Vector;

public class SubstituicoesDoUsuario{
    public static ListaAlimentos frutas = new ListaAlimentos("Frutas");
    public static ListaAlimentos lacteos;
    public static ListaAlimentos carnes = new ListaAlimentos("Carnes Magras");
    public static ListaAlimentos carbos = new ListaAlimentos("Carboidratos");

    public static void SubstituicoesDoUsuarioFrutas() {
        frutas.addAlimentoParams("Banana", 70, 20, 3, 6, 100);
        frutas.addAlimentoParams("Pera", 100, 10, 3, 6, 60);
        frutas.addAlimentoParams("Bergamota", 120, 20, 3, 6, 100);
    }

    public static void SubstituicoesDoUsuarioLacteos() {
        lacteos = new ListaAlimentos("Lácteos");
        lacteos.addAlimentoParams("Iogurte", 70, 20, 3, 6, 100);
        lacteos.addAlimentoParams("Requeijão", 100, 10, 3, 6, 60);
        lacteos.addAlimentoParams("Leite Desnatado", 120, 20, 3, 6, 100);
    }

    public static void SubstituicoesDoUsuarioCarnes() {
        carnes.addAlimentoParams("Peito de Frango", 70, 20, 3, 6, 100);
        carnes.addAlimentoParams("Bife de Alcatra", 100, 10, 3, 6, 60);
        carnes.addAlimentoParams("Filé de Tilápia", 120, 20, 3, 6, 100);
    }

    public static void SubstituicoesDoUsuarioCarbos() {
        carbos.addAlimentoParams("Arroz Branco",70,20,3,6,100);
        carbos.addAlimentoParams("Arroz Integral",100,10,3,6,60);
        carbos.addAlimentoParams("Batata Inglesa",120,20,3,6,100);
    }

    public static ListaAlimentos getCarne(){
        SubstituicoesDoUsuarioCarnes();
        return carnes;
    }

    public static ListaAlimentos getCarbo(){
        SubstituicoesDoUsuarioCarbos();
        return carbos;
    }

    public static ListaAlimentos getLacteo(){
        SubstituicoesDoUsuarioLacteos();
        return carbos;
    }

    public static ListaAlimentos getFrutas(){
        SubstituicoesDoUsuarioFrutas();
        return frutas;
    }
}