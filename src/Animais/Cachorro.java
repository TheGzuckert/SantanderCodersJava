package Animais;

import jdk.dynalink.beans.StaticClass;

public class Cachorro extends Animal {

    // Atributos

    static int numerosDeCachorros;

    private int tamanhoDoRabo;

    // Contrutores Padráo

    // Construtor adicionado / generico criado pela ide ou devs
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(peso, nome, cor);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numerosDeCachorros ++;
    }


    // Metodos
    public static int getNumerosDeCachorros() {
        return numerosDeCachorros;
    }

    public static void setNumerosDeCachorros(int numerosDeCachorros) {
        Cachorro.numerosDeCachorros = numerosDeCachorros;
    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
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

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }


    public String pegar(){
        return "pegou a bolinha";
    }


    public String interagir(String acao) {

        switch (acao){
            case "carinho": this.estadoDeEspirito = "Feliz";
            break;
            case "vai dormir": this.estadoDeEspirito = "Bravo";
                break;
            case "pisar na patinha": this.estadoDeEspirito = "Triste";
                break;
            default: this.estadoDeEspirito = "Neutro";
        }

        return this.estadoDeEspirito;
  }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("AU AU!");
    }
}