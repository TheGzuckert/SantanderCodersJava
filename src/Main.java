import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;


public class Main {
    public static void main(String[] args) {

        Gato gato1 = new Gato(5, "Felix Jr", "Preto");
        Passaro passaro1 = new Passaro(0.5, "Pitocu lindo", "Muitas todas lidas");
        Cachorro cachorro1 = new Cachorro("Fofa Cristina", "Marrom", 5, 5.5, 10, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

    }
}