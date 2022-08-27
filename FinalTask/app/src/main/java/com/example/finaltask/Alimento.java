package com.example.finaltask;

public class Alimento{
    private String nome;
    private float quantidade;
    private float carb;
    private float prot;
    private float gord;
    private float kcal;

    public Alimento(String nome, float quantidade,float carb, float prot, float gord, float kcal) {
        this.setNome(nome);
        this.setQuantidade(quantidade);
        this.setCarb(carb);
        this.setProt(prot);
        this.setGord(gord);
        this.setKcal(kcal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public float getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }


    public float getCarb() {
        return carb;
    }


    public void setCarb(float carb) {
        this.carb = carb;
    }


    public float getProt() {
        return prot;
    }


    public void setProt(float prot) {
        this.prot = prot;
    }


    public float getGord() {
        return gord;
    }


    public void setGord(float gord) {
        this.gord = gord;
    }


    public float getKcal() {
        return kcal;
    }


    public void setKcal(float kcal) {
        this.kcal = kcal;
    }
}
