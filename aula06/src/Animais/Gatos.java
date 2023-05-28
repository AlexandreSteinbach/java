package Animais;

public class Gatos extends Animal {

    public Gatos(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso, tamanhoDoRabo, estadoDeEspirito);
        //TODO Auto-generated constructor stub
    }

    static int numeroDeGatos;
  

    @Override
    public void soar() {
      System.out.println("Miau!");        
      }
  

}
