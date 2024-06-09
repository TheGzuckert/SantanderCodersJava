import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Cristina", "Marrom", 25, 5.5, 5, "nada"); // inicnado variavel cachorro

//
        Passaro passaro1 = new Passaro(0.5, "Pipocu", "Muitas todas lindas");
        Gato gato1 = new Gato(5, "Felix Jr", "Preto");


        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


    }
}