package Animais;

public class Gatos {

  static int numeroDeGatos;
  private String nome;
  private String cor;
  private int altura;
  private double peso;
  private String estadoDeEspirito;


  public Gatos(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.estadoDeEspirito = estadoDeEspirito;
  
    numeroDeGatos ++;

  }

  void comer() {}

  void dormir() {}

  void soar() {
    System.out.println("Miau");
  }

  @Override
  public String toString() {
    return "Gatos [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", estadoDeEspirito="
        + estadoDeEspirito + "]";
  }
  
  

}
