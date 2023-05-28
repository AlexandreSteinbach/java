package Lojas;

import Animais.Animal;
import Animais.Cachorros;

public class Petshop {

    public void darBanho(Animal animal) {
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorros cachorros) {
        cachorros.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal) {
        animal.setEstadoDeEspirito("Com saudade");
    }

}
