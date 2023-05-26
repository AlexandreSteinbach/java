import Animais.Cachorro;

public class Main {

  public static void main(String[] args) {
    
    Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "nada");

    System.out.println(cachorro1.getNumeroDeCachorros());

    Cachorro cachorro2 = new Cachorro("Rex", "Preto", 35, 5.0, 14, "carinho");

    System.out.println(cachorro2.getNumeroDeCachorros());
    System.out.println(cachorro1.getNumeroDeCachorros());

    System.out.println(cachorro1.toString());
    System.out.println(cachorro2.toString());

    //estudar garbage collector
    //pesquisar sobre debug

  }
}
