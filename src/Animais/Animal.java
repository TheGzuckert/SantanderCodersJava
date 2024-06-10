package Animais;

public abstract class Animal {

    // Atributos PAI
    protected String nome;
    protected   String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;


    // Construtor
    public Animal(double peso, String nome, String cor) {
        this.peso = peso;
        this.nome = nome;
        this.cor = cor;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer(){}

    protected void dormir(){}

    public abstract void soar();

}

