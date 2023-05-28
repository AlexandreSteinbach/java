import Animais.Cachorros;
import Animais.Gatos;
import Animais.Passaros;
import Lojas.Petshop;

public class Main {

  public static void main(String[] args) {
    
    Cachorros cachorro1 = new Cachorros("Puppy", "Marrom", 25, 5.5, 5, "nada");
    Cachorros cachorro2 = new Cachorros("Rex", "Preto", 35, 5.0, 14, "carinho");

    Gatos gato1 = new Gatos("Jade", "Bege", 15, 3.5, 12, "nada");

    Passaros passaro1 = new Passaros("Falcao", "Cinza", 10, 0.6, 5, "nada");

    Petshop petshop = new Petshop();


    // cachorro1.soar();
    // gato1.soar();
    // passaro1.soar();


    petshop.darBanho(cachorro1);
    System.out.println(cachorro1.getEstadoDeEspirito());

    petshop.darBanho(gato1);
    System.out.println(gato1.getEstadoDeEspirito());

    petshop.deixarNoHotel(passaro1);
    System.out.println(passaro1.getEstadoDeEspirito());

    petshop.tosar(cachorro2);
    System.out.println(cachorro2.getEstadoDeEspirito());

  }

}