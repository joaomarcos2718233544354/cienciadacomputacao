package app;

public class GarrafaDeAgua extends MateriaPrima {
     private double preco;

    public GarrafaDeAgua(String nome, int qtd){
        super(nome, qtd);
    }
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
