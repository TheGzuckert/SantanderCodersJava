package Animais;

public class Animal {

    // Atributos PAI
    protected String nome;
    protected   String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    public Animal(double peso, String nome, String cor) {
        this.peso = peso;
        this.nome = nome;
        this.cor = cor;
    }

    protected void comer(){}

    protected void dormir(){}

    public void soar(){
        System.out.println(" cri cri ");
    }



}

