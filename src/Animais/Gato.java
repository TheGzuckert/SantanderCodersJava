package Animais;

public class Gato extends Animal {

    // Atributos
    static int numeroDeGatos;

    public Gato(double peso, String nome, String cor) {
        super(peso, nome, cor);
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
