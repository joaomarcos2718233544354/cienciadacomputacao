package app;

public class ProdutoAcabado extends Produto {
    private double numFab;
    private double valorEmbalagem;

    public ProdutoAcabado(String n1){
    super.setNome(n1);
    }
    public void setNome(String n1){
        super.setNome(n1);
    }
    

    public double getNumFab() {
        return this.numFab;
    }

    public void setNumFab(double numFab) {
        this.numFab = numFab;
    }

    public double getValorEmbalagem() {
        return this.valorEmbalagem;
    }

    public void setValorEmbalagem(double valorEmbalagem) {
        this.valorEmbalagem = valorEmbalagem;
    }
}
