package Animais;

public class Cachorros extends Animal {
  
    static int numeroDeCachorros;

  //construtores
  public Cachorros(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
    super(nome, cor, altura, peso, tamanhoDoRabo, estadoDeEspirito);
    
    numeroDeCachorros ++;
  }

  //metodos
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getTamanhoDoRabo() {
    return tamanhoDoRabo;
  }

  public void setTamanhoDoRabo(int tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  public String getEstadoDeEspirito() {
    return estadoDeEspirito;
  }

  public void setEstadoDeEspirito(String estadoDeEspirito) {
    this.estadoDeEspirito = estadoDeEspirito;
  }

  public static int getNumeroDeCachorros() {
    return numeroDeCachorros;
  }

  public static void setNumeroDeCachorros(int numeroDeCachorros) {
    Cachorros.numeroDeCachorros = numeroDeCachorros;
  }

  public void comer(){};

  public void latir() {
    System.out.println("Au Au");
  }

  public String pegar() {
    return "Bolinha";
  }
  
  public String interagir(String acao) {
   
    switch (acao) {
      case "carinho": this.estadoDeEspirito = "feliz"; break;
      case "nada": this.estadoDeEspirito = "neutro"; break;
      case "vai dormir!": this.estadoDeEspirito = "bravo"; break;
      case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
      default: this.estadoDeEspirito = "neutro"; break;
    }
    return estadoDeEspirito;
  }

  @Override
  public String toString() {
    return "Cachorros [nome=" + nome + ", cor=" + cor + ", altura=" + altura + ", peso=" + peso + ", tamanhoDoRabo="
        + tamanhoDoRabo + ", estadoDeEspirito=" + estadoDeEspirito + "]";

  }

  @Override
  public void soar() {
    System.out.println("Au!");        
    }



}