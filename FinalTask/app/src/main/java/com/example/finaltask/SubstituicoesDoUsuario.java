package com.example.finaltask;

import java.util.Vector;

public class SubstituicoesDoUsuario{
    Vector<ListaAlimentos> listaClasses;

    public SubstituicoesDoUsuario() {
        ListaAlimentos frutas1 = new ListaAlimentos("Frutas 1");
        frutas1.addAlimentoParams("Banana",70,20,3,6,100);
        frutas1.addAlimentoParams("Pera",100,10,3,6,60);
        frutas1.addAlimentoParams("Bergamota",120,20,3,6,100);
        listaClasses.add(frutas1);

        ListaAlimentos lacteos = new ListaAlimentos("Lácteos");
        frutas1.addAlimentoParams("Iogurte",70,20,3,6,100);
        frutas1.addAlimentoParams("Requeijão",100,10,3,6,60);
        frutas1.addAlimentoParams("Leite Desnatado",120,20,3,6,100);
        listaClasses.add(lacteos);

        ListaAlimentos carnes = new ListaAlimentos("Carnes Magras");
        frutas1.addAlimentoParams("Peito de Frango",70,20,3,6,100);
        frutas1.addAlimentoParams("Bife de Alcatra",100,10,3,6,60);
        frutas1.addAlimentoParams("Filé de Tilápia",120,20,3,6,100);
        listaClasses.add(carnes);

        ListaAlimentos carbos = new ListaAlimentos("Carboidratos");
        frutas1.addAlimentoParams("Arroz Branco",70,20,3,6,100);
        frutas1.addAlimentoParams("Arroz Integral",100,10,3,6,60);
        frutas1.addAlimentoParams("Batata Inglesa",120,20,3,6,100);
        listaClasses.add(carbos);
    }
    public Vector<ListaAlimentos> getClassesDeAlimentos(){
        return listaClasses;
    }
}