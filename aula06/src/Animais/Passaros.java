package Animais;

public class Passaros extends Animal {
  
    public Passaros(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, altura, peso, tamanhoDoRabo, estadoDeEspirito);
        //TODO Auto-generated constructor stub
    }

    static int numeroDePassaros;

    @Override
    public void soar() {
      System.out.println("Piu!");        
      }
  

    
    //public Passaros(String nome, String cor, int altura, double pesoo, int tamanhoDoRabo, String estadoDeEspirito);

}