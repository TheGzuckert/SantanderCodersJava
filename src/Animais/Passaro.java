package Animais;

public class Passaro extends Animal {

    // Atributos
    static int numeroDePassaros;

    public Passaro(double peso, String nome, String cor) {
        super(peso, nome, cor);
    }

    @Override
    public void soar() {
        System.out.println("TUI TUI");
    }
}
