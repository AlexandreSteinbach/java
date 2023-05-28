package Animais;

public abstract class Animal {

    static int numeroDeGatos;
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected int tamanhoDoRabo;
    protected String estadoDeEspirito;



    public Animal(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }


    
    public static int getNumeroDeGatos() {
        return numeroDeGatos;
    }



    public static void setNumeroDeGatos(int numeroDeGatos) {
        Animal.numeroDeGatos = numeroDeGatos;
    }



    public String getNome() {
        return nome;
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



    public void comer() {}

    public void dormir() {}
  
    public void soar() {
      System.out.println("Cri");
    }

}
