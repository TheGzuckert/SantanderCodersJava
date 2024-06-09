package Lojas;

import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;

public class Petshop {

    public void darBanhho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Animal animal){
        animal.setEstadoDeEspirito("Cortado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("Com saudade");
    }

}
